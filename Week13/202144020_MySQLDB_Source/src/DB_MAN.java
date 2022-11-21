import java.io.IOException;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

/**
 *
 * @author hansohee
 */

public class DB_MAN {
    String strDriver = "com.mysql.cj.jdbc.Driver";
    String strURL = "jdbc:mysql:/(다른 학우 ip)/mydb?characterEncoding=UTF-8&serverTimezone=UTC";
    String strUser = "root";
    String strPWD = "inha1958";
    
    Connection DB_con;
    Statement DB_stmt;
    ResultSet DB_rs;
            
    public void dbOpen() throws IOException {
        try {
            Class.forName(strDriver);
            
            DB_con = DriverManager.getConnection(strURL, strUser, strPWD);
            DB_stmt = DB_con.createStatement();
        } catch (Exception e) {
            System.out.println("SQL Exception : " + e.getMessage());
        }
    }
    
    public void dbClose() throws IOException {
        try {
        DB_stmt.close();
        DB_con.close();
    } catch (Exception e) {
        System.out.println("SQL Exception : " + e.getMessage());
    }
    }
}

