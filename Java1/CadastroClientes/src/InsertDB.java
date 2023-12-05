import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertDB {
	String urlConnection = "jdbc:mysql://localhost/dbcasdastrogeral";
	String user = "root";
	String senha = "Castellani#@!321";

	public void insertDB() throws SQLException {
		Connection connection = DriverManager.getConnection(urlConnection, user, senha);
		Statement stm = connection.createStatement();
		stm.execute("INSERT INTO infocliente (nome,sobrenome,cpf,rua,bairro,nmrcasa,telefone,sexo) VALUES ("
				+ "'Marco','Castellani','43931142809','José Cairos de Freitas','Penhão',1,'19981473772','M')", Statement.RETURN_GENERATED_KEYS);
		

	}

}
