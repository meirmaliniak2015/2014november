package com.company;

/**
 * Created by eladlavi on 1/25/15.
 */
public class TestNumber {


    public static double sum(Number[] nums){
        double sum = 0.0;
        for(Number num : nums)
            sum += num.doubleValue();
        return sum;
    }
}
