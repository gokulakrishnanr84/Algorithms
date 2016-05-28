package com.gokri;

public class Main {

    public static void main(String[] args) {
        int[] sortedArray = {40, 50, 60, 70, 80};
        int elementToBeFound = 40;

        boolean isAscending = isAscendingSortedArray(sortedArray);
        int arrLength = sortedArray.length;
        int elementLocation = binarySearchIteration(sortedArray, 0, arrLength-1, elementToBeFound, isAscending);
        if (elementLocation == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at " + elementLocation);
    }

    public static boolean isAscendingSortedArray(int[] arr) {
        if (arr[arr.length-1] > arr[0])
            return true;
        else
            return false;
    }

    public static int binarySearchIteration(int[] arr, int startElement, int endElement, int toFind, boolean isAscending) {
        if (isAscending) {
            while (endElement >= startElement) {
                int middleElement = startElement + (endElement - startElement) / 2;

                if (arr[middleElement] == toFind)
                    return middleElement;

                if (arr[middleElement] > toFind) {
                    endElement = middleElement - 1;
                }

                if (arr[middleElement] < toFind) {
                    startElement = middleElement + 1;
                }
            }
        }
        else {
            while (endElement >= startElement) {
                int middleElement = startElement + (endElement - startElement) / 2;

                if (arr[middleElement] == toFind)
                    return middleElement;

                if (arr[middleElement] < toFind) {
                    endElement = middleElement - 1;
                }

                if (arr[middleElement] > toFind) {
                    startElement = middleElement + 1;
                }
            }
        }
        return -1;
    }
}
