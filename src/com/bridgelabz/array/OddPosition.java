package com.bridgelabz.array;

public class OddPosition {
    public static void main(String[] args) {

        int [] numbers = new int [] {1,2,3,4,5,6,7,8,9};
        System.out.println("Array Elements on even Positions: ");
        for (int i = 0; i < numbers.length; i = i+2) {
            System.out.println(numbers[i]);
        }
    }
}
