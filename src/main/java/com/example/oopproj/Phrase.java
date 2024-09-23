package com.example.oopproj;

public class Phrase extends Vocabulary{

    // constructor.
    public Phrase(String wordTarget, String wordExplain) {
        super(wordTarget, wordExplain, "Phrase");
    }

    // show a phrase.
    @Override
    public void showEntry() {
        System.out.println(this.wordType + " " + this.wordTarget + " - " + this.wordExplain);
    }
}
