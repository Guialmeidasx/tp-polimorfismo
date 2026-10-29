package pagamento.model;

public class PagamentoCartao extends Pagamento {

	@Override
	public void processarPagamento() {
		System.out.println("Processando pagamento via Cartao de Crédito");	
		}
	

}
