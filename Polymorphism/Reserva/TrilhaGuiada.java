public class TrilhaGuiada extends ReservaExperiencia{
    private String dificuldade; 
    
    public TrilhaGuiada(String nomeCliente, int quantidadeParticipantes, double valorBasePorPessoa, String dificuldade) {
        super(nomeCliente, valorBasePorPessoa,  quantidadeParticipantes);
        this.dificuldade = dificuldade;
    }

    @Override
    public double calcularValorTotal() {
        double valorTotal = super.calcularValorTotal();
        if (dificuldade.equalsIgnoreCase("leve")) {
            valorTotal *= 1.05;
        }
        else if(dificuldade.equalsIgnoreCase("moderada")) {
            valorTotal *= 1.15;
        }
        else if(dificuldade.equalsIgnoreCase("desafiadora")) {
            valorTotal *= 1.3;
        }
        return valorTotal;
    }

    public String getDificuldade() {
        return dificuldade;
    }   

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }
}