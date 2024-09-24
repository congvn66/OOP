package com.example.oopproj;

public abstract class Vocabulary {
    // English.
    protected String wordTarget;
    // Vietnamese.
    protected String wordExplain;
    // type of Vocabulary.
    protected String wordType;

    // constructor.
    public Vocabulary(String wordTarget, String wordExplain, String wordType) {
        this.wordTarget = wordTarget;
        this.wordExplain = wordExplain;
        this.wordType = wordType;
    }

    // getter.
    public String getWordTarget() {
        return this.wordTarget;
    }

    public String getWordExplain() {
        return this.wordExplain;
    }

    public String getWordType() {
        return this.wordType;
    }

    // setter.
    public void setWordTarget(String wordTarget) {
        this.wordTarget = wordTarget;
    }

    public void setWordExplain(String wordExplain) {
        this.wordExplain = wordExplain;
    }

    public void setWordType(String wordType) {
        this.wordType = wordType;
    }

    // print stuffs.
    public abstract void showEntry();
}

