package exercicio_2;

public class CaixaRegistradora {
	private int codItem;
	private int quantItem;
	private double valorItem;
	
	
	
	public int getCodItem() {
		return codItem;
	}


	public void setCodItem(int codItem) {
		this.codItem = codItem;
	}


	public int getQuantItem() {
		return quantItem;
	}


	public void setQuantItem(int quantItem) {
		this.quantItem = quantItem;
	}


	public double getValorItem() {
		return valorItem;
	}


	public void setValorItem(double valorItem) {
		this.valorItem = valorItem;
	}


	public double valorCompra() {
		
		return this.quantItem * this.valorItem;
	}
	
}
