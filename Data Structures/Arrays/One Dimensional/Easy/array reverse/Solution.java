
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

class Solution {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        int mid = a.size() / 2;
    
        for(int i = 0; i < mid; i++){
            int temp = a.get(a.size() - 1 - i);
            a.set(a.size() - 1 - i, a.get(i));
            a.set(i, temp);
        }
        return a;

    }

}
