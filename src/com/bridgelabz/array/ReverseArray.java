package com.bridgelabz.array;

public class ReverseArray {
    public static void main(String[] args) {
        int Array[] = {10,20,30,40,50,60,70,80,90};
        System.out.println("Original Array:");
        for(int i=0;i<Array.length;i++)
            System.out.print(Array[i] + "  ");
        System.out.println();
        System.out.println("Original Array printed in reverse order:");
        for(int i=Array.length-1;i>=0;i--)
            System.out.print(Array[i] + "  ");
    }
}
