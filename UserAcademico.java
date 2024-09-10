package dominio;

public class UserAcademico {

   private int userId;
    private String userName;
    private  String lasName;
    private String email;
    private String phone;
    private int password;


    // constructores

    public UserAcademico(){

    }

    public UserAcademico(int userId, String userName, String lasName, String email, String phone, int password) {
        this.userId = userId;
        this.userName = userName;
        this.lasName = lasName;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}


