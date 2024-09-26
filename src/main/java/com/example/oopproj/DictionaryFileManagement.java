package com.example.oopproj;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class DictionaryFileManagement extends DictionaryManagement{

    // constructor.
    public DictionaryFileManagement(Dictionary dictionary) {
        super(dictionary);
    }

    // get Dictionary.
    public Dictionary getDictionary() {
        return this.dictionary;
    }

    // take words from file.
    public void importFromFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            String wordTarget = null;
            String phonetic = null;
            StringBuilder wordExplain = new StringBuilder();
            System.out.println("Loading data...");
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) {
                    if (wordTarget != null && phonetic != null && wordExplain.length() > 0) {
                        this.dictionary.addVocabulary(new Word(wordTarget, wordExplain.toString(), phonetic));
                    }
                    wordTarget = null;
                    phonetic = null;
                    wordExplain.setLength(0);
                } else if (line.startsWith("@")) {
                    int phoneticsStartIndex = line.indexOf('/');
                    if (phoneticsStartIndex != -1) {
                        wordTarget = line.substring(1, phoneticsStartIndex).trim();
                        phonetic = line.substring(phoneticsStartIndex, line.lastIndexOf('/')+1).trim();
                    }
                } else {
                    if (wordExplain.length() > 0) {
                        wordExplain.append("\n");
                    }
                    String formattedDef = definitionFormatter(line);
                    wordExplain.append(formattedDef);
                }
            }
            if (wordTarget != null && phonetic != null && wordExplain.length() > 0) {
                this.dictionary.addVocabulary(new Word(wordTarget, wordExplain.toString(), phonetic));
            }
            //System.out.println(cnt);
            System.out.println("Data loaded successfully!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException("cannot load data file!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String definitionFormatter(String line) {
        String res = line.replace("+", ":");
        res = res.replace("=", "    Ex: ");
        res = res.replace("_", " ");
        res = res.replace("!", "-> Collocation: ");
        return res;
    }

    // not gonna use.
    @Override
    public void insertFromCmdLine() {
        return;
    }

    // show all words.
    @Override
    public void showAllWords() {
        this.dictionary.showAll();
    }

    // test drive.
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        DictionaryFileManagement dictionaryFileManagement = new DictionaryFileManagement(dictionary);
        String absolutePath = Paths.get("src/main/resources/data/english-vietnamese.txt").toAbsolutePath().toString();
        System.out.println(absolutePath);
        dictionaryFileManagement.importFromFile(absolutePath);
        System.out.println(dictionaryFileManagement.getDictionary().size());
        dictionaryFileManagement.getDictionary().getVocabulary("effect").showEntry();
    }
}
