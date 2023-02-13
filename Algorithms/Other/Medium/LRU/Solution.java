
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


/***
 * Second Solution - using custom LinkedList
 */
class LRUCache {

    // Create doubly linkedlist - `head` and `tail`
    // These `head` and `tail` are just placeholders and doesn't hold any meaningful values
    private Node head = new Node(0, 0);
    private Node tail = new Node(0, 0);

    // create map to store the key and its node
    private Map<Integer, Node> map = new HashMap<>();
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.next = head;
    }

    public int get(int key) {
        // if key is not present, return -1
        if (!map.containsKey(key)) {
            return -1;
        }

        // otherwise, fetch the node mapped to the key
        Node node = map.get(key);
        // we will set the node as the most recently used
        // by placing it right next to head
        remove(node);       // remove from wherever it is (also from map)
        insert(node);       // put it right after head  (also add it to map)

        return node.value;  // return value for the key
    }

    public void put(int key, int value) {
        // if map contains the key, we will remove the node from the map
        if (map.containsKey(key)) {
            remove(map.get(key));
        }
        // if map size has reached max capacity, we will remove/evict the
        // LEAST RECENTLY USED node that will be right before the tail of linkedlist
        if (map.size() == capacity) {
            remove(tail.prev);
        }
        // we will insert the new node at head's next and put it in the map
        insert(new Node(key, value));
    }

    // This method removes the node from its current position
    // as well as it removes the mapping from the hashmap
    private void remove(Node node) {
        // remove from map
        map.remove(node.key);

        // delete the node from LinkedList
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // This method adds the node right at the next of the head
    // as well as it puts a new mapping into the hashmap
    private void insert(Node node) {
        // add to hashmap
        map.put(node.key, node);

        // Place at head's next
        Node headNext = head.next;
        headNext.prev = node;
        node.next = headNext;
        head.next = node;
        node.prev = head;
    }

    // The node class
    private class Node {
        Node next, prev;
        int key, value;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}


/***
 * Second Solution - using inbuilt LinkedList
 */
class LRUCache {

    // a DLL and a Map
    int capacity;
    LinkedList<DLLNode> l1;
    private Map<Integer, DLLNode> m1;

    // constructor
    public LRUCache(int capacity) {
        this.capacity = capacity;
        l1 = new LinkedList<>();
        m1 = new HashMap<Integer, DLLNode>();
    }

    // get api
    public int get(int key) {
        if (!m1.containsKey(key)) {
            // if key is not present, return -1
            return -1;
        }
        // already present in the cache, move it to front
        // no need to update the hashmap, as the node is just moved
        DLLNode n1 = m1.get(key);
        l1.remove(n1);
        l1.addFirst(n1);
        return n1.value;
    }

    // put api
    public void put(int key, int value) {
        if (m1.containsKey(key)) {
            // if key is already present, just update the value
            // no need to update the hashmap, as just the value is updated
            DLLNode n1 = m1.get(key);
            n1.value = value;
            l1.remove(n1);
            l1.addFirst(n1);
        } else {
            // if key is not present, create new and add it to the front
            DLLNode n1 = new DLLNode(key, value);
            l1.addFirst(n1);
            m1.put(key, n1);

            // in case of overflow, remove last node from DLL and also from Map
            if (l1.size() > capacity) {
                m1.remove(l1.getLast().key);
                l1.remove(l1.getLast());
            }
        }
    }

    // Doubly Linked List Node
    class DLLNode {
        // stores key and value
        int key;
        int value;

        // constructor
        public DLLNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}


/***
 * Thisrd Solution - using LinkedHashMap
 */
class LRUCache {

    private int capacity;
    private LinkedHashMap<Integer, Integer> m1;

    // constructor
    public LRUCache(int capacity) {
        this.capacity = capacity;
        m1 = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
            // whenever capacity is reached eldest entry is removed
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > capacity;
            }
        };
    }

    // get api
    public int get(int key) {
        return m1.getOrDefault(key, -1);
    }

    // put api
    public void put(int key, int value) {
        m1.put(key, value);
    }
}