package com.company;

/**
 * Created by eladlavi on 1/28/15.
 */
public class Complex extends Number {

    private double real;
    private double imaginary;

    public Complex(double r, double i){
        real = r;
        imaginary = i;
    }

    public double distance(){
        return Math.sqrt(real*real+imaginary*imaginary);
    }


    @Override
    public int intValue() {
        return (int)distance();
    }

    @Override
    public long longValue() {
        return (long)distance();
    }

    @Override
    public float floatValue() {
        return (float)distance();
    }

    @Override
    public double doubleValue() {
        return distance();
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
}
