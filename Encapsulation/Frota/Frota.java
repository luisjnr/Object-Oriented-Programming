public class Frota {

    public static void main(String[] args) {
		Carro car = new Carro(20.0);
		car.percorrerDistancia(100);
		System.out.println("Carro\n" + "Autonomia: " + car.autonomia());
    }
	
}
