package ru.aefimov;

public class Main {
    public static void main(String[] args) {

        Bike scott = new Bike("white","turing",12);
        Bike bicycle = new Bike();
        bicycle.color = "Blue";
        bicycle.speedSet = 8;

        System.out.println(scott.color + " " + scott.speedSet);
        System.out.println(bicycle.color + " " + bicycle.category + " " + bicycle.isUsed);
    }
}
