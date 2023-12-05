import java.sql.SQLException;

public class ProgramBase {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory conn = new ConnectionFactory();
		conn.getConnection();
		ItensDAO itenInsert = new ItensDAO(conn.getConnection());
		
		// INSERT ITEM
		//itenInsert.insertItem("Queijo Brie", "Laticínios");
		
		// DELETE ITEM
		//itenInsert.deleteItem("Queijos");
		
		// LISTAGEM DA DATABASE
		System.out.println(itenInsert.listarDatabase());
	}

}
