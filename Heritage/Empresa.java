public class Empresa {

	public static void main(String[] args){
		Empregado empregado = new Empregado();
		
		empregado.setCodigoSetor(22);
		empregado.setSalarioBase(10000.0);
		empregado.setImposto(10.0);
		empregado.setNome("Luis");
		empregado.setEndereco("Rua Guanabara, 246, Centro.");
		empregado.setTelefone("(38) 99257-7724");
		
		System.out.println("Salário: " + empregado.calculaSalario());
	}

}
