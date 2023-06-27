package Esercizio2;

public class Sim {

	String numeroTelefono;
	double credito;
	Chiamata[] listaChiamate;

	
	
	public Sim(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	this.credito = 0;
	    this.listaChiamate = new Chiamata[5];
	}
	

	public void stampaDati() {
		System.out.println("Numero di telefono: " + numeroTelefono);
		System.out.println("Credito dispobile " + credito);
		System.out.println("**********************************");
		
		System.out.println("Lista delle ultime 5 chiamate effettuate:");
		for (Chiamata call: listaChiamate) {
			if (call != null) {
				System.out.println( call.numeroChiamato + call.durata );
			}
		}
	}
	
	public void ricaricaNumero (double ricarica) {
		this.credito += ricarica;
	}
	
	public void effettuaChiamata (String numeroChiamato, int durata) {
		for(int i = 0; i < listaChiamate.length; i++) {
			if(listaChiamate[i] == null) {
				listaChiamate[i] = new Chiamata(numeroChiamato, durata);
				break;
			}
		}
	}
	
	
	
	
}




















//	public void aggiungiChiamata(Chiamata chiamata) {
//		if (numeroChiamaye < 5)
//	}
//	