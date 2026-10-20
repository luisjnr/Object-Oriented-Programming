public class Frota {

    public static void main(String[] args) {
		
		Carro car = new Carro();
		
		System.out.println("Carro \n");
		System.out.println("Autonomia: " + car.autonomia());
		System.out.println("Autonomia: " + car.autonomia("gasolina"));
		System.out.println("Autonomia: " + car.autonomia("etanol"));
		System.out.println("Autonomia: " + car.autonomia("gasolina", 20.0));
		System.out.println("Autonomia: " + car.autonomia("ETanol", 5.0));
		System.out.println("Autonomia: " + car.autonomia("Gasolina", true));
		System.out.println("Autonomia: " + car.autonomia("Gasolina", false));
		System.out.println("Autonomia: " + car.autonomia("Etanol", true));
		System.out.println("Autonomia: " + car.autonomia("Etanol", false));
    }

}
