
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author junhyeok
 */
public class UserDAO {
    public UserDAO() {}
    
    public int idCheck(String userID) {
        String sql = "SELECT * FROM Users WHERE userID = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        int result = -1;
        try {
            conn = DBConn.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, userID);
            rs = pstmt.executeQuery();
            if(rs.next()) {
                System.out.println("아이디 중복");
                result = -1;
            } else {
                result = 1;
            }
        } catch(Exception e) {
            System.out.println("idCheck 실패");
            System.out.println(e.getMessage());
        } finally {
            try {
                if(rs != null) rs.close();
                if(pstmt != null) pstmt.close();
                if(conn != null) pstmt.close();
            } catch(Exception e) {
                System.out.println("DB 연결 해제 실패(UserDAO-idCheck())");
                System.out.println(e.getMessage());
            }
        }
        return result;
    }
    
    public int join(User data) {
        String sql = "INSERT INTO Users VALUES (users_seq.NEXTVAL, ?, ?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        int result = -1;
        try {
            User user = (User) data;
            conn = DBConn.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, user.getUserName());
            pstmt.setString(2, user.getUserID());
            pstmt.setString(3, user.getUserPWD());
            pstmt.setString(4, user.getUserEmail());
            pstmt.setString(5, user.getUserCreated());
            rs = pstmt.executeQuery();
            result = 1;
        } catch(Exception e) {
            System.out.println("join 실패");
            System.out.println(e.getMessage());
        } finally {
            try {
                if(rs != null) rs.close();
                if(pstmt != null) pstmt.close();
                if(conn != null) conn.close();
            } catch(Exception e) {
                System.out.println("DB 연결 해제 실패(UserDAO-join())");
                System.out.println(e.getMessage());
            }
        }
        
        return result;
    }
    
    public User login(String userID, String userPWD) {
        User user = new User();
        String sql = "SELECT * FROM Users WHERE userId = ? AND userPassword = ?";
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DBConn.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, userID);
            pstmt.setString(2, userPWD);
            rs = pstmt.executeQuery();
            
            if(rs.next()) {                
                user.setUserName(rs.getString("userName"));
                user.setUserID(rs.getString("userID"));
                user.setUserPWD(rs.getString("userPWD"));
                user.setUserEmail(rs.getString("userEmail"));
                user.setUserCreated(rs.getString("userCreated"));
            } else {
                System.out.println("정보 불일치");
                user = null;
            }
        } catch(Exception e) {
            System.out.println("RootJoin 실패");
            System.out.println(e.getMessage());
            user = null;
        } finally {
            try {
                if(rs != null) rs.close();
                if(pstmt != null) pstmt.close();
                if(conn != null) conn.close();
            } catch(Exception e) {
                System.out.println("DB 연결 해제 실패(RootJoinAction)");
                System.out.println(e.getMessage());
                user = null;
            }
        }
        
        return user;
    }
}
