package questao2;
public class Main {
    public static void main(String[] args) {

        Boleto boleto1 = new BoletoMensalidade();
        boleto1.gerarBoleto();

        System.out.println("-----");

        Boleto boleto2 = new BoletoMulta();
        boleto2.gerarBoleto();
    }
}