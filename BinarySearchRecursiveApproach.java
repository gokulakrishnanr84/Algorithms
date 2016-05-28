package com.gokri;

public class Main {

    public static void main(String[] args) {
        //int[] sortedArray = {12,13,16,17,20};
        //int elementToBeFound = 17;

        //int[] sortedArray = {12,33,45,67,67,80};
        //int elementToBeFound = 67;

        //int[] sortedArray = {12,33,45,67,70,80};
        //int elementToBeFound = 73;

        //int[] sortedArray = {12,33,45,67,70,80};
        //int elementToBeFound = 120;

        int[] sortedArray = {90, 80, 70, 60, 50, 40};
        int elementToBeFound = 80;

        boolean isAscending = isAscendingSortedArray(sortedArray);
        System.out.println("Is Ascending Sorted Array ?? " + isAscending);

        int arrLength = sortedArray.length;
        int result = binarySearchRecursion(sortedArray, 0, arrLength-1, elementToBeFound, isAscending);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }

    public static int binarySearchRecursion(int[] arr, int startElement, int endElement, int toFind, boolean isAscending) {
        if (endElement >= startElement) {
            int middleElement = startElement + (endElement - startElement) / 2;
            //System.out.println("Printing middle element - " + middleElement);

            if (arr[middleElement] == toFind)
                return middleElement;

            if (isAscending) {
                if (arr[middleElement] > toFind) {
                    return binarySearchRecursion(arr, startElement, middleElement - 1, toFind, isAscending);
                }

                if (arr[middleElement] < toFind) {
                    return binarySearchRecursion(arr, middleElement + 1, endElement, toFind, isAscending);
                }
            }
            else {
                if (arr[middleElement] < toFind) {
                    return binarySearchRecursion(arr, startElement, middleElement - 1, toFind, isAscending);
                }

                if (arr[middleElement] > toFind) {
                    return binarySearchRecursion(arr, middleElement + 1, endElement, toFind, isAscending);
                }
            }
        }

        return -1;
    }

    public static boolean isAscendingSortedArray(int[] arr) {
        if (arr[arr.length-1] > arr[0])
            return true;
        else
            return false;
    }
}


