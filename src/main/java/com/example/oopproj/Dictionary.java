package com.example.oopproj;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    // container.
    private Map<String, Vocabulary> vocabularies;

    // constructor.
    public Dictionary() {
        vocabularies = new HashMap<>();
    }

    // method to add Vocabulary.
    public void addVocabulary(Vocabulary vocabulary) {
        vocabularies.put(vocabulary.getWordTarget().toLowerCase(), vocabulary);
    }

    // get vocabulary from dictionary.
    public Vocabulary getVocabulary(String wordTarget) {
        return vocabularies.get(wordTarget.toLowerCase());
    }

    // remove a vocab from dictionary.
    public void removeVocabulary(String wordTarget) {
        vocabularies.remove(wordTarget.toLowerCase());
    }

    // show all vocab.
    public void showAll() {
        for (Vocabulary vocabulary : vocabularies.values()) {
            vocabulary.showEntry();
        }
    }
}
