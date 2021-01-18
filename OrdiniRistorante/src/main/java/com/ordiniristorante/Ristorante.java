package com.ordiniristorante;

import java.util.ArrayList;

public class Ristorante {
    private ArrayList<Piatto> piattiDisponibili = new ArrayList<>();
    private ArrayList<Ordine> ordinazioniEffettuate = new ArrayList<>();
    
    public void aggiungiPiattoDisponibile(Piatto x){
        piattiDisponibili.add(x);
    }
    
    public void rimuoviPiattoDisponibile(String nome){
        for(int i = 0; i < piattiDisponibili.size(); i++)
            if(nome.equals(piattiDisponibili.get(i).getNome()))
                piattiDisponibili.remove(i);
    }
    
    public void stampaPiattiDisponibili(){
        for (int i = 0; i < piattiDisponibili.size(); i++)
            System.out.println(piattiDisponibili.get(i).toString());
    }
    
    public void aggiungiOrdinazioneEffettuata(Ordine x){
        ordinazioniEffettuate.add(x);
    }
    
    public void rimuoviOrdinazioneEffettuata(int id){
        for(int i = 0; i < ordinazioniEffettuate.size(); i++)
            if(id == ordinazioniEffettuate.get(i).getNumeroIdentificativo())
                ordinazioniEffettuate.remove(i);
    }
    
    public void stampaOrdinazioniEffettuate(){
        for(int i = 0; i < ordinazioniEffettuate.size(); i++)
            System.out.println(ordinazioniEffettuate.get(i).toString());
    }
    
    public double incassoGiornaliero(){
        double incasso = 0.0;
        
        for(int i = 0; i < ordinazioniEffettuate.size(); i++)
            incasso = ordinazioniEffettuate.get(i).getPrezzoTotale();
        
        return incasso;
    }
    
    public int ordineImportoMaggiore(){     //ritorno l'indice dell'ordine con l'importo maggiore
        int indiceOrdine = 0;
        double prezzoOrdine = 0.0;
        
        for(int i = 0; i < ordinazioniEffettuate.size(); i++)
            if(ordinazioniEffettuate.get(i).getPrezzoTotale() > prezzoOrdine){
                prezzoOrdine = ordinazioniEffettuate.get(i).getPrezzoTotale();
                indiceOrdine = i;
            }
        
        return indiceOrdine;
    }
    
    public ArrayList creaListaPiatti(String t){
        ArrayList<Piatto> listaPiatti = new ArrayList<>();
        
        for(int i = 0; i < piattiDisponibili.size(); i++)
            if(piattiDisponibili.get(i).getTipo().equals(t))
                listaPiatti.add(piattiDisponibili.get(i));
        
        
        return listaPiatti;
        
    }
    
}