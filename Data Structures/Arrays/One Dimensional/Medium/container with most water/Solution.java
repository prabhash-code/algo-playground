
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

  // time complexity = O(n^2)   space complexity = O(1)
  public static Integer containerWithMostWater(List<Integer> arr) {
    Integer max = 0;

    for (int i = 0; i < arr.size(); i++) {
      for (int j = i + 1; j < arr.size(); j++) {
        if (Math.abs(i - j) * Math.min(arr.get(i), arr.get(j)) > max)
          max = Math.abs(i - j) * Math.min(arr.get(i), arr.get(j));
      }
    }

    return max;
  }

  // time complexity = O(n)   space complexity = O(1)
  public static Integer containerWithMostWaterOther(List<Integer> arr) {
    Integer max = 0;
    Integer leftIdx = 0;
    Integer rightIdx = arr.size() - 1;

    while (leftIdx < rightIdx) {
      Integer width = rightIdx - leftIdx;
      Integer height = Math.min(arr.get(leftIdx), arr.get(rightIdx));

      if (width * height > max)
        max = width * height;


      if (arr.get(leftIdx) <= arr.get(rightIdx))
        leftIdx++;
      else
        rightIdx--;

    }

    return max;
  }

}