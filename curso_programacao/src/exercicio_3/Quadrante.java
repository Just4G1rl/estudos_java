package exercicio_3;

public class Quadrante {
	public void quadrante (double x, double y) {
		if(x > 0 && y > 0) {
			System.out.println("Q1");
		}else if(x > 0 && y < 0) {
			System.out.println("Q2");
		}else if (x < 0 && y > 0) {
			System.out.println("Q3");
		}else if(x < 0 && y < 0) {
			System.out.println("Q4");
		}else {
			System.out.println("Origem");
		}
	}

}
