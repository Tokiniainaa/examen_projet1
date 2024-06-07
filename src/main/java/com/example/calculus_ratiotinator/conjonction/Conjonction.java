package com.example.calculus_ratiotinator.conjonction;

import com.example.calculus_ratiotinator.Affirmation;
import com.example.calculus_ratiotinator.InterfaceAffirmation;

public abstract class Conjonction implements InterfaceAffirmation {
    protected InterfaceAffirmation affirmation1;
    protected InterfaceAffirmation affirmation2;

    public Conjonction(InterfaceAffirmation affirmation1, InterfaceAffirmation affirmation2) {
        this.affirmation1 = affirmation1;
        this.affirmation2 = affirmation2;
    }
}
