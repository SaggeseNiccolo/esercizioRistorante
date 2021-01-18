package com.ordiniristorante;

public class Ingrediente{
    private String descrizione;
    private int quantita;
    private double prezzo;

    public Ingrediente(String descrizione, int quantita, double prezzo) {
        this.descrizione = descrizione;
        this.quantita = quantita;
        this.prezzo = prezzo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public int getQuantita() {
        return quantita;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    
}
