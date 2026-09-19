public class Loja{

	public static void main(String[] args){
		Consumidor cliente = new Consumidor("Luis", "134.654.876-56", 50000);
		Produto produto = new Produto(22, "Drone Mosca Intelbras", 2469);
		Venda venda = new Venda(2222, cliente, produto, 1);
		
		System.out.println("Venda - " + venda.getNumero());
		System.out.println(venda.imprimir());
	}

}
