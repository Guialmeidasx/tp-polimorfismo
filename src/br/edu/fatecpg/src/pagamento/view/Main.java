package pagamento.view;
import pagamento.model.*;
public class Main {

	public static void main(String[] args) {
		PagamentoBoleto pagamento = new PagamentoBoleto();
		PagamentoCartao pagamento1 = new PagamentoCartao();
		
		pagamento.processarPagamento();
		pagamento1.processarPagamento();
		}
}

// O polimorfismo por sobrescrita permite que diferentes classes implementem o mesmo método de formas diferentes, de acordo com suas necessidades. Assim, cada forma de pagamento pode ter sua própria implementação do método, como cartão de crédito, dinheiro ou Pix, sem precisar alterar o código da classe base. Isso facilita a manutenção, a reutilização e a expansão do sistema, permitindo adicionar novas formas de pagamento com mais facilidade.