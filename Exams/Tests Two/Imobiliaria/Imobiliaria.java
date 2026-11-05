public class Imobiliaria {
	private Imovel[] imoveis = new Imovel[10];
	
	public boolean adicionaImovel(Residencial residencial){
		for (int i = 0; i < imoveis.length; i++)
			if(imoveis[i] == null){
				imoveis[i] = residencial;
				return true;
			}
		return false;
	}
	
	public boolean adicionaImovel(Comercial comercial){
		for (int i = 0; i < imoveis.length; i++)
			if(imoveis[i] == null){
				imoveis[i] = comercial;
				return true;
			}
		return false;	
	}
	
	public boolean excluiImovel(String descricao){
		for (int i = 0; i < imoveis.length; i++)
			if(imoveis[i] != null)
				if(imoveis[i].getDescricao().equalsIgnoreCase(descricao)){
					imoveis[i] = null;
					for (int j = i; j < (imoveis.length - 1); j++)
						imoveis[j] = imoveis[j+1];
					return true;
				}
		return false;	
	}
	
	public Imovel[] disponiveis(){
		return this.imoveis;
	}
	
	public Residencial[] residenciais(){
		Residencial[] residencial = new Residencial[10];
		for(int i = 0; i < imoveis.length; i++)
			if(imoveis[i] != null)
				if(imoveis[i] instanceof Residencial)	
					residencial[i] = (Residencial) imoveis[i];
		return residencial;
	}
	
	public Comercial[] comerciais(){
		Comercial[] comercial = new Comercial[10];
		for(int i = 0; i < imoveis.length; i++)
			if(imoveis[i] != null)
				if(imoveis[i] instanceof Comercial)	
					comercial[i] = (Comercial) imoveis[i];
		return comercial;
	}
	
	public Imovel buscaImovel(String descricao){
		for (int i = 0; i < imoveis.length; i++)
			if(imoveis[i] != null)
				if(imoveis[i].getDescricao().equalsIgnoreCase(descricao))
					return imoveis[i];
		return null;	
	}
	
	public Imovel[] getImoveis(){
		return this.imoveis;
	}
}
