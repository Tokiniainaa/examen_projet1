package com.example.calculus_ratiotinator;

import lombok.Setter;

@Setter
public class Affirmation implements InterfaceAffirmation {
    private final boolean condition;
    public Affirmation(boolean condition) {
        this.condition = condition;
    }
    @Override
    public boolean evaluer() {
        return condition;
    }
}
