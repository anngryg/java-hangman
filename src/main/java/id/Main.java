package id;

import id.hangman.*;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        String word = new RandomWordPicker().randomWord();
        String wordsState = new String(new char[word.length()]).replace('\0', '_');;
        String[] hangmanState = Hangman.HANGMANPICS;
        int failsCounter = 0;
        Checker checker = new Checker();
        System.out.println("Welcome");

        while(true){
            if(!wordsState.equals(word) && failsCounter < hangmanState.length-1){
                System.out.println(hangmanState[failsCounter]);
                System.out.println(wordsState);
                System.out.println(word);

                InputHandler inputHandler = new InputHandler();
                String letter = inputHandler.getUsersLetter();
                String checkedWord = checker.check(letter,word,wordsState);
                if(!(checkedWord == null)){
                    wordsState = checkedWord;
                }else{
                    failsCounter++;
                }
            }else{
                if(failsCounter == hangmanState.length-1){
                    System.out.println(hangmanState[failsCounter]);
                    System.out.println("¯\\_(ツ)_/¯");
                    System.out.println("Not this time");
                }else{
                    System.out.println(word);
                    System.out.println("◝(ᵔᵕᵔ)◜");
                    System.out.println("Congratulations!");
                }
                break;
            }

        }
    }
}