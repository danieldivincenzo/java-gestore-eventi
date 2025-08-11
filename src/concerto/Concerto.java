package concerto;

import evento.Evento;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

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
    
    public String getDataOraForm() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return getData().atTime(ora).format(formatter);
    }

    public String getPrezzoForm() {
        NumberFormat formatterPrezzo = NumberFormat.getCurrencyInstance(Locale.ITALY);
        return formatterPrezzo.format(prezzo);
    }

    @Override
    public String toString() {
        return "Data e ora: " + getDataOraForm() + " - " + "Titolo: " + getTitolo() + " - " + "Prezzo: " + getPrezzoForm();
    }
     
}
