package br.generation.repeticao;

import java.util.Scanner;

public class AtividadePrioritaro3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
		categoria ela se encontra:
			 10-14 infantil
			 15-17 juvenil
			 18-25 adulto*/
		
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua IDADE: ");
		idade = entrada.nextInt();
		
		if (idade >=10 && idade <=14) {
			System.out.println("Sua categoria é INFANTIL! ");
		}
		else if(idade >=15 && idade<=17){
			System.out.println("Sua categoria é JUVENIL!");
		}
		else if(idade >=18 && idade ==25){
			System.out.println("Sua categoria é ADULTO!");
		}
		else if(idade <10){
			System.out.println("Não existe categoria para menor de 10 anos.");
		}
		else if(idade >25){
			System.out.println("Não existe categoria para maior de 25 anos.");
		}
		}

}
