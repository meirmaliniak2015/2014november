package com.company;

public class Main {

    public static void main(String[] args) {
        //int num = 8;
        MyInt myInt = new MyInt();
        myInt.num = 8;
        stam(myInt);
        System.out.println(myInt.num);
    }

    public static double average(int[] numbers){
        int sum = 0;
        for(int i=0;i<numbers.length;i++)
            sum += numbers[i];
        double count = numbers.length;
        return sum/count;
    }
    //write a function that takes as parameters an int array,
    // and an int, and will return how many numbers in the array,
    //are greater than the given number
    public static int howManyAbove(int[] numbers, int lowerBound){
        return 0;
    }

    public static int max(int[] numbers){
        return 0;
    }

    public static int[] flipArray(int[] numbers){
        return null;
    }

    public static void flipTheArray(int[] numbers){

    }

    public static void stam(int x){
        x++;
        System.out.println("in stam " + x);

    }

    public static void stam(MyInt myInt){
        myInt.num++;
        System.out.println("in stam2 " + myInt.num);
    }



}
