
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
   * Complete the 'matchingStrings' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts following parameters:
   *  1. STRING_ARRAY strings
   *  2. STRING_ARRAY queries
   */

  public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    // brute force solution - not efficiency
    // List<Integer> matches = new ArrayList<>();
    // for(String q : queries){
    //   int occurence = 0;
    //   for(String s : strings){
    //     if(q.equals(s)) occurence++;
    //   }
    //   matches.add(occurence);
    // }
    // return matches;

    Map<String, Integer> map = new HashMap<>();
    List<Integer> matches = new ArrayList<>();

    for (String s : strings) {
      if (map.get(s) != null) {
        map.put(s, map.get(s) + 1);
      } else {
        map.put(s, 1);
      }
    }

    for (String q : queries) {
      if (map.get(q) != null) {
        matches.add(map.get(q));
      }else{
        matches.add(0);
      }
    }

    return matches;
  }

}