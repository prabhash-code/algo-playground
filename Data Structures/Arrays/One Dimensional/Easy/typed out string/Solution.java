
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

  // time complexity = O(n)   space complexity = O(n)
  private static boolean typeOutString(String s, String t) {
    StringBuilder s1 = new StringBuilder();
    for (char c : s.toCharArray()) {
      if (c == '#') {
        if (!s1.isEmpty()) s1.deleteCharAt(s1.toString().length() - 1);
      } else {
        s1.append(c);
      }
    }

    StringBuilder s2 = new StringBuilder();
    for (char c : t.toCharArray()) {
      if (c == '#') {
        if (!s2.isEmpty()) s2.deleteCharAt(s2.toString().length() - 1);
      } else {
        s2.append(c);
      }
    }

    return s1.toString().equals(s2.toString());
  }

  // time complexity = O(n)   space complexity = O(n)
  private static boolean typeOutString(String s, String t) {
    var sIdx = s.length() - 1;
    var tIdx = t.length() - 1;

    while (sIdx >= 0 || tIdx >= 0) {

      if (s.charAt(sIdx) == '#' || t.charAt(tIdx) == '#') {

        if (s.charAt(sIdx) == '#') {
          var sHashCount = 2;

          while (sHashCount > 0) {
            sIdx--;
            sHashCount--;
            if (s.charAt(sIdx) == '#') {
              sHashCount = sHashCount + 2;
            }
          }
        }

        if (t.charAt(tIdx) == '#') {
          var tHashCount = 2;
          while (tHashCount > 0) {
            tIdx--;
            tHashCount--;
            if (t.charAt(tIdx) == '#') {
              tHashCount = tHashCount + 2;
            }
          }
        }
      } else {
        if (s.charAt(sIdx) != t.charAt(tIdx)) {
          return false;
        }

        sIdx--;
        tIdx--;
      }

    }

    return true;
  }

}