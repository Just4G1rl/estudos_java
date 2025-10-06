package exercicio_3;

public class Caixa {
	private double total;
	
	public double getTotal() {
		return total;
	}

	public void caixa (int cod, int quant) {
		
		switch (cod) {
		case 1:
			this.total = quant * 4.00;
			break;
		case 2: 
			this.total = quant * 4.50;
			break;
		case 3:
			this.total = quant * 5.00;
			break;
		case 4:
			this.total = quant * 2.00;
			break;
		case 5:
			this.total = quant * 1.50;
			break;
			
		default:
			System.out.println("Código inválido!");
			break;
		}
	}
	
}
      