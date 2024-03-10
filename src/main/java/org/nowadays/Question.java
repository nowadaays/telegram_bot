package org.nowadays;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private String text;
    private Boolean hasAnswer = false;
    private Boolean sendQuestionToUser = false;

    private List<Answer> answers = new ArrayList<>();

    public Question(String text, List<Answer> answers) {
        this.text = text;
        this.answers = answers;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getHasAnswer() {
        return hasAnswer;
    }

    public void setHasAnswer(Boolean hasAnswer) {
        this.hasAnswer = hasAnswer;
    }

    public Boolean getSendQuestionToUser() {
        return sendQuestionToUser;
    }

    public void setSendQuestionToUser(Boolean sendQuestionToUser) {
        this.sendQuestionToUser = sendQuestionToUser;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
