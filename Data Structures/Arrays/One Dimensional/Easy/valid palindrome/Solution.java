
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
  public static boolean isPalindrome(String s) {
    // return `true` if the string contains only one or zero characters
    if (s.length() <= 1) return true;

    // Below regex will match all non-alphanumeric characters and then we are removing them all
    String regex = "[^A-Za-z0-9]";
    s = s.replaceAll(regex, "").toLowerCase();

    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
      if (s.charAt(left) != s.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }

  public static List<Integer> findIndecesOther(List<Integer> arr, Integer output) {
    Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < arr.size(); i++){
      map.put(arr.get(i), i);
    }

    for (int i = 0; i < arr.size(); i++) {
      Integer numberToFind = output - arr.get(i);

      if(map.get(numberToFind) != null){
        return List.of(i, map.get(numberToFind));
      }
    }
    return null;
  }

  // time complexity = O(n)   space complexity = O(n)
  public static List<Integer> findIndecesAnother(List<Integer> arr, Integer output) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.size(); i++) {
      Integer currentMapVal = map.get(arr.get(i));

      if(currentMapVal != null){
        return List.of(i, currentMapVal);
      }else {
        Integer numberToFind = output - arr.get(i);
        map.put(numberToFind, i);
      }
    }
    return null;
  }

}