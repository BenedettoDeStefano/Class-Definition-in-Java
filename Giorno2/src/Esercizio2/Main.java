package Esercizio2;

public class Main {

	public static void main(String[] args) {
		Sim sim = new Sim("33333333333");
		
		
		sim.ricaricaNumero(100);
		
		sim.effettuaChiamata("Numero: 2222222222 Durata: ", 10);
		sim.effettuaChiamata("Numero: 4444444444 Durata: ", 10);
		sim.effettuaChiamata("Numero: 5555555555 Durata: ", 10);

		sim.stampaDati();
	}

}
