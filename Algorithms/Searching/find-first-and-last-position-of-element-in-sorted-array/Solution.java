
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

  // time complexity = O(log n)   space complexity = O(1)
  public static int[] searchRange(int[] arr, int target) {
    if (arr.length == 0)
      return new int[]{-1, -1};

    int targetIdx = binarySearch(arr, 0, arr.length - 1, target);

    if (targetIdx == -1)
      return new int[]{-1, -1};

    int startPosition = targetIdx;
    int endPosition = targetIdx;
    int temp1 = -1;
    int temp2 = -1;

    while (startPosition != -1) {
      temp1 = startPosition;
      startPosition = binarySearch(arr, 0, startPosition - 1, target);
    }

    startPosition = temp1;

    while (endPosition != -1) {
      temp2 = endPosition;
      endPosition = binarySearch(arr, endPosition + 1, arr.length - 1, target);
    }

    endPosition = temp2;

    return new int[]{startPosition, endPosition};
  }

  public static int binarySearch(int[] arr, int left, int right, int target) {

    while (left <= right) {
      int mid = (left + right) / 2;
      int midVal = arr[mid];

      if (midVal == target) {
        return mid;
      } else if (midVal > target) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }

    }

    return -1;
  }

}