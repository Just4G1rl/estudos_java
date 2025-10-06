package exercicio_3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//NegativoPositivo np = new NegativoPositivo();
		/*np.negativoPositivo(numero1);
		ImparPar ip = new ImparPar();
		ip.imparPar(numero1);
		Mutiplos multiplos = new Mutiplos();
		multiplos.mutiplos(numero1, numero2);
		DuracaoJogo duracao = new DuracaoJogo();
		duracao.duracao(numero1, numero2);
		int codProduto = scn.nextInt();
		int quat = scn.nextInt();
		Caixa cx = new Caixa();
		cx.caixa(codProduto, quat);
		System.out.println("Total: "+cx.getTotal());
		Intervalo intervalo = new Intervalo();
		double numero = scn.nextDouble();
		intervalo.intervalo(numero);
		Quadrante quadrante = new Quadrante();
		double x = scn.nextDouble();
		double y = scn.nextDouble();
		quadrante.quadrante(x, y);
		*/
		Imposto imposto = new Imposto();
		double salario = scn.nextDouble();
		imposto.calculo(salario);
		imposto.resultado();
		
		
		scn.close();
	}
}
