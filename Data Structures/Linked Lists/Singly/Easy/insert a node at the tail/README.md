## Question 🤔
You are given the pointer to the `head` node of a linked list and an integer/s to add to the list. Create a new node with 
the given integer. Insert this node at the tail of the linked list and return the head node of the linked list formed 
after inserting this new node. The given head pointer may be null, meaning that the initial list is empty.

## Solution 🙋
<details>
  <summary>Click here to expand the solution</summary>

> ***NOTE***: Anyone curious to learn about LinkedLists from scratch [here is a good article](https://medium.com/@prabhash.code/java-collections-under-the-hood-linkedlist-e01-8444a0bb4544) which explain the implementation of the `java.util.LinkedList`.

> Here I used the `LinkedList` structure which we are using in the [print elements](../print%20elements/README.md) question.

1. We're given the `head` and value/s to insert.
2. First set the `current` value as the `head`.
3. Then as mentioned in the question just need to create a `newNode` while iterating the given value/s.
4. Finally assign `newNode` as `current`'s next pointer and set `current` as the `newNode`.

</details>

[//]: # (adding additional margin from bottom)
<br>
<br>
<br>
<br>

