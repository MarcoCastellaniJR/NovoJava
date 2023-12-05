
public class Pessoa {
		
		String nome;
		String sobrenome;
	
	
	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public String toString() {
		return "Nome: " + this.nome + " " + this.sobrenome;
	}
}
