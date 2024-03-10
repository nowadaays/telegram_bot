package org.nowadays;

public class Answer {
    private String text;
    private LanguageType languageType;

    public Answer(LanguageType languageType , String text) {
        this.text = text;
        this.languageType = languageType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LanguageType getLanguageType() {
        return languageType;
    }

    public void setLanguageType(LanguageType languageType) {
        this.languageType = languageType;
    }
}
