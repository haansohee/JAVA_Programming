

import java.sql.*;
import java.io.*;
import java.util.*;

public class DB_MAN {
    String strDriver = "oracle.jdbc.driver.OracleDriver";
//    String strURL = "jdbc:oracle:thin:@10.40.45.57:1521";
    String strURL = "jdbc:oracle:thin:@localhost:1521";
    String strUser = "wnsgur";
    String strPWD = "wns600218";
    
    Connection DB_con;
    Statement DB_stmt;
    ResultSet DB_rs;
    
    public void dbOpen() throws IOException {
        try {
            Class.forName(strDriver);
            DB_con = DriverManager.getConnection(strURL, strUser, strPWD);
            DB_stmt = DB_con.createStatement();
        } catch (Exception e) {
            System.out.println("SQLException : " + e.getMessage());
        }
    }
    
    public void dbClose() throws IOException {
        try {
            DB_stmt.close();
            DB_con.close();
        } catch (Exception e) {
            System.out.println("SQLException : " + e.getMessage());
        }
    }
    
}
