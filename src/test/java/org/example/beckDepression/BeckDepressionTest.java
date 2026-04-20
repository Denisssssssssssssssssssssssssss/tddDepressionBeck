package org.example.beckDepression;

import org.junit.jupiter.api.Test;

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
}
