package questao2;
class BoletoMensalidade extends Boleto {

    @Override
    protected void calcularJurosOuDescontos() {
        System.out.println("Aplicando desconto de mensalidade...");
    }
}