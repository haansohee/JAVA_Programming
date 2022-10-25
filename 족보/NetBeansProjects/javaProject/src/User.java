/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author junhyeok
 */
public class User {
    private Integer userKey;    //primary Key (oracle DB 에서 스퀸스 사용 추가)
    // CREATE SEQUENCE users_seq START WITH 1 INCREMENT BY 1 MAXVALUE 200 NOCYCLE NOCACHE;
    // users_seq.NEXTVAL
    private String userName;    // 유저 이름
    private String userID;      // 유저 아이디
    private String userPWD;// 유저 비밀번호
    private String userEmail;   // 유저 이메일 
    private String userCreated; // 유저 회원가입 일자
    
    public User() {}
    
    // userKey는 oracleDB에서 시퀸스 이용하여 자동 추가하므로, 생성자에 userKey를 사용 안함
    public User(String userName, String userID, String userPWD, String userEmail, String userCreated) {
        this.userName = userName;
        this.userID = userID;
        this.userPWD = userPWD;
        this.userEmail = userEmail;
        this.userCreated = userCreated;
    }
    
    // 게터 세터
    public Integer getUserKey() { return userKey; }
    public void setUserKey(int userKey) { this.userKey = userKey; }
    
    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }
    
    public String getUserID() { return userID; }
    public void setUserID(String userId) { this.userID = userID; }
    
    public String getUserPWD() { return userPWD; }
    public void setUserPWD(String userPWD) { this.userPWD = userPWD; }
    
    public String getUserEmail() { return userEmail; }
    public void setUserEmail(String userEmail) { this.userEmail = userEmail; }
    
    public String getUserCreated() { return userCreated; }
    public void setUserCreated(String userCreated) { this.userCreated = userCreated; }
}
