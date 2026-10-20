public class Disciplina {

	public static void printAlu(Aluno[] alu, int m){
		if(m<0) return;
		printAlu(alu, (m-1));
		System.out.println(alu[m].resultadoFinal());
	}
	
    public static void main(String[] args) {
		Aluno alu[] = new Aluno[2];
		alu[0] = new Aluno("Luis", 22, 7.0, 9.0);
		alu[1] = new Aluno("João", 13, 5.0, 9.0);
    
		System.out.println("Lista de alunos");
		printAlu(alu, (alu.length-1));
    }

}
