import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private String urlConnection = "jdbc:mysql://127.0.0.1:3306/dbcasdastrogeral?user=root";
	private String user = "castellani";
	private String senha = "Caste#@!321llani";
	//private String timezone = "useTimezone=true&serverTimezone=UTC";
	
	Connection conn = null;
	ComunicacaoDAO database = new ComunicacaoDAO(conn);
	
	public Connection conecta(){
		try {
			conn = DriverManager.getConnection(this.urlConnection, this.user, this.senha);
			if(conn != null) {
			System.out.println("conectou corretamente");
			return conn;
			}
		} catch (Exception ex) {
			ex.getMessage();
		}
		return conn = null;
		}
	public void fechaConexao() throws SQLException {
		conn.close();
	}
	
	public void insertDB(String insertNome,String insertSobrenome, int insertIdade) throws SQLException {
		conecta();
		try {
			database.onlyInsertDataBase(insertNome, insertSobrenome, insertIdade);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fechaConexao();
			}}}
	

