package exercicio_4;

import java.util.Scanner;

public class Senha {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Cadastre uma senha:");
		String senhaCadastro = scn.nextLine();
		System.out.println("Informe sua senha:");
		String senha = scn.nextLine();
		
		while(!senhaCadastro.equals(senha)){
			System.out.println("Senha inválida!");
			System.out.println("Tente novamente:");
			senha = scn.nextLine();
		}
		
		System.out.println("Acesso liberado!");
		scn.close();
	}
}