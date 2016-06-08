package com.gokri;

public class Main {

    public static void main(String[] args) {
        int[] arrayToBeSorted = {5, 1, 2, 4, 8, 3, 7};
        bubbleSort(arrayToBeSorted);
    }

    public static void bubbleSort(int[] sortedArray) {
        boolean loop = true;
        int temp;

        while (loop) {
            loop = false;
            for (int i=1; i < sortedArray.length; i++) {
                if (sortedArray[i] < sortedArray[i-1]) {
                    loop = true;
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i-1];
                    sortedArray[i-1] = temp;
                }
            }
        }
        printBubbleSort(sortedArray);
    }

    public static void printBubbleSort(int[] sortedArray) {
        for (int i=0; i<sortedArray.length; i++) {
            System.out.println("Array elements " + sortedArray[i]);
        }
    }
}
