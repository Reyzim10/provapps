package questao2;
class BoletoMulta extends Boleto {

    @Override
    protected void calcularJurosOuDescontos() {
        System.out.println("Aplicando juros por atraso...");
    }
}