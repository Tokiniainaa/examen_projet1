package com.example.calculus_ratiotinator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculusRatiotinatorApplicationTests {

    @Test
    public void testVerite() {
        InterfaceAffirmation affirmation = new Verite();
        assertTrue(affirmation.evaluer());
    }
    @Test
    public void testMensonge() {
        InterfaceAffirmation affirmation = new Mensonge();
        assertFalse(affirmation.evaluer());
    }
    @Test
    public void testAffirmation() {
        InterfaceAffirmation affirmation = new Affirmation(true);
        assertTrue(affirmation.evaluer());
    }

}
