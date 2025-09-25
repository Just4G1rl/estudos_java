package exercicio_1;

public class Produto {
	private String produto;
	private double valor;
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void descricao() {
		System.out.printf("%s, com o valor de R$%.2f%n", this.produto, this.valor);
	}
}
