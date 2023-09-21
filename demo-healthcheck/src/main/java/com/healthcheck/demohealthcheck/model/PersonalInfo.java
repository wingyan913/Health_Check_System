package com.healthcheck.demohealthcheck.model;

import java.util.List;
import com.healthcheck.demohealthcheck.model.enums.AgeGroup;
import com.healthcheck.demohealthcheck.model.enums.Gender;
import com.healthcheck.demohealthcheck.model.exception.InvalidFormatException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
public class PersonalInfo {
    @NonNull private String firstname;
    private String lastname;
    @NonNull private String age;
    @NonNull private String gender;
    @NonNull private String email;

    public PersonalInfo(String firstname, String lastname, String age, String gender, String email) {
        try {
            this.setFirstname(firstname);
        } catch(InvalidFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Please input a valid firstname format.");
        }

        try {
            this.setLastname(lastname);
        } catch(InvalidFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Please input a valid lastname format.");
        }

        try {
            this.setAge(age);
        } catch(NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("We support ages between 18-80 only.");
        }

        try {
            this.setGender(gender);
        } catch(InvalidFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Please input either (M / F).");
        }

        try {
            this.setEmail(email);
        } catch(InvalidFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Please input a valid email format.");
        }


    }

    public void setFirstname(String firstname) throws InvalidFormatException {
        if (!isAllLetter(firstname))
            throw new InvalidFormatException("Invalid firstname format. Only (A-Z), (a-z) are allowed.");
        this.firstname = firstname;
    }

    public void setLastname(String lastname) throws InvalidFormatException {
        if (!isAllLetter(lastname))
            throw new InvalidFormatException("Invalid lastname format. Only (A-Z), (a-z) are allowed.");
        this.lastname = lastname;
    }

    public static boolean isAllLetter(String input) {
        String check = "^[A-Za-z]+$";
        return input.matches(check);
    }

    public void setAge(String age) throws NumberFormatException {
        int ageNum;
        try {
            ageNum = Integer.parseInt(age);
            if (ageNum >= 18 && ageNum <= 80) {
                this.age = String.valueOf(ageNum);
            } else {
                throw new NumberFormatException("Invalid age.");
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Sorry, the input age is not supported.");
        }
    }

    public void setGender(String gender) throws InvalidFormatException {
        String uppercaseGender = gender.toUpperCase();
        if (uppercaseGender.equals("M") || uppercaseGender.equals("F"))
            this.gender = uppercaseGender;
        else {
            throw new InvalidFormatException("Invalid gender. Input: (M/ F).");
        }
        
    }

    public void setEmail(String email) throws InvalidFormatException {
        if (!isValidEmail(email))
            throw new InvalidFormatException("Invalid email format.");
        this.email = email;
    }

    public static boolean isValidEmail(String email) throws InvalidFormatException {
        String emailFormat = "^[A-Za-z0-9]+@[A-Za-z0-9]+\\.com$";
        if (email.isBlank() || !email.matches(emailFormat))
            throw new InvalidFormatException("Invalid email format.");
        return true;
    }

    // public static void main(String[] args) {
    //     PersonalInfo p = new PersonalInfo("12", "lll", "s", "a", "c@ema.com");
    //     System.out.println(p);
    // }

}
