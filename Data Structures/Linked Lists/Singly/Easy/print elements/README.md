## Question 🤔
This is just to practice traversing a linked list. Also, they are just given the `main` method only.
We need to create a `LinkedList` from our own and get the inputs from the STDIN.

## Solution 🙋
<details>
  <summary>Click here to expand the solution</summary>

> ***NOTE***: Anyone curious to learn about LinkedLists from scratch [here is a good article](https://medium.com/@prabhash.code/java-collections-under-the-hood-linkedlist-e01-8444a0bb4544) which explain the implementation of the `java.util.LinkedList`.

#### LinkedList build part
1. Since a LinkedList is a ***list of linked nodes***, we need a `Node` class which contains the `value` and `next` pointer.
2. The starting point of the link called `head`.
3. When we are adding elements to a `LinkedList` these steps are followed.
   1. Allocate the memory for new `Node`.
   2. if `head` is empty first assign the `head`.
   3. Then iterate to the end of the link and add new element to last.
   4. Always the last `Node` point to `null`.

#### LinkedList print part
1. We're starting from the `head` and assign it to the `current`.
2. Then current element's next pointer is not null we're printing it. (As above mentioned always the last element's next pointer, point to `null` )

</details>

[//]: # (adding additional margin from bottom)
<br>
<br>
<br>
<br>

