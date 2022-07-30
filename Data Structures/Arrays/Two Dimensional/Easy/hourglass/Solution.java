
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
   * Complete the 'hourglassSum' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts 2D_INTEGER_ARRAY arr as parameter.
   */

  public static int hourglassSum(List<List<Integer>> arr) {
    int sum = Integer.MIN_VALUE;
    // Write your code here
    for(int i = 0; i < arr.size() - 2; i++){
      List<Integer> inner = arr.get(i);

      for(int j = 0; j < inner.size() - 2; j++){
        int first = inner.get(j) + inner.get(j + 1) + inner.get(j + 2);
        int second = arr.get(i + 1).get(j + 1);
        int third = arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

        int temp = first + second + third;
        if(temp > sum)
          sum = temp;
      }
    }

    return sum;
  }

}
