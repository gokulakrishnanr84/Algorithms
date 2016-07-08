package com.gokri;

public class Main {

    public static void main(String[] args) {
        int[] inputArray = {8, 6, 1, 4, 7, 3, 2, 9, 5};

        mergeSort(inputArray);
        for (int i : inputArray) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public static void mergeSort(int[] inputArray) {
        if (inputArray.length > 1) {
            int[] firstHalf = firstHalf(inputArray);
            int[] secondHalf = secondHalf(inputArray);
            //printFH(firstHalf);
            //printSH(secondHalf);

            mergeSort(firstHalf);
            mergeSort(secondHalf);
            merge(firstHalf, secondHalf, inputArray);
        }
    }

    public static int[] firstHalf(int[] inputArray) {
        int middleElement = (inputArray.length) / 2;
        int[] array = new int[middleElement];

        for (int i = 0; i < middleElement; i++) {
            array[i] = inputArray[i];
        }
        return array;
    }


    public static int[] secondHalf(int[] inputArray) {
        int middleElement = (inputArray.length) / 2;
        int arrayLength = inputArray.length;
        int[] array = new int[arrayLength - middleElement];

        for (int i = 0; i < arrayLength - middleElement; i++) {
            array[i] = inputArray[i + middleElement];
        }
        return array;
    }

    public static void merge(int[] firstHalf, int[] secondHalf, int[] arr) {
        int leftSize = firstHalf.length;
        int rightSize = secondHalf.length;

        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (firstHalf[i] <= secondHalf[j]) {
                arr[k] = firstHalf[i];
                i++;
                k++;
            } else {
                arr[k] = secondHalf[j];
                k++;
                j++;
            }
        }
        while (i < leftSize) {
            arr[k] = firstHalf[i];
            k++;
            i++;
        }
        while (j < rightSize) {
            arr[k] = secondHalf[j];
            k++;
            j++;
        }

        /*for (int z : arr) {
            System.out.print(z);
            System.out.print(" ");
        }
        System.out.println();*/
    }
}
