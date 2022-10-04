package com.bridgelabz.array;

public class FrequencyArray {
    public static void main (String[] args) {
        int[] arr = {1,2,3,4,4,2,5,6,9,2};
        int size = arr.length;
        countFrequency(arr, size);
    }

    static void countFrequency(int[] array, int size)
    {

        for (int i = 0; i < size; i++){
            int flag = 0;
            int count = 0;

            for (int j = i+1; j < size; j++){
                if (array[i] == array[j]){
                    flag = 1;
                    break;
                }
            }


            if (flag == 1)
                continue;

            for (int j = 0;j<=i;j++){
                if (array[i] == array[j])
                    count++;
            }
            System.out.println(array[i]+": "+count);
        }
    }
}

