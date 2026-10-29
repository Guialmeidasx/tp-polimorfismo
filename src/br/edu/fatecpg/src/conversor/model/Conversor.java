package conversor.model;

public class Conversor {
	public double Converter(double celsius) {
		return (celsius * 9 / 5) + 32;
	}
	
	public double Converter(double km, boolean milhas) {
		return km * 0.621371;
	}
	
	public String converter(String texto) {
		return texto.toUpperCase();
	}
}
