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
        int size = array.length;

        for (int i = size / 2 - 1; i >= 0; i--) {
            heapSort(i, array, size);
        }

        for(int i = array.length-1; i >= 0; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            size  = size - 1;
            heapSort(0, array, size);
        }
    }

    public static void heapSort(int i, int[] array, int size) {
        int largestElementIndex = i;

        int leftChildIndex = leftChild(i);
        if (leftChildIndex < size && array[leftChildIndex] > array[largestElementIndex]) {
            largestElementIndex = leftChildIndex;
        }

        int rightChildIndex = rightChild(i);
        if (rightChildIndex < size && array[rightChildIndex] > array[largestElementIndex]) {
            largestElementIndex = rightChildIndex;
        }

        if (largestElementIndex != i) {
            int swap = array[i];
            array[i] = array[largestElementIndex];
            array[largestElementIndex] = swap;

            heapSort(largestElementIndex, array, size);
        }
    }

    private static int leftChild(int i){
        return 2 * i + 1;
    }

    private static int rightChild(int i) {
        return 2 * i + 2;
    }
}
