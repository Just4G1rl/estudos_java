package exercicio_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		/*Instanciando a classe soma e solicitando que mostre o resultado no console
		Soma soma = new Soma();
		soma.adicao(numero1, numero2);
				
		double raio = scanner.nextDouble();
		
		//Instanciando a classe AreaCirculo e solicitando que mostre o resultado no console

		AreaCirculo areaCirculo = new AreaCirculo();
		areaCirculo.areaCirculo(raio);
		
		//Instanciando a calsse Diferença (exerciocio 2.3)
		
		Diferenca dif = new Diferenca();
		
		dif.diferenca(numero1, numero2, numero3, numero4);
		
		//Instanciando a classe funcionários
		
		Funcionarios funcionario = new Funcionarios();
		funcionario.setNumeroRegistro(numeroRegistro);
		funcionario.setHorasTrabalhadas(horasTrasbalhadas);
		funcionario.setSalario(salario);
		
		funcionario.salarioMensal();
		
		funcionario.detalhes();
		
		// istanciando a classe CaixaRegistradora
		
		CaixaRegistradora produto1 = new CaixaRegistradora();
		
		produto1.setCodItem(codItem);
		produto1.setQuantItem(quantItem);
		produto1.setValorItem(valorItem);
		
		// cadastrando um novo produto
		
		codItem = scanner.nextInt();
		quantItem = scanner.nextInt();
		valorItem = scanner.nextDouble();
		
		CaixaRegistradora produto2 = new CaixaRegistradora();
		produto2.setCodItem(codItem);
		produto2.setQuantItem(quantItem);
		produto2.setValorItem(valorItem);
		
		//calculando o valor total da compra
		
		double total = produto1.valorCompra()+ produto2.valorCompra();
		
		System.out.printf("Valor da compra: %.2f", total);
		*/
		//Intanciando a classe Areas geométricas
		
		AreasGeometricas area = new AreasGeometricas();
		
		area.trianguloRetangulo(a,c);
		area.circulo(c);
		area.trapezio(a, b, c);
		area.quadrado(b);
		area.retangulo(a, b);
		
		scanner.close();
		
		
	}

}
