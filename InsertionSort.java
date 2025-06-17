import.java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11}; 
        System.out.println("Original Array:");
        printArray(arr);
        insertionSort(arr);
        System.out.println("\nSorted Array in Ascending Order:");
        printArray(arr);
    }
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
