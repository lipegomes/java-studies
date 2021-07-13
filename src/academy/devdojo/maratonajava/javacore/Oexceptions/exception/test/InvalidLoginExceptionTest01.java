package academy.devdojo.maratonajava.javacore.Oexceptions.exception.test;

import academy.devdojo.maratonajava.javacore.Oexceptions.exception.domain.InvalidLoginException;

import java.util.Scanner;

public class InvalidLoginExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        }
    }

    public static void login() throws InvalidLoginException {
        Scanner keyboard = new Scanner(System.in);
        String userName = "Filipe";
        String password = "a@bc%De#$f01";
        System.out.println("User");
        String typedUserName = keyboard.nextLine();
        System.out.println("Password");
        String typedPassword = keyboard.nextLine();

        if(!userName.equals(typedUserName) || !password.equals(typedPassword)){
            throw new InvalidLoginException("Username or Password invalid");
        }

        System.out.println("User successfully logged in");
    }
}
