package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

            Printable[] print = {createObject("oBj"),
                    createObject("oBj2"), createObject("oBj3")};

            for (Printable printable : print) {
                printable.print();

            }
        }

   public static Printable createObject(String className){
        switch (className){

            case "oBj":
                Audi audi = new Audi(2001,"robot",1500);
                return audi;
            case "oBj2":
                Mercedes mercedes = new Mercedes(2005,"mehanika","red");
                return mercedes;
            case "oBj3":
                Toyota toyota = new Toyota(2009,"auto",3);
                return toyota;

        }

      return null;
   }
}
