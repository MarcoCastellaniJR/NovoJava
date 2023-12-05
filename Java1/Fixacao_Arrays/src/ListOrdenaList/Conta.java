package ListOrdenaList;


public class Conta implements Comparable<Conta>{
	private int idConta;
	private String nomeConta;
	
	public Conta(String nomeConta, int idConta) {
		this.idConta = idConta;
		this.nomeConta = nomeConta;
	}
	public String getConta() {
		return "Conta de ID: " + this.idConta + " Nome da Conta: " + nomeConta;
	}
	public int getIdConta() {
		return idConta;
	}
	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}
	public String getNomeConta() {
		return nomeConta;
	}
	public void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}
	public String toString() {
		return "Nome: " + this.nomeConta + " ID: " + this.idConta;
	}
	public int compareTo(Conta outraConta) {
		return this.nomeConta.compareTo(outraConta.getNomeConta());
	}
	
}
