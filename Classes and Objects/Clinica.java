public class Clinica {
	
	public static void printPac(Paciente[] pac, int m){
		if(m<0) return;
		printPac(pac, (m-1));
		System.out.println("Nome: " + pac[m].nome + ", Sexo: " + pac[m].sexo + ", IMC: " + pac[m].calcularIMC() + ".");
	}

    public static void main(String[] args) {
		Paciente[] pac = new Paciente[2];
		pac[0] = new Paciente("Luis", "Masculino", 65.0, 1.80);
		pac[1] = new Paciente("João", "Masculino", 90.0, 1.71);
		
		System.out.println("Lista de pacientes");
		printPac(pac, (pac.length-1));
    }
	
}
