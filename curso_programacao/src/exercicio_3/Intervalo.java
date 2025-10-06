package exercicio_3;

public class Intervalo {
	public void intervalo (double numero) {
		if(numero > 0 && numero < 26) {
			System.out.println("Intervalo [0,25]");
		}else if(numero > 25 && numero < 51) {
			System.out.println("Intervalo [26,50]");
		}else if (numero > 50 && numero < 76) {
			System.out.println("Intervalo [50,75]");
		}else if(numero > 75 && numero < 101) {
			System.out.println("Intervalo [76, 100]");
		}else{
			System.out.println("Fora do intervalo!");
		}
	}
	
}
