
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
  public static List<Integer> findIndeces(List<Integer> arr, Integer output) {
    for (int i = 0; i < arr.size(); i++) {
      for (int j = i + 1; j < arr.size(); j++) {
        System.out.println("i = " + i +",j = "+ j +",arr.get(i) = "+ arr.get(i) +",arr.get(j) = " + arr.get(j));
        System.out.println("sum = " + (arr.get(i) + arr.get(j)));
        if (arr.get(i) + arr.get(j) == output) {
          return List.of(i, j);
        }
      }
    }
    return null;
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