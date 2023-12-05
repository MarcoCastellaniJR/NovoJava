import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class ComunicacaoDAO {
	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rst;
	public ComunicacaoDAO(Connection connection) {
		this.connection = connection;
	}
	
	public void onlyInsertDataBase(String insertNome,String insertSobrenome, int insertIdade) throws Exception {
		try {
			pst = connection.prepareStatement("INSERT INTO database_clientes (nome,sobrenome,idade) VALUES (?,?,?)");
			pst.setString(1, insertNome);
			pst.setString(2, insertSobrenome);
			pst.setInt(3, insertIdade);
			pst.execute();
			System.out.println("Insert do nome " + insertNome + " " + insertSobrenome + " De idade: " + insertIdade);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}}
	public List<String> listar() throws SQLException {
		List<String> pessoas = new ArrayList<>();
		System.out.println("Executando o método");
		String sqlExecute = "SELECT * FROM database_clientes";
		try(PreparedStatement prst = connection.prepareStatement(sqlExecute)){
			prst.execute();
			try(ResultSet rst = prst.getResultSet()){
				while(rst.next()) {
				    String pessoa = "ID:" + rst.getInt(1) + " Nome: " + rst.getString(2) + 
				    		 " " +  rst.getString(3) + 
				    		" Idade: "+ rst.getInt(4);

					System.out.println(pessoa);
					pessoas.add(pessoa);
				}
			}
			return pessoas;
		}
	}
	

}
