package org.example.beckDepression;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Question {

    private final Map<String, Integer> answersAndScore;

    public Question(Map<String, Integer> answersAndScore) {
        this.answersAndScore = new LinkedHashMap<>(answersAndScore);
    }

    public int getScoreForAnswer(String answer) {
        return answersAndScore.getOrDefault(answer, -1);
    }

    public List<String> getAnswersList() {
        return new ArrayList<>(answersAndScore.keySet());
    }
}
