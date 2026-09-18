public class Principal{

	public static void main(String[] args){
		Data[] data = new Data[2];
		data[0] = new Data(19, 11, 2004);
		data[1] = new Data(22, 03, 2005);
		Pessoa[] user = new Pessoa[2];
		user[0] = new Pessoa("Luis", "Masculino", data[0]);
		user[1] = new Pessoa("Fernanda", "Feminino", data[1]);
		
		System.out.println("Usuário: [" + user[0].getNome() + "] - Idade: " +
		user[0].mostraIdade((new Data(18, 9, 2026))) + " anos.\n");
		System.out.println("Usuário: [" + user[1].getNome() + 
		"] - Data de nascimento: " + user[1].getNascimento().retornaData());
		System.out.println("Diferença de idade de " + user[0].getNome() + " e "
		+ user[1].getNome() + ": " + user[0].getNascimento().calculaTempo(user[1].getNascimento()));
		
	}

}
