package org.example.beckDepression;

public class BeckDepression {

    private int score;

    public int getScore() {
        return this.score;
    }

    public void answer(Question question, String answer) {
        this.score += question.getScoreForAnswer(answer);
    }
}
