public class PasseioDeBarco extends ReservaExperiencia{
    public boolean rotaEstendida;

    public PasseioDeBarco(String nomeCliente, int quantidadeParticipantes, double valorBasePorPessoa, boolean rotaEstendida) {
        super(nomeCliente, valorBasePorPessoa, quantidadeParticipantes);
        this.rotaEstendida = rotaEstendida;
    }

    @Override
    public double calcularValorTotal() {
        double valorTotal = super.calcularValorTotal();
        if (rotaEstendida) {
            valorTotal *= 1.2;    
        }
        return valorTotal;
    }

    public boolean getRotaEstendida() {
        return rotaEstendida;
    }

    public void setRotaEstendida(boolean rotaEstendida) {
        this.rotaEstendida = rotaEstendida;
    }
}
