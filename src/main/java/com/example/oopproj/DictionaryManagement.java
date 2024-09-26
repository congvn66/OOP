package com.example.oopproj;

public abstract class DictionaryManagement {

    protected Dictionary dictionary;

    // constructor.
    public DictionaryManagement(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    // abstract methods.
    public abstract void insertFromCmdLine();
    public abstract void showAllWords();
}
