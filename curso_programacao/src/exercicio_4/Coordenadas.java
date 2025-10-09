package exercicio_4;

import java.util.Scanner;

public class Coordenadas {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Informe a primeira coordenada:");
		int x = scn.nextInt();
		System.out.println("Informe a segunda coordenada:");
		int y = scn.nextInt();
		
		while(x != 0 && y != 0) {
			System.out.println("Informe a primeira coordenada:");
			x = scn.nextInt();
			System.out.println("Informe a segunda coordenada:");
			y = scn.nextInt();
		}
		scn.close();
	}
}
