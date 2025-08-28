package programmaEventi;

import evento.Evento;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgrammaEventi {
    private String titolo;

    private List<Evento> eventi;

    public ProgrammaEventi(String titolo) {
        this.titolo = titolo;

        this.eventi = new ArrayList<>();
    }
    
    public void aggiungiEvento(Evento evento){
        this.eventi.add(evento);
    }

    public int getNumeroEventi(){
        return this.eventi.size();
    }
    
    public void svuotaLista(){
        this.eventi.clear();
    }

    public List<Evento> getEventiData(LocalDate data){
        List<Evento> eventiFiltrati = new ArrayList<>();
        for (Evento evento : this.eventi) {
            if (evento.getData().isEqual(data)){
                eventiFiltrati.add(evento);
            }
        }
        return eventiFiltrati;
    }

    public String getEventiOrdinatiData(){
        Collections.sort(this.eventi, (e1, e2) -> e1.getData().compareTo(e2.getData()));

        String risultato = this.titolo + ":\n";

        if (this.eventi.isEmpty()){
            risultato += "Nessun evento presente";
        } else {
            for (Evento evento : this.eventi){
                risultato += evento.toString() + "\n";
            }
        }
        return risultato;
    }
}
