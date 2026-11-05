public class ExperienciaVip extends ReservaExperiencia {
    private double adicionalPorPessoa;

    public ExperienciaVip(String nomeCliente, int quantidadeParticipantes, double valorBasePorPessoa, double adicionalPorPessoa) {
        super(nomeCliente, valorBasePorPessoa, quantidadeParticipantes);
        this.adicionalPorPessoa = adicionalPorPessoa;
    }

    @Override
    public double calcularValorTotal() {
        double valorTotal = super.calcularValorTotal();
        valorTotal += adicionalPorPessoa * getQuantidadeParticipantes();
        return valorTotal;
    }

    public double getAdicionalPorPessoa() {
        return adicionalPorPessoa;
    }

    public void setAdicionalPorPessoa(double adicionalPorPessoa) {
        this.adicionalPorPessoa = adicionalPorPessoa;
    }

}