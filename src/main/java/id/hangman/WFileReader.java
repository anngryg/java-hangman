package id.hangman;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class WFileReader {

    public ArrayList<String> readFile() throws IOException {
        ArrayList<String> words = new ArrayList<>();
        File file = new File("src/main/resources/words.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st = null;
        while ((st = br.readLine()) != null){
            words.add(st);
        }

        return words;
    }
}

