import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import javax.sql.DataSource;

public class ConnectionFactory {
	private Connection connection = null;
	private String url,password,user;
	public DataSource dataSource;
	
	public Connection connectaDB() throws SQLException {
		this.url = "jdbc:mysql://localhost:3306/cadastroitem";
		this.user = "castellani";
		this.password = "Caste#@!321llani";
		connection = DriverManager.getConnection(this.url, this.user, this.password);
		System.out.println("conexão Criada");
		return connection;
	}
		
		
	public ConnectionFactory() {
		this.url = "jdbc:mysql://localhost:3306/cadastroitem";
		this.user = "castellani";
		this.password = "Caste#@!321llani";
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl(this.url);
		comboPooledDataSource.setUser(this.user);
		comboPooledDataSource.setPassword(this.password);
		
		
		this.dataSource = comboPooledDataSource;
	}
	public Connection conectaDataBase() throws SQLException {
		return this.dataSource.getConnection();
	}
	public Connection fechaConexaoDataBase() throws SQLException {
		connection.close();
		System.out.println("Fechando a conexão");
		return connection = null;
	}
}
