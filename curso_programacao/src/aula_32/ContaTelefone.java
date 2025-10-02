package aula_32;

public class ContaTelefone {
	private String numeroCliente;
	private double valorConta;
	private int minutos;
	
	public String getNumeroCliente() {
		return numeroCliente;
	}
	public void setNumeroCliente(String numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	public double getValorConta() {
		return valorConta;
	}
	public void setValorConta() {
		if(this.minutos < 100) {
		this.valorConta = 50.00;	
		}else{
		int resto = this.minutos  - 100;
		this.valorConta = 50 + (resto * 2);
		}
	
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
	

}
