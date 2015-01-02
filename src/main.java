import java.sql.*;

public class main {
	public static void main(String[] args){
		try (
			Connection conn = DriverManage.getConnection("jbdc:mysql://localhost/ebookshop","root", "");
			Statement stmt = conn.createStatement();	
			){
			  String strSelect = "select title, price, qty from books";
		         System.out.println("The SQL query is: " + strSelect); // Echo For debugging
		         System.out.println();
		 
		         ResultSet rset = stmt.executeQuery(strSelect);
		 
		         // Step 4: Process the ResultSet by scrolling the cursor forward via next().
		         //  For each row, retrieve the contents of the cells with getXxx(columnName).
		         System.out.println("The records selected are:");
		         int rowCount = 0;
		         while(rset.next()) {   // Move the cursor to the next row
		            String title = rset.getString("title");
		            double price = rset.getDouble("price");
		            int    qty   = rset.getInt("qty");
		            System.out.println(title + ", " + price + ", " + qty);
		            ++rowCount;
		         }
		         System.out.println("Total number of records = " + rowCount);
		 
		      } catch(SQLException ex) {
		         ex.printStackTrace();
		      }
		
	}
}
