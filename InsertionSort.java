package com.gokri;

public class Main {

    public static void main(String[] args) {
        int[] arrayToBeSorted = {6, 5, 3, 1, 8, 7, 2, 4}; // {1, 2, 3, 4, 5, 6, 7, 8}
        masterIteration(arrayToBeSorted);
    }

    public static void masterIteration(int[] sortedArray) {
        for (int i = 1; i < sortedArray.length; i++) {
            subIteration(sortedArray, i);
        }
        printInsertionSort(sortedArray);
    }

    public static void subIteration(int[] sortedArray, int endElement) {
        int temp;
        for (int e = endElement; e > 0; e--) {
            if (sortedArray[e] < sortedArray[e-1]) {
                temp = sortedArray[e];
                sortedArray[e] = sortedArray[e-1];
                sortedArray[e-1] = temp;
            }
            else {
                break;
            }
        }
    }

    public static void printInsertionSort(int[] sortedArray) {
        for (int i=0; i<sortedArray.length; i++) {
            System.out.println("Array elements " + sortedArray[i]);
        }
    }
}
