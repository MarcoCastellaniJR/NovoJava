import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ModelDAO {
	public Connection conn;
	
	public ModelDAO(Connection connection) {
		this.conn = connection;
	}
	
	public void insertNewIten(String valor1, String valor2) throws SQLException {
		PreparedStatement pst = conn.prepareStatement("INSERT into db_cadastro_item (NOME,DESCRICAO) VALUES (?,?)",Statement.RETURN_GENERATED_KEYS);
		pst.setString(1, valor1);
		pst.setString(2, valor2);
		pst.execute();
		System.out.println("Item criado com sucesso Nome: " + valor1 + " Descrição: " + valor2);
	}
	
}
