package com.company;

public class Mercedes extends Car{
    private String color;
    public Mercedes(int year, String korobka, String color) {
        super(year, korobka);
        this.color = color;
    }

    public void print()
    {
        System.out.println(getYear()+ "  " + getKorobka() + "  " + color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
