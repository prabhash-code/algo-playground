
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

  // time complexity = O(n^2)   space complexity = O(n)
  public static Integer trappingWater(List<Integer> arr) {
    Integer total = 0;

    for (int i = 0; i < arr.size(); i++) {
      Integer maxLeft = 0;
      Integer maxRight = 0;

      int l = i;
      while (l >= 0) {
        if (maxLeft < arr.get(l)) {
          maxLeft = arr.get(l);
        }
        l--;
      }

      int r = i;
      while (r < arr.size()) {
        if (maxRight < arr.get(r)) {
          maxRight = arr.get(r);
        }
        r++;
      }

      Integer waterInCurrentPile = Math.min(maxLeft, maxRight) - arr.get(i);
      if (waterInCurrentPile >= 0)
        total += waterInCurrentPile;

    }

    return total;
  }

}