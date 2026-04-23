package org.example.beckDepression;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class BeckDepressionTest {

    @Test
    void shouldCreateBeckDepressionObject() {
        BeckDepression beck = new BeckDepression();
        assertNotNull(beck);
    }

    @Test
    void fieldScoreShouldBeZero(){
        BeckDepression beck = new BeckDepression();
        int score = beck.getScore();
        assertEquals(0, score);
    }

    @Test
    void shouldIncreaseScoreAfterAnswer() {
        BeckDepression beck = new BeckDepression();
        Map<String, Integer> input = new LinkedHashMap<>();
        input.put("A", 0);
        input.put("B", 1);
        input.put("C", 2);
        input.put("D", 3);
        Question question = new Question(input);
        beck.answer(question, "C");
        assertEquals(2, beck.getScore());
    }
    @Test
    void shouldReturnNoDepression() {
        BeckDepression beck = new BeckDepression();

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("A", 10);

        Question q = new Question(map);

        beck.answer(q, "A");

        assertEquals(
                "депрессивные симптомы отсутствуют (вариация нормы)",
                beck.getResult()
        );
    }
}
