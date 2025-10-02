package exercicio_3;

public class Mutiplos {
	public void mutiplos (int numero1, int numero2) {
		int min = 0;
		int max = 0;
		if(numero1 > numero2) {
			min = numero2;
			max = numero1;
		}else {	
			min = numero1;
			max = numero2;
		}
		if(max % min == 0) {
			System.out.println("São multiplos.");
		}else {
			System.out.println("Não são multiplos.");
		}
	}
}
