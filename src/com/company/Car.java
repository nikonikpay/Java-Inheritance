package com.company;

public class Car extends Vehicle{
    private int wheel;
    private int doors;
    private int gears;
    private int currentGear;
    private boolean isManual;

    public Car(String name, String size, int wheel, int doors, int gears,boolean isManual) {
        super(name, size);
        this.wheel = wheel;
        this.doors = doors;
        this.gears = gears;
        this.currentGear = 1;
        this.isManual = isManual;
    }

    public void changeGear(int newGear){
       this.currentGear = newGear;
        System.out.println("Car.setCurrentGear()  changed to : " + this.currentGear + "gear");
    }
    public void changeVelocity(int speed,int direction){
        move(speed,direction);
        System.out.println("Car.changeVelocity()   Velocity " + speed +" direction " + direction);

    }

}
