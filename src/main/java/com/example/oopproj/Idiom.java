package com.example.oopproj;

public class Idiom extends Vocabulary{

    // constructor.
    public Idiom(String wordTarget, String wordExplain) {
        super(wordTarget, wordExplain, "Idiom");
    }

    // show an idiom.
    @Override
    public void showEntry() {
        System.out.println(this.wordType + " " + this.wordTarget + " - " + this.wordExplain);
    }
}
