
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
   * Complete the 'arrayManipulation' function below.
   *
   * The function is expected to return a LONG_INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER n
   *  2. 2D_INTEGER_ARRAY queries
   */

  public static long arrayManipulation(int n, List<List<Integer>> queries) {
    // brute force solution
    /*Map<Integer, Long> map = new HashMap<>();
    Long largest = 0L;

    for(int i = 0; i < queries.size(); i++){
      int start = queries.get(i).get(0);
      int end = queries.get(i).get(1);
      int k = queries.get(i).get(2);

      for(int j = start; j <= end; j++){
        Long val = map.get(j);
        if(val == null){
          map.put(j, Long.valueOf(k));
        } else{
          map.put(j, val + Long.valueOf(k));
        }

        if(map.get(j) != null && map.get(j) > largest)
          largest = map.get(j);
      }

    }*/

    //better approach
    Long largest = 0L;
    long[] array = new long[n + 1];

    for (int i = 0; i < queries.size(); i++) {
      int start = queries.get(i).get(0);
      int end = queries.get(i).get(1);
      int k = queries.get(i).get(2);

      array[start - 1] += k;
      array[end] -= k;
    }

    /* Find max value */
    long sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
      largest = Math.max(largest, sum);
    }

    return largest;
  }

}
