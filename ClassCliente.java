package vamosCodificarAtv;

public class ClassCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client c = new Client();
		 
		 c.nome = "Weslley";
		 c.valorCompra = 20.00;
		 c.avalia= 10;
		 
		  System.out.println("Nome do cliente: " +c.nome);
		  System.out.println("Valor da Compra: " +c.valorCompra);
		  System.out.println("Avaliação: " +c.avalia);
		  c.compra();	
	}
						
}
