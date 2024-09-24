package com.example.oopproj;

public abstract class Vocabulary {
    // English.
    protected String wordTarget;
    // Vietnamese.
    protected String wordExplain;
    // phonetics
    protected String phonetic;

    // constructor.
    public Vocabulary(String wordTarget, String wordExplain, String phonetic) {
        this.wordTarget = wordTarget;
        this.wordExplain = wordExplain;
    }

    // getter.
    public String getWordTarget() {
        return this.wordTarget;
    }

    public String getWordExplain() {
        return this.wordExplain;
    }

    // setter.
    public void setWordTarget(String wordTarget) {
        this.wordTarget = wordTarget;
    }

    public void setWordExplain(String wordExplain) {
        this.wordExplain = wordExplain;
    }


    // print stuffs.
    public abstract void showEntry();
}

