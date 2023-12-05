import java.sql.SQLException;

public class TestaInsert {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ConnectionFactory connection = new ConnectionFactory();
		connection.conectaDataBase();
		ModelDAO DAO = new ModelDAO(connection.connectaDB());
		DAO.insertNewIten("Abobrinha", "Hortifrut");
		connection.fechaConexaoDataBase();
		
	}

}
