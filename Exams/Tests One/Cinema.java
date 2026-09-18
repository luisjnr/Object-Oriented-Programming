public class Cinema {
	
	public static void main (String[] args) {
			
		SessaoCinema sessao = new SessaoCinema(22, "HOMEM ARANHA", 40, 25.0);
		InterfaceCinema inter = new InterfaceCinema();	
		
		do{
			System.out.println("SESSÕES");
			switch (inter.menu(("1 - " + sessao.getFilme() + "\n2 - Encerrar"))){
				case 1: inter.metodos(sessao);
					break;
					
				case 2:	return;

				default: System.out.println("Digite uma opção válida.");
			}
			
		} while (true);
		
	}
}

