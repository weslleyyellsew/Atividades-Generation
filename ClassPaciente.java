package vamosCodificarAtv;

public class ClassPaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paciente c = new Paciente ();
		
		c.setNome("Weslley");
		c.setIdade(19);
		c.setEnd("Rua: BemGayzinha");
		c.setQuadro("Beleza");
		
		System.out.println("Nome: " + c.getNome());
		System.out.println("Idade: " + c.getIdade());
		System.out.println("Endereço: " + c.getEnd());
		System.out.println("Quadro: " + c.getQuadro());


	}

}
