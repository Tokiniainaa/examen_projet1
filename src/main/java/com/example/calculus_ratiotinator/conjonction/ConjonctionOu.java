package com.example.calculus_ratiotinator.conjonction;

import com.example.calculus_ratiotinator.Affirmation;
import com.example.calculus_ratiotinator.InterfaceAffirmation;

public class ConjonctionOu extends Conjonction  {
    public ConjonctionOu(InterfaceAffirmation affirmation1, InterfaceAffirmation affirmation2) {
        super(affirmation1, affirmation2);
    }
    @Override
    public boolean evaluer() {
        return affirmation1.evaluer() || affirmation2.evaluer();
    }
}
