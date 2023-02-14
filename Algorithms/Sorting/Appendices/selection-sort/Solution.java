
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

class SelectionSort {

    static void selectionSort(int[] array) {
        for(int i = 0; i < array.length; i++){
            int smallest = i;
            for(int j = i+1; j < array.length; j++){
                if(array[smallest] > array[j]){
                    smallest = j;
                }
            }
            int temp = array[i];
            array[i] = array[smallest];
            array[smallest] = temp;
        }
    }
}
