import java.text.SimpleDateFormat;

public class Student {
  private String name;
  private int idNumber;

  public Student(String name, int idNumber) {
      this.name = name;
      this.idNumber = idNumber;
  }

  public String getName() {
      return name;
  }

  public int getIDNumber() {
      return idNumber;
  }
  public String getInfo() {
    return "|Имя: " + name + "| Id: " + idNumber;
  }
}