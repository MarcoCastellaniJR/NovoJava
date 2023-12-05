public class CRUDdatabase {
	public static void main(String[] args) throws Exception {
		
		ConnectionFactory con = new ConnectionFactory();
		//con.conecta();
		//con.insertDB("Marco","Castellani",22);
		//con.conecta();
		ComunicacaoDAO inset = new ComunicacaoDAO(con.conecta());
		inset.onlyInsertDataBase("Sueli", "Nardini", 45);
		System.out.println(inset.listar());
		
	}
}
