package br.edu.fatecpg.calculadora.view;

import br.edu.fatecpg.calculadora.model.Calculadora;

public class Main {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		System.out.println(" ");
		calc.somar();
		calc.somar(10.5, 0.5);
		calc.somar("Gui", 10.5, 0.5);
	}

}
