
import concerto.Concerto;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* Evento e1 = null;
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


        System.out.println("\nVuole eseguire prenotazioni? (si/no)");
        String rispostaP = scan.nextLine();

        if(rispostaP.equalsIgnoreCase("no")){
            System.out.println("\nNon si vogliono eseguire prenotazioni.");
        } else {
            System.out.println("Quanti posti vuole prenotare?");
            int numeroPrenotazioni = 0;

            try {
                numeroPrenotazioni = scan.nextInt();
                scan.nextLine();

            } catch (InputMismatchException e) {
                System.err.println("Input non valido, nessuna prenotazione effettuata.");
                scan.nextLine();
            }

            if (numeroPrenotazioni > (e1.getPostiTotali() - e1.getPostiPrenotati())){
                System.err.println("Errore: il numero di prenotazioni richiesto supera i posti disponibili. Non sarà effettuata alcuna prenotazione.");
                System.out.println("\nI posti prenotati sono: " + e1.getPostiPrenotati() + ", i posti ancora disponibili sono: " + (e1.getPostiTotali() - e1.getPostiPrenotati()));
            } else if (numeroPrenotazioni > 0) {
                for (int i = 0; i < numeroPrenotazioni; i++) {
                    try {
                        e1.prenota();
                    } catch (IllegalStateException e) {
                        System.err.println(e.getMessage());
                        break;
                    }
                }
                System.out.println("\nI posti prenotati sono: " + e1.getPostiPrenotati() + ", i posti ancora disponibili sono: " + (e1.getPostiTotali() - e1.getPostiPrenotati()));
            }
        }
        
        

        System.out.println("\nVuole eseguire disdette? (si/no)");
            String rispostaD = scan.nextLine();
            

            if(rispostaD.equalsIgnoreCase("no")){
                System.out.println("Non si vogliono eseguire disdette.");
            } else {
                System.out.println("Quanti posti vuole disdire?");
                int numeroDisdette = 0;

                try {
                    numeroDisdette = scan.nextInt();

                } catch (InputMismatchException e) {
                    System.err.println("Input non valido, nessuna disdetta effettuata.");

                }

                if (numeroDisdette > e1.getPostiPrenotati()){
                    System.err.println("Errore: non si possono disdire più posti di quelli che sono prenotati.");
                    System.out.println("\nI posti prenotati sono: " + e1.getPostiPrenotati() + ", i posti ancora disponibili sono: " + (e1.getPostiTotali() - e1.getPostiPrenotati()));

                } else if (numeroDisdette > 0){
                    for (int i = 0; i < numeroDisdette; i++) {
                        try {
                            e1.disdici();
                        } catch (IllegalStateException e) {
                            System.err.println(e.getMessage());
                            break;
                        }
                    }
                    System.out.println("\nI posti prenotati sono: " + e1.getPostiPrenotati() + ", i posti ancora disponibili sono: " + (e1.getPostiTotali() - e1.getPostiPrenotati()));
                }
            } */
            


            Concerto c1 = null;
            boolean concertoCreato = false;
            while (!concertoCreato){
                try {
                    System.out.println("\nPrego inserire i dati del nuovo concerto: ");
                    
                    System.out.println("Titolo: ");
                    String titolo = scan.nextLine();

                    System.out.println("Data (YYYY-MM-DD): ");
                    String dataS = scan.nextLine();
                    LocalDate data = LocalDate.parse(dataS);
            
                    System.out.println("Numero dei posti totali: ");
                    int postiTotali = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Orario (HH:mm): ");
                    String oraS = scan.nextLine();
                    LocalTime ora = LocalTime.parse(oraS);

                    System.out.println("Prezzo del biglietto: ");
                    double prezzo = scan.nextDouble();
                    scan.nextLine();
                    
                    c1 = new Concerto(titolo, data, postiTotali, ora, prezzo);
                    concertoCreato = true;
                    System.out.println("Inserimento evento avvenuto con successo.");
                    System.out.println(c1.toString());

                } catch (Exception e) {
                    System.err.println("I dati inseriti per creare il nuovo evento non sono validi: " + e.getMessage());
                    scan.nextLine();
                }

            }
            
    }
}
