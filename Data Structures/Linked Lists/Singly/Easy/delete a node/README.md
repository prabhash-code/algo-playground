## Question 🤔
Delete the node at a given position in a linked list and return a reference to the head node. The head is at position 0. 
The list may be empty after you delete the node. In that case, return a null value.

## Solution 🙋
<details>
  <summary>Click here to expand the solution</summary>

> ***NOTE***: Anyone curious to learn about LinkedLists from scratch [here is a good article](https://medium.com/@prabhash.code/java-collections-under-the-hood-linkedlist-e01-8444a0bb4544) which explain the implementation of the `java.util.LinkedList`.

1. If we need to delete `head` just return the `next` of the `head`.
2. Iterate the Linked list up to position-1 node.
3. Point the `next` pointer of the `current` to the next of the next of current node.(if next of the `current` is null means we need to delete the `tail`)

</details>

[//]: # (adding additional margin from bottom)
<br>
<br>
<br>
<br>

