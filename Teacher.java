package dominio;

public class Teacher extends UserAcademico {

  private  String speciality;

    public Teacher(int userId, String userName, String lasName, String email, String phone, int password, String speciality) {
        super(userId, userName, lasName, email, phone, password);
        this.speciality = speciality;
    }

    public Teacher(){

  }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
