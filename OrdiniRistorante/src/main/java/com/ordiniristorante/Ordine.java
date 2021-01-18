package com.ordiniristorante;

import java.util.ArrayList;

public class Ordine {
    protected ArrayList<Piatto> piattiOrdinati = new ArrayList<>();
    protected int numeroIdentificativo;
    protected double prezzoTotale;

    public Ordine() {
        numeroIdentificativo = 0;
        prezzoTotale = 0.0;
    }

    public int getNumeroIdentificativo() {
        return numeroIdentificativo;
    }

    public void setNumeroIdentificativo(int numeroIdentificativo) {
        this.numeroIdentificativo = numeroIdentificativo;
    }

    public double getPrezzoTotale() {
        return prezzoTotale;
    }

    public void setPrezzoTotale(double prezzoTotale) {
        this.prezzoTotale = prezzoTotale;
    }
    
    public ArrayList<Piatto> getPiattiOrdinati() {
        return piattiOrdinati;
    }

    public void aggiungiPiattoOrdinato(Piatto x){
        piattiOrdinati.add(x);
    }
    
    public void rimuoviPiattoOrdinato(String nome){
        for(int i = 0; i < piattiOrdinati.size(); i++)
            if(nome.equals(piattiOrdinati.get(i).getNome()))
                piattiOrdinati.remove(i);
    }
    
    public void stampaPiattiOrdinati(Ordine x){
        for (int i = 0; i < x.piattiOrdinati.size(); i++)
            System.out.println(x.piattiOrdinati.get(i).getNome());
    }
    
}
