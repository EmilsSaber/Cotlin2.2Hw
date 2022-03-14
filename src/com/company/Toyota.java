package com.company;

public class Toyota extends Car{
    private int vOlume;

    public Toyota(int year, String korobka, int vOlume) {
        super(year, korobka);
        this.vOlume = vOlume;
    }

    public void print() {
        System.out.println(getYear()+ "  " + getKorobka() + "  " + getvOlume());
    }

    public int getvOlume() {
        return vOlume;
    }

    public void setvOlume(int vOlume) {
        this.vOlume = vOlume;
    }
}
