package produto.model;

public class Produto {
	String nome;
	Double preco;
	int quantidadeEstoque;
	
	  public Produto() {
	        this.nome = "Genérico";
	        this.preco = 0.0;
	        this.quantidadeEstoque = 0;
	    }
	  
	    public Produto(String nome, double preco) {
	        this.nome = nome;
	        this.preco = preco;
	    }

	    public Produto(String nome, double preco, int quantidade) {
	        this.nome = nome;
	        this.preco = preco;
	        this.quantidadeEstoque = quantidade;
	    }

public void exibirDados() {
    int quantidade = 0;
	System.out.println("Produto: " + nome + " | Preço: R$" + preco + " | Estoque: " + quantidade);
}
}