
import evento.Evento;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Evento e1 = null;
        boolean eventoCreato = false;
        while (!eventoCreato){
            try {
                System.out.println("Prego inserire un nuovo evento con annessi i suoi parametri: ");
                
                System.out.println("Titolo: ");
                String titolo = scan.nextLine();
        
                System.out.println("Data (YYYY-MM-DD): ");
                String dataS = scan.nextLine();
                LocalDate data = LocalDate.parse(dataS);
        
                System.out.println("Numero dei posti totali: ");
                int postiTotali = scan.nextInt();
                scan.nextLine();
                
                e1 = new Evento(titolo, data, postiTotali);
                eventoCreato = true;
                System.out.println("Inserimento evento avvenuto con successo.");
                System.out.println(e1.toString());
            } catch (Exception e) {
                System.err.println("I dati inseriti per creare il nuovo evento non sono validi: " + e.getMessage());
            }

        }

        

        System.out.println("Vuole eseguire prenotazioni? (si/no)");
        String risposta = scan.nextLine();
        

        if(risposta.equalsIgnoreCase("si")){

            System.out.println("Quanti posti vuole prenotare?");
            int numeroPrenotazioni = 0;

            try {
                numeroPrenotazioni = scan.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Input non valido, nessuna prenotazione effettuata.");
            }

            if (numeroPrenotazioni > 0){
                for (int i = 0; i < numeroPrenotazioni; i++) {
                    try {
                        e1.prenota();
                    } catch (Exception e) {
                        System.err.println("Impossibile effettuare la prenotazione: " + e.getMessage());
                        break;
                    }
                }
                System.out.println(numeroPrenotazioni + " " + "prenotazioni effettuate.");
            } else {

            }
        }
        
        
    }
}
