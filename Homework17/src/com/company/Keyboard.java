package com.company;

public class Keyboard {
    private char simvols;
    private String backlightPresence;
    private String additionalNumbersOnTheRight;

    public Keyboard() {
    }

    public Keyboard(char simvols, String backlightPresence, String additionalNumbersOnTheRight) {
        this.simvols = simvols;
        this.backlightPresence = backlightPresence;
        this.additionalNumbersOnTheRight = additionalNumbersOnTheRight;
    }

    public char getSimvols() {
        return simvols;
    }

    public void setSimvols(char simvols) {
        this.simvols = simvols;
    }

    public String getBacklightPresence() {
        return backlightPresence;
    }

    public void setBacklightPresence(String backlightPresence) {
        this.backlightPresence = backlightPresence;
    }

    public String getAdditionalNumbersOnTheRight() {
        return additionalNumbersOnTheRight;
    }

    public void setAdditionalNumbersOnTheRight(String additionalNumbersOnTheRight) {
        this.additionalNumbersOnTheRight = additionalNumbersOnTheRight;
    }
}
