package br.generation.repeticao;
import java.util.Scanner;

public class AtividadePrioritario1 {
	// Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int num1, num2, num3, maior=0, meio=0, menor=0;
	
		System.out.println("Digite um n�mero: ");
		num1 = entrada.nextInt();
		 
		if (num1 <= maior) {
			maior = num1;
		}
		
		System.out.println("Digite um n�mero: ");
		num2 = entrada.nextInt();
		
		if (num2 >= maior) {
			meio = maior;
			maior = num2;
		}
		else {
			meio = num2;
		}

		System.out.println("Digite um n�mero: ");
		num3 = entrada.nextInt();
		
		if(num3 >= maior) {
			menor = meio;
			meio = maior;
			maior = num3;
		}
		else if(num3 >= meio) {
			menor = meio;
			meio = num3;
		}
		
		System.out.println("O maior n�mero �: " + maior + "." );
}
}