package org.example.beckDepression;

import java.util.LinkedHashMap;
import java.util.Map;

public class Question {

    private final Map<String, Integer> answersAndScore;

    public Question(Map<String, Integer> answersAndScore) {
        this.answersAndScore = new LinkedHashMap<>(answersAndScore);
    }

    public int getScoreForAnswer(String answer) {
        return answersAndScore.get(answer);
    }
}
