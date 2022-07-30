
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
    List<Integer> answers = new ArrayList<>();

    /* Create 2-D ArrayList */
    ArrayList<ArrayList<Integer>> lists = new ArrayList();
    for (int i = 0; i < n; i++) {
      lists.add(new ArrayList<>());
    }

    for (List<Integer> query : queries){
      int q = query.get(0);
      int x = query.get(1);
      int y = query.get(2);
      ArrayList<Integer> seq = lists.get((x ^ lastAnswer) % n);
      if (q == 1) {
        seq.add(y);
      } else if (q == 2) {
        lastAnswer = seq.get(y % seq.size());
        answers.add(lastAnswer);
      }
    }
    return answers;
  }

}
