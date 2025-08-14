package evento;

import java.time.LocalDate;

public class Evento {
    private String titolo;

    private LocalDate data;

    private int postiTotali;

    private int postiPrenotati;

    //Costruttore
    public Evento(String titolo, LocalDate data, int postiTotali) {
        if(titolo == null || titolo.isBlank()){
            throw new IllegalArgumentException("Il titolo dell'evento è obbligatorio.");
        } else {
            this.titolo = titolo;
        }

        if(data == null || data.isBefore(LocalDate.now())){
            throw new IllegalArgumentException("Impossibile inserire una data antecedente a quella odierna.");
        } else {
            this.data = data;
        }

        if(postiTotali <= 0){
            throw new IllegalArgumentException("Impossibile inserire un numero di posti totali negativo o uguale a 0.");
        } else {
            this.postiTotali = postiTotali;
        }

        this.postiPrenotati = 0;
    }

    //Getters
    public String getTitolo() {
        return titolo;
    }

    public LocalDate getData() {
        return data;
    }

    public int getPostiTotali() {
        return postiTotali;
    }

    public int getPostiPrenotati() {
        return postiPrenotati;
    }

    //Setters
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setData(LocalDate data) {
        if (data.isBefore(LocalDate.now())){
            throw new IllegalArgumentException("Impossibile inserire una data antecedente a quella odierna.");
        } else {
            this.data = data;
        }
    }

    public void prenota(){
        if (this.data.isBefore(LocalDate.now())){
            throw new IllegalStateException("Impossibile prenotare posti per un evento passato.");
        } else if (this.postiPrenotati > this.postiTotali){
            throw new IllegalStateException("Impossibile prenotare, il numero di posti richiesti supera quello dei posti liberi.");
        } else {
            this.postiPrenotati++;
        }
    }

    public void disdici(){
        if (this.data.isBefore(LocalDate.now())){
            throw new IllegalStateException("Impossibile disdire posti per un evento passato.");
        } else if (this.postiPrenotati <= 0){
            throw new IllegalStateException("Non sono presenti prenotazioni da disdire.");
        } else {
            this.postiPrenotati--;
        }
    }

    @Override
    public String toString() {
        return "Data: " + this.data + " - " + "Titolo: " + titolo;
    }
    
    

}
