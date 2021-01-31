package exericico10;

public class Calculadora {

	public static double somar(double x, double y) {
		double soma = x + y;
		return soma;
	}
	
	public static double subtrair(double x, double y) {
		double subtracao = x - y;
		return subtracao;
	}
	
	public static double multiplicar(double x, double y) {
		double multiplicacao = x * y;
		return multiplicacao;
	}
	
	public static double dividir(double x, double y) {
		double divisao = x / y;
		return divisao;
	}
	
	public static double potencia(double x, double y) {
		double potencia = Math.pow(x, y);
		return potencia;
	}
}
