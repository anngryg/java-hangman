package id.hangman;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class RandomWordPicker {
    public String randomWord() throws IOException {
        WFileReader reader = new WFileReader();
        ArrayList<String> words = reader.readFile();

        Random r = new Random();

        int randomitem = r.nextInt(words.size());
        String randomElement = words.get(randomitem);
        return randomElement.toLowerCase();
    }
}
