package com.healthcheck.demohealthcheck.model;

import com.healthcheck.demohealthcheck.model.exception.InvalidFormatException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
@Builder
public class Login {
    @NonNull private String username;
    @NonNull private String password;

    public Login(String username, String password) {
        try {
            this.setUsername(username);
        } catch(InvalidFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Please input a valid username format.");
        }

        try {
            this.setPassword(password);
        } catch(InvalidFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Please input a valid password format.");
        }
    }

    public void setUsername(String username) throws InvalidFormatException {
        if (!isValidUsername(username))
            throw new InvalidFormatException("Invalid Username format.");
        this.username = username;
    }

    public static boolean isValidUsername(String username)
            throws InvalidFormatException {

        String usernameFormat = "^[A-Za-z0-9_]+$";

        if (!username.matches(usernameFormat))
            throw new InvalidFormatException("Invalid Username format. Only (A-Z), (a-z), (0-9), (_) are allowed.");
        if (username.length() < 5 || username.length() > 10)
            throw new InvalidFormatException("Invalid Username length. Characters limit: (5-10)");
        return true;
    }

    public void setPassword(String password) throws InvalidFormatException {
        if (!isValidPassword(password))
            throw new InvalidFormatException("Invalid Password length. Characters limit: (5-20)");
        this.password = password;
    }

    public static boolean isValidPassword(String password)
            throws InvalidFormatException {
        if (password.isBlank() || password.length() < 5 || password.length() > 20)
            throw new InvalidFormatException("Invalid Password length. Characters limit: (5-20)");
        return true;
    }

    // public static void main(String[] args) {
    //     Login l = new Login("122____@", "123");
    //     System.out.println(l);
    // }

}
