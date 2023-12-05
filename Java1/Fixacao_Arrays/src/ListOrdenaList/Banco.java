package ListOrdenaList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Banco {
	private int idBanco;
	private int idAgencia;
	private List<Conta> contaList = new LinkedList<Conta>();
	
	public Banco(int idBanco, int idAgencia) {
		this.idBanco = idBanco;
		this.idAgencia = idAgencia;
	}
	
	public int getIdBanco() {
		return idBanco;
	}
	public void setIdBanco(int idBanco) {
		this.idBanco = idBanco;
	}
	public int getIdAgencia() {
		return idAgencia;
	}
	public void setIdAgencia(int idAgencia) {
		this.idAgencia = idAgencia;
	}
	public void adicionaConta(Conta conta) {
		contaList.add(conta);	
	}
	public List<Conta> getContas() {
		return Collections.unmodifiableList(contaList);
	}
	
	//public ArrayList<Conta> ordenado(ArrayList<Conta> contaList){
		//ArrayList<Conta> arrumar = (ArrayList<Conta>) this.contaList;
	//		List<Conta> ordem = new ArrayList<>(contaList);
	//		Collections.sort(ordem);
	//	}
	
	
}
