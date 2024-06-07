package com.example.calculus_ratiotinator.conjonction;
import com.example.calculus_ratiotinator.InterfaceAffirmation;

public class ConjonctionDonc extends Conjonction{
    public ConjonctionDonc(InterfaceAffirmation affirmation1,InterfaceAffirmation affirmation2) {
        super(affirmation1, affirmation2);
    }
    public boolean evaluer() {
        boolean valeurAffirmation1 = affirmation1.evaluer();
        boolean valeurAffirmation2 = affirmation2.evaluer();
        if (valeurAffirmation1 && !valeurAffirmation2) {
            return false;
        } else {
            return true;
        }
    }
}
