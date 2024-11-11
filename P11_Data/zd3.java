class zd3_Student {
  String idNumber;
  double gpa;
  Date birthDate;

  Student(String id, double gpa, Date birthDate) {
      this.idNumber = id;
      this.gpa = gpa;
      this.birthDate = birthDate;
  }

  @Override
  public String toString() {
      return "Student{" +
              "idNumber='" + idNumber + '\'' +
              ", gpa=" + gpa +
              ", birthDate=" + formatBirthDate() +
              '}';
  }

  private String formatBirthDate(String format) {
      if (birthDate == null) {
          return "";
      }
      SimpleDateFormat sdf = new SimpleDateFormat(format);
      return sdf.format(birthDate);
  }

  public Date getBirthDate() {
      return birthDate;
  }

  void setBirthDate(Date birthDate) {
      this.birthDate = birthDate;
  }
}
