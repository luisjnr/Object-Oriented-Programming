public class Loja {
	
	public static void main (String[] args) {
		Produto[] prod = new Produto[3];
		InterfaceLoja inter = new InterfaceLoja();
		prod[0] = new Produto("Bala", 0.5, 10, "Doces");
		prod[1] = new Produto("Pirulito", 1.5, 15, "Doces");
		prod[2] = new Produto("Fini", 5.5, 20, "Doces");
		
		do{
			switch (inter.menu("1 - Bala\n2 - Pirulito\n3 - Fini\n4 - Encerrar")){
				case 1: inter.metodos(prod[0]);
					
					break;
				case 2: inter.metodos(prod[1]);
					
					break;
				case 3: inter.metodos(prod[2]);
					
					break;
				case 4: return;
				default: System.out.println("Digite uma opção válida.");
			}
		} while (true);
	}
}

