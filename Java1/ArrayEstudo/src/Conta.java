
public class Conta {
	private String nome;
	private int agencia,nmrconta;
	
	public Conta(int agencia, int nmrconta) {
		this.agencia = agencia;
		this.nmrconta = nmrconta;
	}
	public int getConta(){
		return this.nmrconta;
	}
	
	
	
}
