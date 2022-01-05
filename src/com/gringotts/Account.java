package com.gringotts;

public class Account {

    private int pnr, number;

    public Account(int pnr, int number) {
        this.pnr = pnr;
        this.number = number;
    }

    public int getPnr() {
        return pnr;
    }

    public void setPnr(int pnr) {
        this.pnr = pnr;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "account{" +
                "pnr=" + pnr +
                ", number=" + number +
                '}';
    }
}
