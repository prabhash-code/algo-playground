package ds.arrays.twoD.easy.dynamicArray;

import java.util.*;

import static java.util.stream.Collectors.joining;

class Solution {

  /*
   * Complete the 'dynamicArray' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts following parameters:
   *  1. INTEGER n
   *  2. 2D_INTEGER_ARRAY queries
   */

  public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
    int lastAnswer = 0;
    List<Integer> ans = new ArrayList<>();
    // Write your code here
    List<List<Integer>> lists = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      lists.add(new ArrayList<Integer>());
    }

    for (List<Integer> query : queries){
      if (query.get(0) == 1){
        lists.get((query.get(1) ^ lastAnswer) % n).add(query.get(2));
      } else {
        List<Integer> l = lists.get((query.get(1) ^ lastAnswer) % n);
        lastAnswer = l.get(query.get(2) % l.size());
      }
      ans.add(lastAnswer);
    }
    return ans;
  }

}
