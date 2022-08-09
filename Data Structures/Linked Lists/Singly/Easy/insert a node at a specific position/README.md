## Question 🤔
Given the pointer to the head node of a linked list and an integer to insert at a certain position, create a new 
node with the given integer as its `data` attribute, insert this node at the desired position and return the head node.

A position of 0 indicates head, a position of 1 indicates one node away from the head and so on. The head pointer 
given may be null meaning that the initial list is empty.

## Solution 🙋
<details>
  <summary>Click here to expand the solution</summary>

> ***NOTE***: Anyone curious to learn about LinkedLists from scratch [here is a good article](https://medium.com/@prabhash.code/java-collections-under-the-hood-linkedlist-e01-8444a0bb4544) which explain the implementation of the `java.util.LinkedList`.

1. Create a `newNode` with given data.
2. Iterate the Linked list up to position-1(just before) node.
3. Point the `next` pointer of the `newNode` to the next of current node.
4. Finally, Point the next pointer of current node to the `newNode`.

</details>

[//]: # (adding additional margin from bottom)
<br>
<br>
<br>
<br>

