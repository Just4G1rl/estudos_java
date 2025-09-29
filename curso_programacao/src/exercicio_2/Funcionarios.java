package exercicio_2;

public class Funcionarios {
	private int numeroRegistro;
	private int horasTrabalhadas;
	private double salario;
	
	public int getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double salarioMensal () {
		
		int horasTrabalhadas = this.horasTrabalhadas;
		double salario = this.salario;
		double salarioMensal = horasTrabalhadas*salario;
		return salarioMensal;
	}
	
	public void detalhes() {
		System.out.printf("Numero: %d %nSalário:%.2f", numeroRegistro, salarioMensal());
	}
}
