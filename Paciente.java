package vamosCodificarAtv;

public class Paciente {
	
    	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
		private String nome;
    	private String end;
    	private int idade;
    	private String quadro;
		public String getQuadro() {
			return quadro;
		}
		public void setQuadro(String quadro) {
			this.quadro = quadro;
		}
}
