package dominio;

public class Student extends UserAcademico{


    private String studenType;
    private String status;


    public Student(int userId, String userName, String lasName, String email, String phone, int password, String studenType, String status) {
        super(userId, userName, lasName, email, phone, password);
        this.studenType = studenType;
        this.status = status;
    }

    private Student(){
        super();

    }

    public String getStudenType() {
        return studenType;
    }

    public void setStudenType(String studenType) {
        this.studenType = studenType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
