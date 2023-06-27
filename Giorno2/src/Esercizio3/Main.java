package Esercizio3;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

        Articolo articolo1 = new Articolo("A001", "Prodotto 1", 19.99, 10);
        Articolo articolo2 = new Articolo("A002", "Prodotto 2", 29.99, 5);
        Articolo articolo3 = new Articolo("A003", "Prodotto 3", 9.99, 20);

 
        Cliente cliente = new Cliente("C001", "Mario Rossi", "mario@example.com", new Date());

   
        Carrello carrello = new Carrello(cliente);
        carrello.aggiungiArticolo(articolo1);
        carrello.aggiungiArticolo(articolo2);
        carrello.aggiungiArticolo(articolo3);


        System.out.println("Cliente: " + cliente.getNomeCognome());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Data iscrizione: " + cliente.getDataIscrizione());

        System.out.println("\nArticoli nel carrello:");
        for (Articolo articolo : carrello.getArticoli()) {
            System.out.println("Codice: " + articolo.getCodiceArticolo());
            System.out.println("Descrizione: " + articolo.getDescrizioneArticolo());
            System.out.println("Prezzo: " + articolo.getPrezzo());
            System.out.println("Disponibili: " + articolo.getNumeroPezziDisponibili());
            System.out.println();
        }

        System.out.println("Totale costo articoli: " + carrello.getTotaleCostoArticoli());
    }
}