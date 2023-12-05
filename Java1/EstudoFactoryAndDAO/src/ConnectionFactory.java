
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private String url = "jdbc:mysql://localhost:3306/itens";
	private String user = "root";
	private String password = "dsa321#@!";
	private Connection connection;
	
	//public ConnectionFactory(Connection connection) {
	//	this.connection = connection;
	//}
	public Connection getConnection() {
		try {
			connection = DriverManager.getConnection(url,user,password);
			System.out.println("Conectado com Sucesso");
			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return connection = null;
			//e.printStackTrace();
		}
		//return connection = null;
	}
	
	
	
}
