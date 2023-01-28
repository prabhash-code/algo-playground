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
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7   left = 3    right = 5
        // 1 -> 2 -> 5 -> 4 -> 3 -> 6 -> 7

        ListNode actualHead = head;
        ListNode start = head; // to keep track the `Node` before the left position
        ListNode current = head;
        int position = 1;

        while (position < left){
            start = current;
            current = current.next;
            position++;
        }

        /*
            We need to keep track the `Node` in `right` position after reverse. Hence we create `tail` variable.
            Once the reverse is done the 'left` position node will be sit at the `right` position. It means we can
            add the rest of nodes to the `Node` in `right` position.
         */
        ListNode tail = current;
        ListNode newList = null; // we are create new list here

        while (position >= left && position <= right){
            ListNode next = current.next;
            current.next = newList;
            newList = current;
            current = next;

            position++;
        }

        start.next = newList;
        tail.next = current;

        if (left > 1)
            return actualHead;
        else {
            // in this case the `actualHead` will be the tail. Hence we can return `newList`
            // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7   left = 1    right = 3
            // 3 -> 2 -> 1 -> 4 -> 5 -> 6 -> 7
            return newList;
        }
    }
}
