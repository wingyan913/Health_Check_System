package Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Enum.AgeGroup;
import Enum.Gender;

public class PersonalData {
  private String firstName;
  private String lastName;
  private Gender gender;
  private AgeGroup ageGroup;
  private List<String> store;

  // Constructor
  public PersonalData() {
    this.store = new ArrayList<>();
  }

  public PersonalData(String firstName, String lastName, Gender gender,
      AgeGroup ageGroup) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.ageGroup = ageGroup;
  }

  public List<String> getList() {
    return this.store;
  }

  // Method
  public void inputPersonalData() {
    Scanner input = new Scanner(System.in);
    System.out.println("First Name: ");
    this.firstName = input.next();
    store.add(this.firstName);
    System.out.println("Last name: ");
    this.lastName = input.next();
    store.add(this.lastName);

    boolean isValid = false;
    while (!isValid) {
      System.out.println("M (Male) or F (Female): ");
      String genderInput = input.next().toUpperCase();
      if (genderInput.equals(Gender.MALE.getGender().toString())) {
        this.gender = Gender.MALE;
        isValid = true;
        store.add(Gender.MALE.toString());
      } else if (genderInput.equals(Gender.FEMALE.getGender().toString())) {
        this.gender = Gender.FEMALE;
        isValid = true;
        store.add(Gender.FEMALE.toString());
      } else {
        System.out.println("Invalid gender.");
      }

    }

    isValid = false;
    while (isValid == false) {
      System.out.println("Age: ");
      this.ageGroup = AgeGroup.defineAgeGroup(input.nextInt());
      if (this.ageGroup != AgeGroup.ERROR) {
        isValid = true;
      }
    }
    store.add(this.ageGroup.toString());
    System.out.println(this.ageGroup);

    input.close();
  }

  public Gender getGender() {
    return this.gender;
  }
}


