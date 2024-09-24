package com.example.oopproj;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DictionaryFileManagement extends DictionaryManagement{

    // constructor.
    public DictionaryFileManagement(Dictionary dictionary) {
        super(dictionary);
    }

    // take words from file.
    public void importFromFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;
    }

    @Override
    public void insertFromCmdLine() {
        return;
    }

    @Override
    public void showAllWords() {

    }
}
