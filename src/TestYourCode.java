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

public class TestYourCode {
  public static void main(String[] args) {
    System.out.println("Use this space to test and debug your code...");
    List<List<Integer>> list = new ArrayList<>();

    List<Integer> one = List.of(1, 2, 100);
    List<Integer> two = List.of(2, 5, 100);
    List<Integer> three = List.of(3, 4, 100);

    list.addAll(List.of(one, two, three));

    System.out.printf("ANS: " + arrayManipulation(5, list));
  }

  public static long arrayManipulation(int n, List<List<Integer>> queries) {
    Long largest = 0L;
    long[] array = new long[n + 1];

    for (int i = 0; i < queries.size(); i++) {
      int start = queries.get(i).get(0);
      int end = queries.get(i).get(1);
      int k = queries.get(i).get(2);

      array[start - 1] += k;
      array[end] -= k;
    }

    /* Find max value */
    long sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
      largest = Math.max(largest, sum);
    }

    return largest;
  }
}