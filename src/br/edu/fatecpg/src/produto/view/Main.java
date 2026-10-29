package produto.view;
import produto.model.*;

public class Main {
	public static void main(String[] args) {
		Produto p1 = new Produto();
		Produto p2 = new Produto("Caderno", 15.50);
		Produto p3 = new Produto("Caneta", 2.50, 50);

		
		p1.exibirDados();
		p2.exibirDados();
		p3.exibirDados();
	}
}

//A sobrecarga de construtores permite criar objetos de uma mesma classe com diferentes conjuntos de informações, oferecendo flexibilidade na instanciação. Isso acontece porque uma classe pode ter vários construtores com diferentes parâmetros. Assim, o programador pode escolher quais informações fornecer no momento da criação do objeto, facilitando a reutilização do código e tornando o programa mais organizado.