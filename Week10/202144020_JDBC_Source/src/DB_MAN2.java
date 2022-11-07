import java.sql.*;
import java.io.*;

public class DB_MAN2 {
    String url = "jdbc:mysql://127.0.0.1:3306/";
//    String dbName = "Automobile_64";
    String ID = "sohee";
    String PW = "wnsgur0702";
//    String strURL = "jdbc:odbc:Automobile_64";
    
    Connection DB_con;
    Statement DB_stmt;
    ResultSet DB_rs;
    
//    DB_MAN2() {
//        System.out.println("메서드 DB_MAN2 실행");
//        try {
//            System.out.println("try문 들어옴");
//            
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            System.out.println("Driver 로딩 성공!");
//            
//            DB_con = DriverManager.getConnection(url, ID, PW);
//            System.out.println("서버 연결 성공!");
//            
//            DB_stmt = DB_con.createStatement();
//        } catch (ClassNotFoundException e) {
//            System.out.println("드라이버 로딩 실패 : " + e.getMessage());
//        } catch (SQLException e) {
//            System.out.println("서버 연결 실패");
//        }
//    }
    
    
    public void dbOpen() throws IOException {
        System.out.println("dbOpen()");
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Driver 로딩 성공!");
            DB_con = DriverManager.getConnection(url, ID, PW);
            System.out.println("서버 연결 성공!");
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

    public static void main(String[] args) {
        new DB_MAN2();
    }
}
