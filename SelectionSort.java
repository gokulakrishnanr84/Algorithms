package com.gokri;

public class Main {

    public static void main(String[] args) {
        int[] arrayToBeSorted = {5, 1, 2, 4, 8, 3, 7}; // {1, 2, 3, 4, 5, 7, 8}
        //int[] arrayToBeSorted = {84, 69, 76, 86, 94, 91, 75};
        selectionSort(arrayToBeSorted);
    }

    public static void selectionSort(int[] sortedArray) {
        int temp;
        int endElement;
        int largestElement;

        for (int e = (sortedArray.length-1); e > 0; e--) {
            largestElement = 0;
            endElement = e;
            for (int i=1; i <= e; i++) {
                if (sortedArray[i] > sortedArray[largestElement]) {
                    largestElement = i;
                }
            }
            temp = sortedArray[endElement];
            sortedArray[endElement] = sortedArray[largestElement];
            sortedArray[largestElement] = temp;
        }

        printSelectionSort(sortedArray);
    }

    public static void printSelectionSort(int[] sortedArray) {
        for (int i=0; i<sortedArray.length; i++) {
            System.out.println("Array elements " + sortedArray[i]);
        }
    }
}