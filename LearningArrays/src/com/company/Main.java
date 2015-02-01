package com.company;

public class Main {
    static int counter = 0;
    public static void main(String[] args) {

        /*
        //int num = 8;
        MyInt myInt = new MyInt();
        myInt.num = 8;
        stam(myInt);
        System.out.println(myInt.num);
        */

        int[] myArray = new int[20000];
        int from = -100;
        int to = 100;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int)(Math.random()*(to - from))+from;
        }

        counter = 0;
        //System.currentTimeMillis();
        long start = System.nanoTime();
        sort(myArray);
        long end = System.nanoTime();
        //printArray(myArray);

        System.out.println("counter: " + counter);
        long timeElapsed = (end - start)/1000000;
        System.out.println("time elapsed: " + timeElapsed);
        /*

        bubbleDance(myArray);
        printArray(myArray);
        */
        /*
        for (int i = 0; i < myArray.length; i++) {
            int x = myArray[i];
            System.out.println(x);
        }
        //foreach

        for(int x : myArray){
            System.out.println(x);
        }
        */



    }


    public static void printArray(int[] arr){
        if(arr==null || arr.length==0)
            System.out.println("empty array");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println(arr[arr.length-1]);

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
        if(numbers==null || lowerBound>upperBound)
            return null;
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>=lowerBound && numbers[i]<upperBound)
                counter++;
        }
        int[] result = new int[counter];
        int pos = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>=lowerBound && numbers[i]<upperBound)
                result[pos++] = numbers[i];
        }
        return result;
    }

    public static int search(int[] numbers, int num){
        //return the first position/index of num within numbers.
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==num)
                return i;
        }
        return -1;
    }

    public static void bubbleDance(int[] numbers){
        for (int i = 0; i < numbers.length - 1; i+=2) {
            int temp = numbers[i];
            numbers[i] = numbers[i+1];
            numbers[i+1] = temp;
        }
    }

    public static void sort(int[] numbers){
        int j = numbers.length;
        boolean isSorted = false;
        while(!isSorted && j>0) {
            j--;
            isSorted = true;
            for (int i = 0; i < j; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    isSorted = false;
                }
                int x=8;
                counter++;
            }
        }

    }





}
