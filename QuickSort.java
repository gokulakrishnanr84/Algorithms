package com.gokri;

public class Main {

    private static int[] inputArray;
    private static int length;

    public static void main(String[] args) {
        int[] array = {24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12};
        //int[] array = {10, 2, 45, 56, 98};

        sort(array);
        for (int i : array) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public static void sort(int[] array) {
        if (array.length > 0) {
            inputArray = array;
            length = array.length;
            quickSort(0, length - 1);
        }
    }

    public static void quickSort(int startElement, int endElement) {
        int i = startElement;
        int j = endElement;
        int pivot = inputArray[startElement + (endElement - startElement)/2];

        while (i <= j) {
            while (inputArray[i] < pivot) {
                i++;
            }
            while (inputArray[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }

        if (startElement < j) {
            quickSort(startElement, j);
        }

        if (i < endElement) {
            quickSort(i, endElement);
        }
    }

    public static void exchangeNumbers(int startElement, int endElement) {
        int temp = inputArray[startElement];
        inputArray[startElement] = inputArray[endElement];
        inputArray[endElement] = temp;
    }
}
