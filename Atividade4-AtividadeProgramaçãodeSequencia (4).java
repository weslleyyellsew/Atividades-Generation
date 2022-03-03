package Atividades;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		double a, b, c, r, s, d;
		
		System.out.println("digite um numero pra A: ");
		a = leia.nextInt();
		
		System.out.println("digite um numero pra B: ");
		b = leia.nextInt();
		
		System.out.println("digite um numero pra C: ");
		c = leia.nextInt();
		
		r = (a + b) * (a + b); //36
		s = (b + c) * (b + c); //81
		d = (r + s)  / 2; //117
		
		System.out.println("Então D = (r + s) / 2 é: " + d);
		
		
		

	}

}
