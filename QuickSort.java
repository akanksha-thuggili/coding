public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};  
        System.out.println("Original Array:");
        printArray(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.println("\nSorted Array in Ascending Order:");
        printArray(arr);
    }
}
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
}
}
