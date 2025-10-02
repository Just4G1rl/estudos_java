package exercicio_3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//NegativoPositivo np = new NegativoPositivo();
		int numero1 = scn.nextInt();
		int numero2 = scn.nextInt();
		/*np.negativoPositivo(numero1);
		ImparPar ip = new ImparPar();
		ip.imparPar(numero1);
		Mutiplos multiplos = new Mutiplos();
		multiplos.mutiplos(numero1, numero2);
		*/
		DuracaoJogo duracao = new DuracaoJogo();
		duracao.duracao(numero1, numero2);
		scn.close();
	}
}
