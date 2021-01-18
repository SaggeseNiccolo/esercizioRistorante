package com.ordiniristorante;

import java.util.ArrayList;

public class Piatto {
    private String tipo;
    private String nome;
    private double costo;
    private ArrayList<Ingrediente> ingredienti = new ArrayList<>();
    
    public Piatto(String tipo, String nome){
        this.tipo = tipo;
        this.nome = nome;
        costo = 0.0;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public double getCosto(){
        for(int i = 0; i < ingredienti.size(); i++)
            costo += ingredienti.get(i).getPrezzo();
        
        return costo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void aggiungiIngredientePiatto(Ingrediente x){
        ingredienti.add(x);
    }
    
    public void rimuoviIngredientePiatto(String nome){
        for(int i = 0; i < ingredienti.size(); i++)
            if(nome.equals(ingredienti.get(i).getDescrizione()))
                ingredienti.remove(i);
    }
    
    public void stampaIngredientiPiatto(Piatto x){
        for (int i = 0; i < x.ingredienti.size(); i++)
            System.out.println(x.ingredienti.get(i).getDescrizione());
    }
    
    public String toString(){
        String piatto = "\nNome: " + nome + " Tipo: " + tipo + " Costo: " + getCosto(); 
        
        return piatto;
    }
    
}
