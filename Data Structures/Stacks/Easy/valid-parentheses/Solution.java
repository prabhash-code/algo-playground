
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
    public static boolean isValid(String s) {
        if (s.length() == 0) return true;
        if (s.length() == 1) return false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == '(' || curr == '{' || curr == '['){
                stack.push(curr);
            }else {
                if (curr == ')'){
                    if (stack.isEmpty()) return false;
                    if ('(' != stack.pop()) return false;
                }

                if (curr == '}'){
                    if (stack.isEmpty()) return false;
                    if ('{' != stack.pop()) return false;
                }

                if (curr == ']'){
                    if (stack.isEmpty()) return false;
                    if ('[' != stack.pop()) return false;
                }
            }
        }

        return stack.empty();
    }

}
