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

public class Node {
    public Node(int val, Node prev, Node next, Node child) {
        this.val = val;
        this.prev = prev;
        this.next = next;
        this.child = child;
    }

    public int val;
    public Node prev;
    public Node next;
    public Node child;
}

public class Solution {

    /** LinkedList looks like this
     *
     *     null --- 1 --- 2 --- 3 --- 4 --- 5 --- 6 --- null
     *                    |                 |
     *                    7 --- 8 --- 9     12 --- 13
     *                          |
     *                          10 --- 11
     *
     *     Node head = new Node(1, null, null, null);
     *     Node two = new Node(2, head, null, null);
     *     Node three = new Node(3, two, null, null);
     *     Node four = new Node(4, three, null, null);
     *     Node five = new Node(5, four, null, null);
     *     Node six = new Node(6, five, null, null);
     *
     *     head.next = two;
     *     two.next = three;
     *     three.next = four;
     *     four.next = five;
     *     five.next = six;
     *
     *     Node seven = new Node(7, null, null, null);
     *     Node eight = new Node(8, seven, null, null);
     *     Node nine = new Node(9, eight, null, null);
     *
     *     seven.next = eight;
     *     eight.next = nine;
     *
     *     Node ten = new Node(10, null, null, null);
     *     Node eleven = new Node(11, ten, null, null);
     *
     *     ten.next = eleven;
     *
     *     Node twelve = new Node(12, null, null, null);
     *     Node thirteen = new Node(13, twelve, null, null);
     *
     *     twelve.next = thirteen;
     *
     *     two.child = seven;
     *     eight.child = ten;
     *     five.child = twelve;
     *
     */

    // time complexity = O(n)   space complexity = O(1)
    public static Node flatten(Node head) {
        if (head == null) return head;

        Node current = head;

        while (current != null) {
            if (current.child == null) {
                current = current.next;
            } else {
                Node tail = current.child;

                while (tail.next != null){
                    tail = tail.next;
                }

                tail.next = current.next;

                // if the child belongs to the last node parent level. So then that parent level last node.next will be null.
                if(tail.next != null){
                    tail.next.prev = tail;
                }

                current.next = current.child;
                current.next.prev = current;
                current.child = null;
            }
        }

        return head;
    }

}
