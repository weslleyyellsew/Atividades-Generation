package AtividadesVetorMatriz;
import java.util.Random;
public class AtividadeVetorMatrizExemplo3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Random sorteio = new Random();

		int [][] N1 = new int[4][6];
		int [][] N2 = new int[4][6];
		int [][] M1 = new int[4][6];
		int [][] M2 = new int[4][6];
		
				for(int l=0; l<4; l++) {
					for (int c=0; c<6; c++) {
						
		N1[l][c] = sorteio.nextInt(10);
		N2[l][c] = 	sorteio.nextInt(10);
		
		M1[l][c] = N1[l][c] + N2[l][c];
		M2[l][c] = N1[l][c] - N2[l][c];			
					}
				}
		System.out.println("Matriz N1");
		 for(int l = 0; l<4; l++) {
		 	for(int c = 0; c<6; c ++) {
		 		System.out.print("|" +N1[l][c]+ "|" );
		 	}
		 	System.out.println();
		 }
		 System.out.println("Matriz N2");
		 for(int l = 0; l<4; l++) {
		 	for(int c = 0; c<6; c ++) {
		 		System.out.print("|" +N2[l][c]+ "|" );
		 	}
		 	System.out.println();
		 }
		 System.out.println("Matriz M1");
		 for(int l = 0; l<4; l++) {
		 	for(int c = 0; c<6; c ++) {
		 		System.out.print("|" +M1[l][c]+ "|" );
		 	}
		 	System.out.println();
		 }
		 System.out.println("Matriz M2");
		 for(int l = 0; l<4; l++) {
		 	for(int c = 0; c<6; c ++) {
		 		System.out.print("|" +M2[l][c]+ "|" );
		 	}
		 	System.out.println();
		 }
						
	
	}

}
 