
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
    public static String minRemoveToMakeValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == '('){
                stack.push(i);
            } else if (arr[i] == ')' && !stack.isEmpty()) {
                stack.pop();
            } else if (arr[i] == ')') {
                arr[i] = '-';
            }
        }

        while (!stack.isEmpty()){
            int idx = stack.pop();
            arr[idx] = '-';
        }

        return new String(arr).replace("-", "");
    }

}
