/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ordiniristorante;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class RistoranteTest {
    
    public RistoranteTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of aggiungiPiattoDisponibile method, of class Ristorante.
     */
    @Test
    public void testAggiungiPiattoDisponibile() {
        System.out.println("aggiungiPiattoDisponibile");
        Piatto x = null;
        Ristorante instance = new Ristorante();
        instance.aggiungiPiattoDisponibile(x);
    }

    /**
     * Test of rimuoviPiattoDisponibile method, of class Ristorante.
     */
    @Test
    public void testRimuoviPiattoDisponibile() {
        System.out.println("rimuoviPiattoDisponibile");
        String nome = "";
        Ristorante instance = new Ristorante();
        instance.rimuoviPiattoDisponibile(nome);
    }

    /**
     * Test of stampaPiattiDisponibili method, of class Ristorante.
     */
    @Test
    public void testStampaPiattiDisponibili() {
        System.out.println("stampaPiattiDisponibili");
        Ristorante instance = new Ristorante();
        instance.stampaPiattiDisponibili();
    }

    /**
     * Test of aggiungiOrdinazioneEffettuata method, of class Ristorante.
     */
    @Test
    public void testAggiungiOrdinazioneEffettuata() {
        System.out.println("aggiungiOrdinazioneEffettuata");
        Ordine x = null;
        Ristorante instance = new Ristorante();
        instance.aggiungiOrdinazioneEffettuata(x);
    }

    /**
     * Test of rimuoviOrdinazioneEffettuata method, of class Ristorante.
     */
    @Test
    public void testRimuoviOrdinazioneEffettuata() {
        System.out.println("rimuoviOrdinazioneEffettuata");
        int id = 0;
        Ristorante instance = new Ristorante();
        instance.rimuoviOrdinazioneEffettuata(id);
    }

    /**
     * Test of stampaOrdinazioniEffettuate method, of class Ristorante.
     */
    @Test
    public void testStampaOrdinazioniEffettuate() {
        System.out.println("stampaOrdinazioniEffettuate");
        Ristorante instance = new Ristorante();
        instance.stampaOrdinazioniEffettuate();
    }

    /**
     * Test of incassoGiornaliero method, of class Ristorante.
     */
    @Test
    public void testIncassoGiornaliero() {
        System.out.println("incassoGiornaliero");
        Ristorante instance = new Ristorante();
        double expResult = 0.0;
        double result = instance.incassoGiornaliero();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of ordineImportoMaggiore method, of class Ristorante.
     */
    @Test
    public void testOrdineImportoMaggiore() {
        System.out.println("ordineImportoMaggiore");
        Ristorante instance = new Ristorante();
        int expResult = 0;
        int result = instance.ordineImportoMaggiore();
        assertEquals(expResult, result);
    }

    /**
     * Test of creaListaPiatti method, of class Ristorante.
     */
    @Test
    public void testCreaListaPiatti() {
        System.out.println("creaListaPiatti");
        String t = "";
        Ristorante instance = new Ristorante();
        ArrayList expResult = null;
        ArrayList result = instance.creaListaPiatti(t);
        assertEquals(expResult, result);
    }
    
}
