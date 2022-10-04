package com.bridgelabz.array;

public class SecondLargestArray {

    static int secondLargest(int[] arr){
        int firstNumber =0;
        int secondNumber =0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]>firstNumber){
                secondNumber = firstNumber;
                firstNumber = arr[i];
            }
            else if (arr[i]>secondNumber && arr[i] !=firstNumber) {
                secondNumber = arr[i];

            }
        }
        return secondNumber;
    }
    public static void main(String[] args) {
        int a[] = { 12, 35, 1, 10, 34, 1 };
        int n = a.length;
        int answer = secondLargest(a);
        System.out.println("The second largest element in the array is: " + answer);
    }
    }

