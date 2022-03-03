package Atividades;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
		//expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		Scanner leia = new Scanner (System.in);
		
	int TotalSeg, DivSeg, Seg, Min, H;
	
	System.out.println("DIgite  o tempo de duração do expressa em segundos: ");
	TotalSeg =  leia.nextInt();
	
	DivSeg = TotalSeg % 3600;
	H = (TotalSeg - DivSeg) / 3600;
	Min = DivSeg / 60;
	Seg = DivSeg % 60;
	
	System.out.println("Total: "+ H + " Horas," +Min+ " minutos,"+Seg+ " Segundos.");
	}

}
