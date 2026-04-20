package org.example.beckDepression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class BeckDepressionTest {

    @Test
    void shouldCreateBeckDepressionObject() {
        BeckDepression beck = new BeckDepression();
        assertNotNull(beck);
    }

}
