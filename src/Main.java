
import evento.Evento;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import programmaEventi.ProgrammaEventi;

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
                System.out.println("\nNon si vogliono eseguire disdette.");
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
            }
            


            /* Concerto c1 = null;
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

                    System.out.println("\nInserimento evento avvenuto con successo.");
                    System.out.println(c1.toString());

                } catch (Exception e) {
                    System.err.println("I dati inseriti per creare il nuovo evento non sono validi: " + e.getMessage());
                    scan.nextLine();
                }
            }


            System.out.println("\nL'orario scelto è: " + c1.getOra());
            System.out.println("Il prezzo è: " + c1.getPrezzo());
            c1.setOra(LocalTime.parse("14:30"));
            c1.setPrezzo(200.99);
            System.out.println("\nIl giorno e l'orario scelto sono: " + c1.getDataOraForm());
            System.out.println("Il prezzo formattato è: " + c1.getPrezzoForm()); */

            
            
            Evento e2 = null;
            boolean eventoCreato2 = false;
            while (!eventoCreato2){
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
                    
                    e2 = new Evento(titolo, data, postiTotali);
                    eventoCreato2 = true;
                    System.out.println("Inserimento evento avvenuto con successo.");
                    System.out.println(e2.toString());

                } catch (Exception e) {
                    System.err.println("I dati inseriti per creare il nuovo evento non sono validi: " + e.getMessage());
                }
            }

            Evento e3 = null;
            boolean eventoCreato3 = false;
            while (!eventoCreato3){
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
                    
                    e3 = new Evento(titolo, data, postiTotali);
                    eventoCreato3 = true;
                    System.out.println("Inserimento evento avvenuto con successo.");
                    System.out.println(e3.toString());

                } catch (Exception e) {
                    System.err.println("I dati inseriti per creare il nuovo evento non sono validi: " + e.getMessage());
                }
            }

            System.out.println("\nPrego inserire il nome del nuovo programma eventi: ");
            String programmaEventi = scan.nextLine();
            ProgrammaEventi p1 = new ProgrammaEventi(programmaEventi);
            p1.aggiungiEvento(e1);
            p1.aggiungiEvento(e2);
            p1.aggiungiEvento(e3);
            System.out.println("\nIl numero degli eventi presenti nella lista è: " + p1.getNumeroEventi());
            //p1.svuotaLista();
            //System.out.println("\nIl numero degli eventi presenti nella lista è: " + p1.getNumeroEventi());
            
            LocalDate dataRicerca = LocalDate.of(2026, 12, 12);
            List<Evento> eventiDelGiorno = p1.getEventiData(dataRicerca);
            if (eventiDelGiorno.isEmpty()) {
            System.out.println("Non ci sono eventi nella data: " + dataRicerca);
            } else {
                System.out.println("Eventi del " + dataRicerca + ":");
                for (Evento evento : eventiDelGiorno) {
                    System.out.println(evento.toString());
                }
            }

            System.out.println("\n" + p1.getEventiOrdinatiData());
            
    }
}
