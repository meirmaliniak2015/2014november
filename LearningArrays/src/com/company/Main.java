package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        //int num = 8;
        MyInt myInt = new MyInt();
        myInt.num = 8;
        stam(myInt);
        System.out.println(myInt.num);
        */
        printArray(stam3());


    }


    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println("end");
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
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>lowerBound)
                counter++;
        }
        return counter;
    }

    public static int max(int[] numbers){
        if(numbers!=null && numbers.length>0) {
            int max = numbers[0];
            for (int i = 1; i < numbers.length; i++)
                if (numbers[i] > max)
                    max = numbers[i];
            return max;
        }else{
            return Integer.MIN_VALUE;
        }
    }

    public static int[] flipArray(int[] numbers){
        if(numbers==null || numbers.length==0)
            return null;
        int[] flipped = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            flipped[i] = numbers[numbers.length - i - 1];
        }
        return flipped;
    }


    public static void flipTheArray(int[] numbers){
        int temp;
        for (int i = 0; i < numbers.length / 2; i++) {
            temp = numbers[i];
            numbers[i] = numbers[numbers.length-i-1];
            numbers[numbers.length-i-1] = temp;
        }
    }

    public static void stam(int x){
        x++;
        System.out.println("in stam " + x);

    }

    public static void stam(MyInt myInt){
        myInt.num++;
        System.out.println("in stam2 " + myInt.num);
    }


    public static int[] stam3(){
        int[] arr = new int[3];
        arr[0] = 13;
        arr[1] = 15;
        arr[2] = 20;
        return  arr;
    }

    public static int[] filterArray(int[] numbers, int lowerBound, int upperBound){

    }

}
