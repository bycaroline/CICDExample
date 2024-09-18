package org.carolineeklund;

public class Car {

    private int velocity;
    private String color;

    public Car(int velocity, String color){
        this.velocity = velocity;
        this.color = color;
    }

    public String accelerate(int velocity){
        this.velocity+= velocity;
        return "The car is now going " + this.velocity + " km/h";
    }

    public int getVelocity() {
        return velocity;
    }

    public String getColor() {
        return color;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
