package com.ordiniristorante;

public class OrdineDomicilio extends Ordine{
    protected String indirizzo;
    protected double prezzoTotale = 0.0;
    protected final double costoSpedizione = 2.5;
    protected int anno, mese, giorno, ora, minuti;

    public OrdineDomicilio(String indirizzo, int anno, int mese, int giorno, int ora, int minuti) {
        this.indirizzo = indirizzo;
        this.anno = anno;
        this.mese = mese;
        this.giorno = giorno;
        this.ora = ora;
        this.minuti = minuti;
        numeroIdentificativo++;
        for(int i = 0; i < piattiOrdinati.size(); i++)
            prezzoTotale += piattiOrdinati.get(i).getCosto();
        prezzoTotale += costoSpedizione;
    }

    public double getPrezzoTotale(){
        for(int i = 0; i < piattiOrdinati.size(); i++)
            prezzoTotale += piattiOrdinati.get(i).getCosto();
        prezzoTotale += costoSpedizione;
        
        return prezzoTotale;
    }
    
    public String toString(){
        String ordine = "\nNumero identificativo: " + numeroIdentificativo + " Costo: " + getPrezzoTotale() + " Indirizzo: " + indirizzo + " Orario di arrivo: " + giorno + "/" + mese + "/" + anno + " " + ora + ":" + minuti;
        
        return ordine;
    }
    
}
