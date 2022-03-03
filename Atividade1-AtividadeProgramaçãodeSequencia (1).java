package Atividades;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Faça um sistema que leia  idade de uma pessoa expressa em anos, meses e
		//dias e mostre-a expressa apenas em dias.
		
		Scanner leia = new Scanner (System.in);		
				
		int diaN, mesN, anoN, somaD;
		
		System.out.println("Digite quantos dias vc tem: ");
		diaN = leia.nextInt();
		System.out.println("Digite quantos meses vc tem: ");
		mesN = leia.nextInt();
		System.out.println("Digite sua idade em ano: ");
		anoN = leia.nextInt();

		System.out.println();
		

		 somaD = (anoN * 365) + (mesN * 30) + diaN ;
		
		 System.out.println("SUa idade em dias é: " + somaD);
	}

}
