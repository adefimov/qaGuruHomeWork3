package ru.aefimov;

public class Bike {

    String color;
    boolean isUsed;
    String category = "folded";
    int speedSet;

    public Bike() {
    }

    public Bike(String color, String category, int speedSet) {
        this.color = color;
        this.category = category;
        this.speedSet = speedSet;
    }

    String getColor(){
        return color;
    }

    void setSpeedSet(int speedSet){
        this.speedSet = speedSet;

    }


}
