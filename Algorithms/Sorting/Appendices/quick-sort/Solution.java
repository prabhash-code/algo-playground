
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class QuickSortOne {

    /**
     * This QuickSort logic iterate through the array from left to the right, when comparing and swapping
     */

    // method to find the partition position
    public static int partition(int array[], int low, int high) {

        // choose the rightmost element as pivot
        int pivot = array[high];

        // pointer for greater element
        int i = (low - 1);

        // traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {

                // if element smaller than pivot is found
                // swap it with the greatr element pointed by i
                i++;

                // swapping element at i with element at j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        // swapt the pivot element with the greater element specified by i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // return the position from where partition is done
        return (i + 1);
    }

    public static void quickSort(int array[], int low, int high) {
        if (low < high) {

            // pick a pivot element and swap elements such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pi = partition(array, low, high);

            // recursive call on the left of pivot
            quickSort(array, low, pi - 1);

            // recursive call on the right of pivot
            quickSort(array, pi + 1, high);
        }
    }

    public static void main(String args[]) {

        int[] data = { 8, 7, 2, 1, 0, 9, 6 };
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(data));

        int size = data.length;

        // call quicksort() on array data
        quickSort(data, 0, size - 1);

        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}



class QuickSortTwo {

    /**
     * This QuickSort logic iterate through the array from left and right to the middle, when comparing and swapping
     */

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println("Before");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("After");
        printArray(arr);
    }

    private static void quickSort(int[] arr, int lowIndex, int highIndex) {

        // base case for recursive method
        if (lowIndex >= highIndex)
            return;

        // pivot is chosen as the last element of the array
        int pivot = arr[highIndex];

        // we need two pointers
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {

            // check less number than `pivot` iteration from left side
            while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            // check greater number than `pivot` iteration from right side
            while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            // swap left and right pointer values
            swap(arr, leftPointer, rightPointer);
        }

        // swap the `pivot` with left index value
        swap(arr, leftPointer, highIndex);

        // recursively sorting left partition from the `pivot`
        quickSort(arr, lowIndex, leftPointer - 1);

        // recursively sorting right partition from the `pivot`
        quickSort(arr, leftPointer + 1, highIndex);
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
