package vamosCodificarAtv;

public class ClassConta  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta cb = new Conta();
		
		cb.setAgencia("4202");
		cb.setBanco("Carteira da Mãe");
		cb.setConta("6969");
		cb.setEndereco("Rua: Guarda-Roupa");
		
		System.out.println("Agencia: " + cb.getAgencia());
		System.out.println("Banco: " + cb.getBanco());
		System.out.println("Conta: " + cb.getConta());
		System.out.println("Endereco: " + cb.getEndereco());


	}

}
