package Enum;

public enum AgeGroup {
  ERROR("Error"),
  INFANT_AND_TODDLERS("Infants and Toddlers"),
  CHILD("Child"),
  ADOLESCENT("Adolescent"),
  ADULT("Adult"),
  ELDERLY("Elderly");

  private String displayName;

  private AgeGroup(String displayName) {
    this.displayName = displayName;
  }

  public String getDisplayName() {
    return this.displayName;
  }
  public static AgeGroup defineAgeGroup(int age) {
    if (age < 0 || age > 123) {
      //System.out.println("Invalid. Input again.");
      System.out.println("Input again la! 唔好搞事呀");
    }
    else if (age < 2) {
      return INFANT_AND_TODDLERS;
    }
    else if (age < 12) {
      return CHILD;
    }
    else if (age < 18) {
      return ADOLESCENT;
    }
    else if (age < 65) {
      return ADULT;
    }
    else if (age >= 65) {
      return ELDERLY;
    }
    return ERROR;
  }
}
