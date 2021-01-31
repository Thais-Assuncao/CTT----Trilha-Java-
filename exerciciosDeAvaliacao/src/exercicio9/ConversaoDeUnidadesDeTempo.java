package exercicio9;

public class ConversaoDeUnidadesDeTempo {
	
	public static double converteMinutosParaSegundos(double minuto) {
		double segundos = minuto * 60;
		return segundos;
	}
	
	public static double converteHoraParaMinutos(double hora) {
		double minutos = hora * 60;
		return minutos;
	}

	public static double converteDiasParaHoras(double dias) {
		double horas = dias * 24;
		return horas;
	}
	
	public static double converteSemanasParaDias(double semanas) {
		double dias = semanas * 7;
		return dias;
	}
	
	public static double converteMesParaDias(double mes) {
		double dias = mes * 30;
		return dias;
	}
	
	public static double converteAnoParaDias(double ano) {
		double dias = ano * 365;
		return dias;
	}
}
