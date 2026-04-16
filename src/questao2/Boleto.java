package questao2;
abstract class Boleto {

    // Template Method (algoritmo fixo)
    public final void gerarBoleto() {
        validarDados();
        calcularValor();
        calcularJurosOuDescontos();
        gerarCodigoBarras();
        emitirBoleto();
    }

    protected void validarDados() {
        System.out.println("Validando dados do cliente...");
    }

    protected void calcularValor() {
        System.out.println("Calculando valor total...");
    }

    // Parte variável
    protected abstract void calcularJurosOuDescontos();

    protected void gerarCodigoBarras() {
        System.out.println("Gerando código de barras...");
    }

    protected void emitirBoleto() {
        System.out.println("Emitindo boleto...");
    }
}