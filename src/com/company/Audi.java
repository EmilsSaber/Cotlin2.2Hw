package com.company;

public class Audi extends Car{
    private int ves;

    public Audi(int year, String korobka, int ves) {
        super(year, korobka);
        this.ves = ves;
    }

    public void print() {
        System.out.println(getYear()+ "  " + getKorobka() + "  " + ves);
    }


    public int getVes() {
        return ves;
    }

    public void setVes(int ves) {
        this.ves = ves;
    }
}
