package com.company;

/**
 * Created by eladlavi on 1/21/15.
 */
public class Car {
    private int model;
    private String make;
    private boolean manualGear;

    public Car(int model, String make, boolean manualGear){
        setModel(model);
        setMake(make);
        setManualGear(manualGear);
    }

    public Car(int model, String make){
        this(model, make, true);
    }

    public Car(String make){
        this(2014, make);
    }

    public Car(){
        this("Toyota");
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public boolean isManualGear() {
        return manualGear;
    }

    public void setManualGear(boolean manualGear) {
        this.manualGear = manualGear;
    }

    @Override
    public String toString() {
        return "car: model:" + getModel() + " make: " + getMake() + " gear: "
                + (isManualGear() ? "manual" : "automatic");
    }
}








