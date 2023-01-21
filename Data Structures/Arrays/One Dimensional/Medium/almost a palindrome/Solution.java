
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

  // time complexity = O(n)   space complexity = O(1)
  public static boolean almostPalindrome(String s) {
    // return `true` if the string contains only one or zero characters
    if (s.length() <= 1) return true;

    // Below regex will match all non-alphanumeric characters and then we are removing them all
    String regex = "[^A-Za-z0-9]";
    s = s.replaceAll(regex, "").toLowerCase();

    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
      if (s.charAt(left) != s.charAt(right)) {
        boolean first = validSubPalindrome(s, left + 1, right);
        boolean second = validSubPalindrome(s, left, right - 1);
        return first || second;
      }
      left++;
      right--;
    }
    return true;
  }

  private static boolean validSubPalindrome(String s, int left, int right) {
    while (left < right) {
      if (s.charAt(left) != s.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }

}