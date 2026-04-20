package org.example.beckDepression;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class QuestionTest {

    @Test
    void shouldCreateQuestionObject() {
        Map<String, Integer> input = new LinkedHashMap<>();
        input.put("A", 0);
        input.put("B", 1);
        input.put("C", 2);
        input.put("D", 3);
        Question question = new Question(input);
        assertNotNull(question);
    }

    @Test
    void shouldReturnScoreForAnswer() {
        Map<String, Integer> input = new LinkedHashMap<>();
        input.put("A", 0);
        input.put("B", 1);
        input.put("C", 2);
        input.put("D", 3);
        Question question = new Question(input);
        String answer = "A";
        assertEquals(0, question.getScoreForAnswer(answer));
    }

    @Test
    void shouldReturnMinusOneForAnswer() {
        Map<String, Integer> input = new LinkedHashMap<>();
        input.put("A", 0);
        input.put("B", 1);
        input.put("C", 2);
        input.put("D", 3);
        Question question = new Question(input);
        String answer = "E";
        assertEquals(-1, question.getScoreForAnswer(answer));
    }

}
