package com.example.calculus_ratiotinator.conjonction;

import com.example.calculus_ratiotinator.Affirmation;
import com.example.calculus_ratiotinator.InterfaceAffirmation;
import lombok.ToString;

@ToString
public class ConjonctionEt extends Conjonction{
    public ConjonctionEt(InterfaceAffirmation affirmation1, InterfaceAffirmation affirmation2) {
        super(affirmation1, affirmation2);
    }

    public boolean evaluer() {
        return affirmation1.evaluer() && affirmation2.evaluer();
    }
}
