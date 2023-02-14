
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

class BubbleSort {

    static void bubbleSort(int[] array) {
        int size = array.length;

        // loop to access each array element
        for (int i = 0; i < size - 1; i++) {

            // loop to compare array elements
            for (int j = 0; j < size - i - 1; j++) {

                // compare two adjacent elements
                if (array[j] > array[j + 1]) {

                    // swapping occurs if elements
                    // are not in the intended order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
