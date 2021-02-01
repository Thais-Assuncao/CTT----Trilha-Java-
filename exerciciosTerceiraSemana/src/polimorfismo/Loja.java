package polimorfismo;

import java.util.Scanner;

public class Loja {
	
	public void calculaVendasTotaisProdutos(Produto produto) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a quantidade de vendas: ");
		int quantidade = scanner.nextInt();
		int total = produto.setQuantidadeVendas(quantidade);
		produto.calculaTotalVendas();
	
		scanner.close();
	}
}
