package com.example.mydemo.demo;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4);
        nums.stream().filter(i -> i%2 == 0).forEach(i -> System.out.println("hi"));
    }
}
