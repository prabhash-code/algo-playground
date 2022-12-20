
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

  // time complexity = O(n^2 * k)   space complexity = O(n * k)
  public static int lengthOfLongestSubstring(String s) {
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
      for (int j = i; j < s.length(); j++) {
        String sub = s.substring(i, j+1);
        Set<Character> set = new HashSet<>();
        boolean hasDuplicate = false;

        for(char c : sub.toCharArray()){
          if(set.contains(c)){
            hasDuplicate = true;
            break;
          }else {
            set.add(c);
          }
        }

        if (!hasDuplicate && count < sub.length())
          count = sub.length();
      }
    }

    return count;
  }

  // time complexity = O(n^2)   space complexity = O(n)
  public static int lengthOfLongestSubstring(String s) {
    if (s.length() <= 1) return s.length();

    var longest = 0;

    for (int left = 0; left < s.length(); left++) {
      var seenChars = new HashSet<>();
      var currentLength = 0;

      for (int right = left; right < s.length(); right++) {
        var currentChar = s.charAt(right);

        if (!seenChars.contains(currentChar)) {
          currentLength++;
          seenChars.add(currentChar);
          longest = Math.max(longest, currentLength);
        } else {
          break;
        }
      }


    }
    return longest;
  }

  // time complexity = O(n)   space complexity = O(n)
  public static int lengthOfLongestSubstring(String s) {
    if (s.length() <= 1) return s.length();

    Map<Character, Integer> seenChars = new HashMap<>();
    var longest = 0;
    var left = 0;

    for (int right = 0; right < s.length(); right++) {
      var currentChar = s.charAt(right);
      var prevSeenCharIdx = seenChars.get(currentChar);

      if(prevSeenCharIdx != null && prevSeenCharIdx >= left){
        left=prevSeenCharIdx+1;
      }

      seenChars.put(currentChar, right);
      longest = Math.max(longest, right-left+1);

    }
    return longest;
  }

}