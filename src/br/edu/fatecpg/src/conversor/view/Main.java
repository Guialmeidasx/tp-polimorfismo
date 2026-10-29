package conversor.view;

import conversor.model.Conversor;

public class Main {

	public static void main(String[] args) {
		Conversor c = new Conversor();
		
		System.out.println("=== Conversor ===");
		System.out.println("Conversor de Celsius para Fahrenheit: 30 °C " + c.Converter(30.0) + "°F");
		System.out.println("Conversor Quilômetros para Milhas: 10 km " + c.Converter(10.0, true) + " Milhas");
		System.out.println("Conversor de Texto em Letras Minúsculas para Maiúsculas: alessandro " + c.converter("alessandro"));
	}

}

// A sobrecarga de métodos permite que uma mesma classe tenha vários métodos com o mesmo nome, desde que suas assinaturas sejam diferentes, ou seja, que variem no número, no tipo ou na ordem dos parâmetros. O tipo de retorno sozinho não é suficiente para diferenciar métodos.