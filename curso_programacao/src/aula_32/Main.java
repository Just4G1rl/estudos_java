package aula_32;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner(System.in);
		
		ContaTelefone conta = new ContaTelefone();
		System.out.println("Informe o número do cliente:");
		String numeroCliente = scn.nextLine();
		conta.setNumeroCliente(numeroCliente);
		System.out.println("Informe a quantidade de minutos que o cliente usou no mês:");
		int minutos = scn.nextInt();
		conta.setMinutos(minutos);
		conta.setValorConta(); 
		
		System.out.printf("O valor da conta é:%.2f%n", conta.getValorConta());
				
	}
}
