package id.hangman;

import java.util.Scanner;

public class InputHandler {
    private Scanner scanner = new Scanner(System.in);
    public String getUsersLetter (){
        String usersInput = scanner.nextLine();
        while (usersInput.length()>1){
            System.out.println("Wrong input, give a letter");
            usersInput = scanner.nextLine();
        }
        return usersInput.toLowerCase();
    }
}
