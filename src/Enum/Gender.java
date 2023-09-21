package Enum;

public enum Gender {
  MALE("M"),
  FEMALE("F");

  private String gender;

  private Gender(String gender) {
    this.gender = gender;
  }

  public String getGender() {
    return this.gender;
  }
}
