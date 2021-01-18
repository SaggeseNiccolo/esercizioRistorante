package com.ordiniristorante;

public class OrdiniRistorante {

    public static void main(String[] args) {
        Ristorante r = new Ristorante();
        
        Piatto p1 = new Piatto("primo", "panino");
        Piatto p2 = new Piatto("primo","pasta");
        
        Ingrediente i1 = new Ingrediente("insalata", 1, 0.30);
        Ingrediente i2 = new Ingrediente("pane", 2, 0.10);
        Ingrediente i3 = new Ingrediente("carne", 1, 1.00);
        
        OrdineTavolo o1 = new OrdineTavolo("");
        OrdineDomicilio o2 = new OrdineDomicilio("", 2020, 12, 16, 14, 00);
        
        p1.aggiungiIngredientePiatto(i1);
        p1.aggiungiIngredientePiatto(i2);
        p1.aggiungiIngredientePiatto(i3);
        
        p2.aggiungiIngredientePiatto(i3);
        
        p1.stampaIngredientiPiatto(p1);
        
        r.aggiungiPiattoDisponibile(p1);
        r.aggiungiPiattoDisponibile(p2);
        
        r.stampaPiattiDisponibili();
        
        o1.aggiungiPiattoOrdinato(p1);
        o1.aggiungiPiattoOrdinato(p2);
        
        r.aggiungiOrdinazioneEffettuata(o1);
        r.aggiungiOrdinazioneEffettuata(o2);
        
        r.stampaOrdinazioniEffettuate();
    }
    
}
