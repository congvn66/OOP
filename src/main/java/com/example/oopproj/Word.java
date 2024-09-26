package com.example.oopproj;

public class Word extends Vocabulary {

    // constructor.
    public Word(String wordTarget, String wordExplain, String phonetic) {
        super(wordTarget, wordExplain, phonetic);
    }

    // show a word.
    @Override
    public void showEntry() {
        System.out.println(this.wordTarget + "\n" + this.phonetic + "\n" + this.wordExplain);
    }
}
