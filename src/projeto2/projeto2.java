package projeto2;

import java.util.Scanner;

public class projeto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner grava = new Scanner (System.in);
		
		System.out.println("Programa de tabuada.");
		System.out.println("Digite o número que deseja visualizar a tabuada:");
		int numero;
		int x;
		numero=grava.nextInt();
		for(x=1; x<=10; x++) {
			System.out.println(numero + "x" + x + "="+ (numero*x));
		}

	}

}
