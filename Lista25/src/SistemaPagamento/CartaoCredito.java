package SistemaPagamento;

public class CartaoCredito extends Pagamento {

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento no cartão de crédito aprovado!");
    }
}