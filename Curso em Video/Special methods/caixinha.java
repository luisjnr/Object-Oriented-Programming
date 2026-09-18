public class Caixinha {

    public static void main(String[] args) {
		Caneta c1 = new Caneta("bic", "azul", 0.5, 10);
		Caneta c2 = new Caneta("bic", "azul", 0.5, 10);
		c1.status();
		c1.rabiscar();
		System.out.println("\n");
		c2.destampar();
		c2.status();
		c2.rabiscar();
    }

}
