package br.edu.fatecpg.veiculo.view;
import br.edu.fatecpg.veiculo.model.*;
public class Main {
	public static void main(String[] args) {
		Bicicleta bicicleta = new Bicicleta();
		Carro carro = new Carro();
		
		carro.mover();
		bicicleta.mover();
	
	}

	// Explicação:
	
	//A sobrescrita de métodos permite que subclasses tenham comportamentos
	// diferentes para um mesmo metodo herdado da superclasse.
	
	//Faz com um metodo pode ter varias formas diferentes: Exemplo ->
	// VEICULO PODE TER OPÇÕES COMO: CARRO, BICICLETA.
	
}
