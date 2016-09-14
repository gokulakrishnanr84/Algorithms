package com.gokri;

public class Main {

    public static void main(String[] args) {
        int[] array = {-5,3,67,134,88,453543,99,32,23,5};
        //int[] array = {4,8,6,9,33,23,90,5,1};
        //int[] array = {24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12};
        //int[] array = {10, 2, 45, 56, 98};

        sort(array);
        for (int i : array) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public static void sort(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }

        int[] counts = new int[max - min + 1];
        for (int i = 0;  i < array.length; i++) {
            counts[array[i] - min]++;
        }

        int index = 0;
        int range = max - min + 1;
        for(int j = 0; j < range; j++)
        {
            while(counts[j]-->0) {
                array[index++] = j + min;
            }
        }
    }
}
