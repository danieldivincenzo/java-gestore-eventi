package concerto;

import evento.Evento;
import java.time.LocalDate;
import java.time.LocalTime;

public class Concerto extends Evento {
    private LocalTime ora;

    private double prezzo;

    //Costruttore 
    public Concerto(String titolo, LocalDate data, int postiTotali, LocalTime ora, double prezzo) {
        super(titolo, data, postiTotali);
        this.ora = ora;
        this.prezzo = prezzo;
    }

    //Getters
    public LocalTime getOra() {
        return ora;
    }

    public double getPrezzo() {
        return prezzo;
    }

    //Setters
    public void setOra(LocalTime ora) {
        this.ora = ora;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    
    
}
