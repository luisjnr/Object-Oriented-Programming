public class  Hotel{

	public static void main(String[] args){
		Reserva[] res = new Reserva[2];
		InterfaceHotel inter = new InterfaceHotel();
		res[0] = new Reserva(22, "Luis", 10);
		res[1] = new Reserva(13, "Carlos", 10, true);
	
		do{
			System.out.println("Hóspedes");
			switch (inter.menu("1 - " + res[0].getNomeHospede() + "\n" + "2 - " + res[1].getNomeHospede())){
				case 1:	inter.metodos(res[0]);
					break;
				
				case 2: inter.metodos(res[1]);
					break;
					
				case 3: return;
				
				default: System.out.println("Digite uma opção válida.");
					
			}
			
		} while (true);
		
	}

}
