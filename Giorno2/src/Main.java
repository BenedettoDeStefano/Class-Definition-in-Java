
public class Main {

	public static void main(String[] args) {
		
		Rettangolo rett1 = new Rettangolo(5,8);
		Rettangolo rett2 = new Rettangolo(3,6);
		
		stampaRettangolo(rett1);
		stampaRettangolo(rett2);
		
		stampaDueRettangoli(rett1, rett2);

	}
	
	public static void stampaRettangolo(Rettangolo rett1) {
		double area = rett1.calcolaArea();
		double perimetro = rett1.calcolaPerimetro();
		
		System.out.println("Area = " + area);
		System.out.println("Perimetro = " + perimetro);
	}
	
	public static void stampaDueRettangoli(Rettangolo rett1, Rettangolo rett2) {
		double area1 = rett1.calcolaArea();
		double perimetro1 = rett1.calcolaPerimetro();
		
		double area2 = rett2.calcolaArea();
		double perimetro2 = rett2.calcolaPerimetro();
		
		
		double sommaArea = area1 + area2;
		double sommaPerimetro = perimetro1 + perimetro2;
		
		System.out.println("Area Rettangolo 1=" + area1);
		System.out.println("Perimetro Rettangolo 1 =" +perimetro1);
		
		System.out.println("Area Rettangolo 2=" +area2);
		System.out.println("perimetro Rettangolo 2=" +perimetro2);
		
		System.out.println("somma Area =" +sommaArea);
		System.out.println("somma Perimetro=" +sommaPerimetro);
	}

}
