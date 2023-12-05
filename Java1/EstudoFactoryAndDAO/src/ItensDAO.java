import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;


public class ItensDAO {
	private Connection connection;
	
	public ItensDAO(Connection connection) {
		this.connection = connection;
	}
	
	public void insertItem(String nome, String categoria) {
		
		String stringExecute = "INSERT INTO db_item (nome,categoria) VALUES (?,?)";
		try {
			PreparedStatement pstm = connection.prepareStatement(stringExecute);
			pstm.setString(1, nome);
			pstm.setString(2, categoria);
			pstm.execute();
			System.out.println("Publicado com sucesso no DataBase");
			System.out.println("Fechando conexão");
			connection.close();
		} catch (SQLException e) {
			System.out.println(" Ocorreu algum Erro " + e.getMessage());
		}}
	
	public void deleteItem(String nome) { // está funcionando mas preciso arranjar uma forma de avisa quando não tem o item no database
		String stringDelete = "DELETE FROM db_item where nome = ?";
		try { PreparedStatement pstm = connection.prepareStatement(stringDelete);
			pstm.setString(1, nome);
			pstm.execute();
			System.out.println("Fechando conexão");
			connection.close();
			
		}catch (SQLException e ){
			System.out.println(" Ocorreu algum Erro " + e.getMessage());
		}}
	
	public List<String> listarDatabase() throws SQLException{
		List<String> itens = new ArrayList<>();
		String executeListar = "SELECT * FROM db_item";
			PreparedStatement pstm = connection.prepareStatement(executeListar);
			pstm.execute();
			try {ResultSet rst = pstm.getResultSet();
			while(rst.next()) {
				String item = " ID: " + rst.getInt(1) + " Nome: " +  rst.getString(2) + " Categoria : " + rst.getString(3);
				itens.add(item);
			}
		return itens;
		} catch(SQLException e){
			return null;
		}
	}
	
}
