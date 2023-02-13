##  Least Recently Used (LRU) cache. 🤔
Design a data structure that follows the constraints of a **Least Recently Used (LRU)** cache.

Implement the `LRUCache` class:

* `LRUCache(int capacity)` Initialize the LRU cache with positive size `capacity`.
* `int get(int key)` Return the value of the `key` if the key exists, otherwise return `-1`.
* `void put(int key, int value)` Update the value of the `key` if the key exists. Otherwise, add the `key-value` 
pair to the cache. If the number of keys exceeds the capacity from this operation, **evict** the least recently 
used key.

<img src="img.PNG" alt="Quick Sort Algorithm" width="800"/>


## Solution 🙋
<details>
  <summary>Click here to expand the solution</summary>

We are providing three solutions and first two of them used same approach. In both first and second solutions using a 
`DoublyLinkedList` and a `HashMap` to maintain the elements. First solution contains the implementation for 
`DoublyLinkedList` as well, but 2nd solution uses the inbuilt Java `LinkedList`. Third solution uses the 
`LinkedHashMap` to solve LRU using a single Data Structure.

#### Get Steps

```java
if key is not present
    return -1
else
    fetch the node
    remove node from LinkedList
    add node infront of LinkedList and put it in the map
    return node
```
#### Put Steps

```java
if map contains the key 
    remove the node from the map
if map is full
    remove node back of LinkedList
add node infront of LinkedList and put it in the map
```


</details>

[//]: # (adding additional margin from bottom)
<br>
<br>
<br>
<br>

