package com.example.oopproj;

public abstract class DictionaryManagement {

    protected Dictionary dictionary;

    public DictionaryManagement(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public abstract void insertFromCmdLine();
    public abstract void showAllWords();
}
