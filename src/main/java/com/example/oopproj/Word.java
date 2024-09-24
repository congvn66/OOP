package com.example.oopproj;

public class Word extends Vocabulary {

    // constructor.
    public Word(String wordTarget, String wordExplain) {
        super(wordTarget, wordExplain, "Word");
    }

    // show a word.
    @Override
    public void showEntry() {
        System.out.println(this.wordType + " " + this.wordTarget + " - " + this.wordExplain);
    }
}
