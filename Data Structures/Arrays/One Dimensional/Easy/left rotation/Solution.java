
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
   * Complete the 'rotateLeft' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts following parameters:
   *  1. INTEGER d
   *  2. INTEGER_ARRAY arr
   */

  public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // brute force solution - not efficiency
    // for(int i = 0; i < d; i++){
    //   for(int j = 0; j < arr.size()-1; j++){
    //     int temp = arr.get(j);
    //     arr.set(j, arr.get(j+1));
    //     arr.set(j+1, temp);
    //   }
    // }

    if (arr.size() == d)
      return arr;

    if (arr.size() > d) {
      List<Integer> right = arr.subList(d, arr.size());
      right.addAll(arr.subList(0, d));
      return right;
    }

    int mod = arr.size() % d;
    List<Integer> right = arr.subList(mod, arr.size());
    right.addAll(arr.subList(0, mod));
    return right;
  }

}