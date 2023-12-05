import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
		private String urlConnection = "jdbc:mysql://127.0.0.1:3306/";
		private String nomedb = "dbcasdastrogeral?user=root";
		private String user = "castellani";
		private String senha = "Caste#@!321llani";
		private String timezone = "useTimezone=true&serverTimezone=UTC";
		
		private Connection conn = null;
		private Statement statement;
		private ResultSet resultSet;
		
		public String getUrlConnection() {
			return urlConnection;
		}
		public void setUrlConnection(String urlConnection) {
			this.urlConnection = urlConnection;
		}
		public String getNomedb() {
			return nomedb;
		}
		public void setNomedb(String nomedb) {
			this.nomedb = nomedb;
		}
		public String getUser() {
			return user;
		}
		public void setUser(String user) {
			this.user = user;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		
		public ConnectionFactory () {
			this.urlConnection = urlConnection;
			this.nomedb = nomedb;
			this.user = user;
			this.senha = senha;
			this.timezone = timezone;
			//jdbc:mysql://localhost:3306/?user=root
		}
		
		
	public void conectaDB(){
		try {
			conn =  DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dbcasdastrogeral", user, senha);
			if(conn != null) {
				System.out.println("Conexão criada com sucesso " + user + "!!"+ conn);
				} 
			} catch (Exception e ) {
			System.out.println("ERRO DE CONEXÃO  " + e.getMessage());
			System.out.println(urlConnection +  nomedb + timezone +","+ user +","+ senha);
			}
		//Statement stm = connection.createStatement();		
		//ResultSet rst = stm.getResultSet();
		//connection.close();
	}
	public boolean desconectDB() {
		try {
			conn.close();
			return true;
		} catch (Exception e) {
			System.out.println("Erro de Conexão"+e.getMessage());
			return false;
		}
	}

	public void insertDB(String a) {
		try {
		Statement stm = conn.createStatement();
		stm.execute(a);
		} catch (Exception e) {
			System.out.println("Falha no engano" + e.getMessage());
		}
		}
	public void lerDB(String b) {
		try {
			this.statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			this.resultSet = this.statement.executeQuery(b);
		}catch (Exception e){
			System.out.println("Falha no engano2" + e.getMessage());
		}
	}
	

}


