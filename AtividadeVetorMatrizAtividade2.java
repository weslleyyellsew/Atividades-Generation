package Atividades;
import java.util.Random;

public class Ex02Lista03 {

	public static void main(String[] args) {
		//Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
		//que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
		//imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
		//quantas foram as ocorr�ncias da maior pontua��o.

		Random lance = new Random();
		
		int cont,soma=0, ocorr=0, maior=0;
		int[]dado = new int[10];
		double media;
		for(cont = 0; cont <10; cont++) {
			dado[cont] = lance.nextInt(6)+1;
		 	
		 	if(dado[cont]> maior) {
		 		maior = dado[cont];
		 			ocorr=1;
		 	}
		 	else if(dado[cont]==maior) {
		 			ocorr++;
		 	}
		 	soma += dado[cont];
				 }
			for (cont = 0; cont <10; cont++) {
			System.out.println("|" +dado[cont]+ "|");
		 }
			System.out.println("A m�dia de valor dos lances �: " + soma/10);
			System.out.println("A ocorr�ncia da pontua��o �: " + ocorr);
	}
}