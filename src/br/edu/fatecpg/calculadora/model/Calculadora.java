package br.edu.fatecpg.calculadora.model;

public class Calculadora {
	public void somar() {
	System.out.println("A soma está sem parâmetros.");
	}
	
public void somar(double n1, double n2) {
	System.out.println("Soma: " + (n1 + n2));
	}

public void somar(String nome, double n1, double n2) {
	System.out.println(nome + " está realizando soma: " + (n1 + n2));
}
}
