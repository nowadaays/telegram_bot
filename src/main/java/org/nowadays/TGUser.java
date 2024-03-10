package org.nowadays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TGUser {
    private Long userId;
    private List<Question> questions = new ArrayList<>();
    private Integer backendPoint = 0;
    private Integer frontendPoint = 0;
    private Integer qaPoint = 0;

    public TGUser(Long userId) {
        this.userId = userId;
        fillQuestion();
    }

    private void fillQuestion(){
        questions.add(new Question(Texts.Q1 , Arrays.asList(
                new Answer(LanguageType.FRONTEND , Texts.Q1_A1),
                new Answer(LanguageType.FRONTEND , Texts.Q1_A2),
                new Answer(LanguageType.BACKEND , Texts.Q1_A3),
                new Answer(LanguageType.QA , Texts.Q1_A4)
        )));

        questions.add(new Question(Texts.Q2 , Arrays.asList(
                new Answer(LanguageType.FRONTEND , Texts.Q2_A1),
                new Answer(LanguageType.BACKEND , Texts.Q2_A2),
                new Answer(LanguageType.QA , Texts.Q2_A3),
                new Answer(LanguageType.FRONTEND , Texts.Q2_A4)
        )));
        questions.add(new Question(Texts.Q3 , Arrays.asList(
                new Answer(LanguageType.QA , Texts.Q3_A1),
                new Answer(LanguageType.FRONTEND , Texts.Q3_A2),
                new Answer(LanguageType.FRONTEND , Texts.Q3_A3),
                new Answer(LanguageType.BACKEND , Texts.Q3_A4)
        )));
        questions.add(new Question(Texts.Q4 , Arrays.asList(
                new Answer(LanguageType.FRONTEND , Texts.Q4_A1),
                new Answer(LanguageType.FRONTEND , Texts.Q4_A2),
                new Answer(LanguageType.QA , Texts.Q4_A3),
                new Answer(LanguageType.BACKEND , Texts.Q4_A4)
        )));
        questions.add(new Question(Texts.Q5 , Arrays.asList(
                new Answer(LanguageType.FRONTEND , Texts.Q5_A1),
                new Answer(LanguageType.QA , Texts.Q5_A2),
                new Answer(LanguageType.FRONTEND , Texts.Q5_A3),
                new Answer(LanguageType.QA , Texts.Q5_A4)
        )));
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public Integer getBackendPoint() {
        return backendPoint;
    }

    public void setBackendPoint(Integer backendPoint) {
        this.backendPoint = backendPoint;
    }

    public Integer getFrontendPoint() {
        return frontendPoint;
    }

    public void setFrontendPoint(Integer frontendPoint) {
        this.frontendPoint = frontendPoint;
    }

    public Integer getQaPoint() {
        return qaPoint;
    }

    public void setQaPoint(Integer qaPoint) {
        this.qaPoint = qaPoint;
    }
}
