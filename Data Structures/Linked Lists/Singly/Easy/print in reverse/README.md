## Question 🤔
Given a pointer to the head of a singly-linked list, print each `data` value from the reversed list. If the given list is 
empty, do not print anything.

Example<br>
`head*` refers to the linked list with `data` values:<br>
`1 -> 2 -> 3 -> NULL`

Print the following:<br>
3<br>
2<br>
1<br>

## Solution 🙋
<details>
  <summary>Click here to expand the solution</summary>

> ***NOTE***: Anyone curious to learn about LinkedLists from scratch [here is a good article](https://medium.com/@prabhash.code/java-collections-under-the-hood-linkedlist-e01-8444a0bb4544) which explain the implementation of the `java.util.LinkedList`.

1. We are using the recursion, and it will take `O(n)` time.
2. We checked if the `head` is null as base case for the recursive function.
3. If not we are calling the function itself and passing the `next` node.
4. When running, once the recursive function meets the base case it'll return nothing, and after that our print line 
will be triggered. Basically, the first time println will be triggered on the last node of the LinkedList.


</details>

[//]: # (adding additional margin from bottom)
<br>
<br>
<br>
<br>

