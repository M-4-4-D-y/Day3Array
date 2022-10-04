package com.bridgelabz.array;

public class EvenPosition {
    public static void main(String[] args) {

        int [] numbers = new int [] {1,2,3,4,5,6,7,8,9};
        System.out.println("Array Elements on even Positions: ");
        for (int i = 1; i < numbers.length; i+=2) {

            System.out.println(numbers[i]);
        }
    }
}
