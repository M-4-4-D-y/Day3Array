package com.bridgelabz.array;

public class LargestElementInArray {
    public static void main(String[] args) {
        int [] arr = new int [] {1,5,0,7,9};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element present in given array: " + max);
    }
}
