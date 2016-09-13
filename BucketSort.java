package com.gokri;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int[] array = {-5,3,67,134,88,453543,99,32,23,5};
        //int[] array = {11, 21, 3, 5, 6, 7, 8, 99, 1};
        //int[] array = {4,8,6,9,33,23,90,5,1};
        //int[] array = {24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12};
        //int[] array = {10, 2, 45, 56, 98};

        int[] output = sort(array, 10);
        for (int i : output) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public static int[] sort(int[] array, int bucketCount) {
        // Smallest and Largest array value
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];
        }

        double interval = ((double)(max - min + 1))/bucketCount;
        ArrayList<Integer> buckets[] = new ArrayList[bucketCount];
        for (int i = 0; i < bucketCount; i++) {
            buckets[i] = new ArrayList();
        }

        for (int i = 0; i < array.length; i++) {
            buckets[(int)((array[i] - min)/interval)].add(array[i]);
        }

        int pointer = 0;
        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
            for (int j = 0; j < buckets[i].size(); j++) {
                array[pointer] = buckets[i].get(j);
                pointer++;
            }
        }
        
        return array;
    }
}
