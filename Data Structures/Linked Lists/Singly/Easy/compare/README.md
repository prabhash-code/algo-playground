## Question 🤔
You’re given the pointer to the head nodes of two linked lists. Compare the data in the nodes of the linked lists to 
check if they are equal. If all data attributes are equal and the lists are the same length, return 1. Otherwise, return 0.

Example<br>
`list1 = 1 -> 2 -> 3 -> NULL`<br>
`list2 = 1 -> 2 -> 3 -> 4 -> NULL`

The two lists have equal data attributes for the first 3 nodes. `list2` is longer, though, so the lists are not equal.<br> 
Return `0`.

## Solution 🙋
<details>
  <summary>Click here to expand the solution</summary>

> ***NOTE***: Anyone curious to learn about LinkedLists from scratch [here is a good article](https://medium.com/@prabhash.code/java-collections-under-the-hood-linkedlist-e01-8444a0bb4544) which explain the implementation of the `java.util.LinkedList`.

1. We are go through in two lists simultaneously while the one of `head` is not null and both data is equal.
2. If one of `node` is null means the lists aren't equal that's what we are checking in the return statement.

</details>

[//]: # (adding additional margin from bottom)
<br>
<br>
<br>
<br>

