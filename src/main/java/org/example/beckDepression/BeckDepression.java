package org.example.beckDepression;

public class BeckDepression {

    private int score;

    public int getScore() {
        return this.score;
    }

    public void answer(Question question, String answer) {
        this.score += question.getScoreForAnswer(answer);
    }
    public String getResult() {
        if (score <= 13) {
            return "депрессивные симптомы отсутствуют (вариация нормы)";
        } else if (score <= 19) {
            return "лёгкая депрессия";
        } else if (score <= 28) {
            return "умеренная депрессия";
        } else {
            return "выраженная (тяжёлая) депрессия";
        }
    }

}
