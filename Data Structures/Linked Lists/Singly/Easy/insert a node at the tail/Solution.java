
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

    public static LinkedList.Node insertNodeAtTail(LinkedList.Node head, List<Integer> data) {
        LinkedList linkedList = new LinkedList();

        LinkedList.Node current = head;
        for (Integer i : data) {
            LinkedList.Node newNode = new LinkedList.Node();
            newNode.value = i;

            current.next = newNode;
            current = newNode;
        }

        return head;
    }

    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> arr = new ArrayList<>();

            IntStream.range(0, arrCount).forEach(i -> {
                try {
                    arr.add(Integer.parseInt(bufferedReader.readLine().trim()));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            LinkedList.Node head = new LinkedList.Node();
            head.value = arr.get(0);

            LinkedList.Node node = Solution.insertNodeAtTail(head, arr.subList(1, arrCount));

            LinkedList.Node current = node;
            while (current != null) {
                System.out.println(current.value);
                current = current.next;
            }

            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static class LinkedList {
        Node head;

        void add(int val) {
            Node node = new Node();
            node.value = val;

            if (this.head == null) {
                head = node;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = node;
            }
        }

        static class Node {
            int value;
            Node next;
        }

    }

}
