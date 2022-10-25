

import java.sql.*;
import java.io.*;
import java.util.*;

public class DB_MAN {
//    String strDriver = "oracle.jdbc.driver.OracleDriver";
//    String strURL = "jdbc:oracle:thin:@10.70.41.109:1521";
    
//    String strUser = "INHATC";
//    String strPWD = "inha1958";
    
//    String strURL = "jdbc:oracle:thin:@localhost:1521";
//    String strUser = "wnsgur";
//    String strPWD = "wns600218";
    
    String strDriver = "com.mysql.cj.jdbc.Driver";
    String strURL = "jdbc:mysql://10.70.41.116:3306/mydb?characterEncoding=UTF-8&serverTimezone=UTC";
    String strUser = "root";
    String strPWD = "inha1958";
    
    
//    String strDriver = "com.mysql.cj.jdbc.Driver";
//    String strURL = "jdbc:mysql://127.0.0.1:3306/mydb?characterEncoding=UTF-8&serverTimezone=UTC";
//    String strUser = "root";
//    String strPWD = "wns600218";
    
    Connection DB_con;
    Statement DB_stmt;
    ResultSet DB_rs;
    
    public void dbOpen() throws IOException {
        try {
            Class.forName(strDriver);
            DB_con = DriverManager.getConnection(strURL, strUser, strPWD);
            DB_stmt = DB_con.createStatement();
        } catch (Exception e) {
            System.out.println("SQLExceptionDBOPEN : " + e.getMessage());
        }
    }
    
    public void dbClose() throws IOException {
        try {
            DB_stmt.close();
            DB_con.close();
        } catch (Exception e) {
            System.out.println("SQLExceptionDBCLOSE : " + e.getMessage());
        }
    }
    
}
