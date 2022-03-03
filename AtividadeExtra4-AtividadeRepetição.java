package br.generation.repeticao;

import java.util.Scanner;

public class AtividadeExtra4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int num;
		double raiz, potencia;
		
		System.out.println("Digite um numero inteiro: ");
		num = leia.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("PAR....");
			raiz = Math.sqrt(num); //--> raiz
			System.out.println("Raiz Quadrada " + raiz);
		}
		else {
			System.out.println("IMPAR....");
			potencia = Math.pow(num, 2);
			System.out.println("Potencia " + potencia);
		} 
		
	}

}
