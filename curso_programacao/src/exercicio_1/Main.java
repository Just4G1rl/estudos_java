package exercicio_1;
import java.util.Locale;

import exercicio_1.Produto;

public class Main {
	
	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.setProduto("Computador");
		produto1.setValor(5890.00);
		
		Produto produto2 = new Produto();
		produto2.setProduto("Mesa de computador");
		produto2.setValor(395.00);
		
		int idade = 29;
		int codigo = 59876;
		char sexo = 'F';
		
		double medida = 60.98759678;
		
		System.out.println("Produtos:");
		produto1.descricao();
		produto2.descricao();
		
		System.out.printf("%nRegistro:%n%d anos, código %d e sexo %s%n", idade, codigo, sexo);
		
		System.out.printf("%nMedidas com oito casas decimais: %f%n", medida);
		System.out.printf("Arredondado (com três casas decimais): %.3f%n", medida);
		Locale.setDefault(Locale.US);
		System.out.printf("Padão EUA: %.3f%n", medida);

	}
}