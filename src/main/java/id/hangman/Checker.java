package id.hangman;

public class Checker {
    public String check(String usersLetter, String word, String wordsState){
        if(word.contains(usersLetter)) {
            for(int i=0; i<word.length(); i++){
                if(word.charAt(i)==(usersLetter.charAt(0))){
                    wordsState = wordsState.substring(0, i) + usersLetter + wordsState.substring(i + 1);
                }
            }
            return wordsState;
        }else {
            return null;
        }
    }
}
