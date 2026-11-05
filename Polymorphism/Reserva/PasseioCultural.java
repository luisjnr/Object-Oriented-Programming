public class PasseioCultural extends ReservaExperiencia{
    private boolean incluiOficina;

    public PasseioCultural(String nomeCliente, int quantidadeParticipantes, double valorBasePorPessoa, boolean incluiOficina) {
        super(nomeCliente, valorBasePorPessoa, quantidadeParticipantes);
        this.incluiOficina = incluiOficina;
    }

    @Override 
    public double calcularValorTotal() {
        double valorTotal = super.calcularValorTotal();
        if (incluiOficina) {
            valorTotal += (25.0 * getQuantidadeParticipantes());
        }
        return valorTotal;
    }

    public boolean getIncluiOficina() {
        return incluiOficina;
    }

    public void setIncluiOficina(boolean incluiOficina) {
        this.incluiOficina = incluiOficina;
    }

}