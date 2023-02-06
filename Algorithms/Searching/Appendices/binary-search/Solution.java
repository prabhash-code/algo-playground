
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

    // Iterative Method
    // time complexity = O(log n)   space complexity = O(1)
    private static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int midVal = nums[mid];

            if (midVal == target)
                return mid;
            else if (midVal > target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    // Recursive Method
    // time complexity = O(log n)   space complexity = O(1)
    private static int binarySearch(int[] arr, int left, int right, int k) {
        if (left == right) return left;

        int mid = (left + right) / 2;

        if (arr[mid] == k)
            return mid;
        else if (arr[mid] > k)
            return binarySearch(arr, 0, mid - 1, k);
        else
            return binarySearch(arr, mid + 1, arr.length, k);
    }

}
