public class Caixinha {

    public static void main(String[] args) {
		Caneta can = new Caneta("Bic", "Azul", 0.5, 1, true);
		can.status();
		can.destampar();
		can.status();
		can.rabiscar();
		can.tampar();
		can.status();
    }

}
