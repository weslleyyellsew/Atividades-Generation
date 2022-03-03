package Atividades;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		//expressa em anos, meses e dias.

		Scanner leia = new Scanner (System.in);
			//Anos   //Meses  //Dias
		int totalD1, totalD2,totalD3, dia, mes, ano;
		
		System.out.println("DIgite sua idade em expressa em dias: ");
		dia = leia.nextInt();
		
		totalD1 = dia / 365;
		
		System.out.println("Anos: " + totalD1);
		
		totalD2 = (dia % 365) / 30;
		
		System.out.println("Meses: " + totalD2);
		
		totalD3 = (dia % 365) % 30;
		
		System.out.println("Dias: " + totalD3);
				
	}

}
