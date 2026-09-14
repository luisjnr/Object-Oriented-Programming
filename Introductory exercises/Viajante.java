public class Viajante {
	
	public static int fatorial(int n){
		if(n <= 1)
			return 1;
		return ((n-1) * fatorial(n-1));
	}
	
	public static int viagem(int n){
		if(n == 0)
			return 0;
		return (fatorial(n) / 2);
	}
	
    public static void main(String[] args) {
		System.out.println(viagem(10));
    }

}
