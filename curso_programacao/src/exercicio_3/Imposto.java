package exercicio_3;

public class Imposto {
	private double taxa;
	
	public double getTaxa() {
		return taxa;
	}
	public void calculo (double salario) {
		if(salario > 0 && salario <= 2000) {
			this.taxa = 0;
		}else if(salario <= 3000) {
			this.taxa = (salario - 2000) * 0.08;
		}else if(salario <=4500){
			this.taxa =(salario - 3000) * 0.18 + 1000 * 0.08;	
		}else {
			this.taxa = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
		}
	}
	
	public void resultado() {
		if(this.taxa == 0) {
			System.out.println("Insento");
		}else {
			System.out.printf("R$%.2f", this.taxa);
		}
	}
}
