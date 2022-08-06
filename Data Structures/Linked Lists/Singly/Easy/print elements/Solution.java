
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

    public static void printLinkedList(List<Integer> a) {
        LinkedList linkedList = new LinkedList();

        for (Integer i : a) {
            linkedList.add(i);
        }

        LinkedList.Node current = linkedList.head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
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

            Solution.printLinkedList(arr);

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

        class Node {
            int value;
            Node next;
        }

    }

}
