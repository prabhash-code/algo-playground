## Question 🤔
Given a pointer to the head of a linked list, insert a new node before the head. The `next` value in the new node should 
point to `head` and the `data` value should be replaced with a given value. Return a reference to the new head of the 
list. The head pointer given may be null meaning that the initial list is empty.

## Solution 🙋
<details>
  <summary>Click here to expand the solution</summary>

> ***NOTE***: Anyone curious to learn about LinkedLists from scratch [here is a good article](https://medium.com/@prabhash.code/java-collections-under-the-hood-linkedlist-e01-8444a0bb4544) which explain the implementation of the `java.util.LinkedList`.

> Here I used the `LinkedList` structure which we are using in the [print elements](../print%20elements/README.md) question.

1. We're given the `head` and value/s to insert.
2. Create a `newNode` and point it's `next` to the current `haed`.
3. Then set `newNode` as `head`.
4. Do above 2 and 3 until end the given value/s.

</details>

[//]: # (adding additional margin from bottom)
<br>
<br>
<br>
<br>

