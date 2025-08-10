
import evento.Evento;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Prego inserire un nuovo evento con annessi i suoi parametri: ");
        
        System.out.println("Titolo: ");
        String titolo = scan.nextLine();

        System.out.println("Giorno: ");
        int giorno = scan.nextInt();

        System.out.println("Mese: ");
        int mese = scan.nextInt();

        System.out.println("Anno: ");
        int anno = scan.nextInt();

        System.out.println("Numero dei posti totali: ");
        int postiTotali = scan.nextInt();

        Evento e1 = new Evento(titolo, LocalDate.of(anno, mese, giorno), postiTotali);

        
        System.out.println("Vuole eseguire prenotazioni? (si/no)");
        scan.nextLine();
        String risposta = scan.nextLine();

        if(risposta.equalsIgnoreCase("si")){
            System.out.println("Quanti posti vuole prenotare?");
            
        }
        
        
    }
}
