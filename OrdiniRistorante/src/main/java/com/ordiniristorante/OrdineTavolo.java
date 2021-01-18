package com.ordiniristorante;

public class OrdineTavolo extends Ordine{
    protected String nomeCameriere;

    public OrdineTavolo(String nomeCameriere) {
        this.nomeCameriere = nomeCameriere;
        numeroIdentificativo++;
        for(int i = 0; i < piattiOrdinati.size(); i++)
            prezzoTotale += piattiOrdinati.get(i).getCosto();
    }
    
    public double getPrezzoTotale(){
        for(int i = 0; i < piattiOrdinati.size(); i++)
            prezzoTotale += piattiOrdinati.get(i).getCosto();
        
        return prezzoTotale;
    }
    
    public String toString(){
        String ordine = "\nNome camerieie: " + nomeCameriere + " Numero identificativo: " + numeroIdentificativo + " Costo: " + getPrezzoTotale(); 
        
        return ordine;
    }
    
}
