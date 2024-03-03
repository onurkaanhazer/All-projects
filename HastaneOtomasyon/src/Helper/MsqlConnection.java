package Helper;
import java.sql.*;
public class MsqlConnection {
     Connection c=null;
     public MsqlConnection() {}
     
     public Connection connMsql() {
    	 try {
			this.c=DriverManager.getConnection("jdbc:MySQL://localhost:3306/hastaneotomasyon?user=root&password=Ankaramuğla1?");
			return c;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 return c;
     }
     
}
