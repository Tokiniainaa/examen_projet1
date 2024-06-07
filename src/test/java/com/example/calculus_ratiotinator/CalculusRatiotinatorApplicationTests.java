package com.example.calculus_ratiotinator;

import com.example.calculus_ratiotinator.conjonction.ConjonctionDonc;
import com.example.calculus_ratiotinator.conjonction.ConjonctionEt;
import com.example.calculus_ratiotinator.conjonction.ConjonctionOu;
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
    @Test
    public void testEt() {
        InterfaceAffirmation affirmation1 = new Verite();
        InterfaceAffirmation affirmation2 = new Mensonge();
        InterfaceAffirmation conjonctionEt = new ConjonctionEt(affirmation1, affirmation2);
        assertFalse(conjonctionEt.evaluer());
    }
    @Test
    public void testOu() {
        InterfaceAffirmation affirmation1 = new Verite();
        InterfaceAffirmation affirmation2 = new Mensonge();
        InterfaceAffirmation conjonctionOu = new ConjonctionOu(affirmation1, affirmation2);
        assertTrue(conjonctionOu.evaluer());
    }
    @Test
    public void testDonc() {
        InterfaceAffirmation affirmation1 = new Verite();
        InterfaceAffirmation affirmation2 = new Mensonge();
        InterfaceAffirmation conjonctionDonc = new ConjonctionDonc(affirmation1, affirmation2);
        assertFalse(conjonctionDonc.evaluer());
    }

}
