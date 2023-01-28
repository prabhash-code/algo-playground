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

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

public class Solution {

    // time complexity = O(n)   space complexity = O(1)
    public static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        // Write your code here
        SinglyLinkedListNode current = head;
        SinglyLinkedListNode previous = null;

        while(current != null){
            SinglyLinkedListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }
}
