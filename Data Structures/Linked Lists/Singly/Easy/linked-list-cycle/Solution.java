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

static class Node {
    int val;
    Node next;

    Node(int x) {
        val = x;
        next = null;
    }
}

public class Solution {

    // time complexity = O(n)   space complexity = O(n)
    public static boolean hasCycle(Node head) {

        Node current = head;
        Set<Node> seenNodes = new HashSet<>();

        while (current != null) {
            if (!seenNodes.contains(current)) {
                seenNodes.add(current);
                current = current.next;
            } else {
                return true;
            }
        }

        return false;
    }
}
