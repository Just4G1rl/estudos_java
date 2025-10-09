package exercicio_4;

import java.util.Scanner;

public class PostoGasolina {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int quantAlcool = 0;
		int quantDisel = 0;
		int quantGasolina = 0;
		
		System.out.println("Escolha o tipo de combistível que irá abastecer (1.Álcool 2.Gasolina 3.Diesel)");
		int tipoCombustivel = scn.nextInt();
		while(tipoCombustivel !=4) {
			switch (tipoCombustivel) {
			case 1:
				quantAlcool+=1;
				break;
			case 2:
				quantGasolina+=1;
				break;
			case 3:
				quantDisel+=1;
				break;
			default:
				break;
			}
			
			tipoCombustivel = scn.nextInt();	
		}	
		System.out.printf("MUITO OBRIGADA %n");
		System.out.printf("Quantidade de alcool:%d %n", quantAlcool);
		System.out.printf("Quantidade de gasolina:%d %n", quantGasolina);
		System.out.printf("Quantidade de disel:%d %n", quantDisel);	
		
		scn.close();
	}
}
