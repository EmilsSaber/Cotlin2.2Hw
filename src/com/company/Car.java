package com.company;

public class Car implements Printable{
    private int year;
    private String korobka;

    @Override
    public void print() {

    }

    public Car(int year, String korobka) {
        this.year = year;
        this.korobka = korobka;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getKorobka() {

        return korobka;
    }

    public void setKorobka(String korobka) {
        this.korobka = korobka;
    }
}
