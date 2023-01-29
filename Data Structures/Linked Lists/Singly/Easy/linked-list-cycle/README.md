## Question 🤔
Given `head`, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached 
again by continuously following the `next` pointer. Internally, `pos` is used to denote the 
index of the node that tail's `next` pointer is connected to. **Note that `pos` is not passed 
as a parameter**.

Return `true` if there is a cycle in the linked list. Otherwise, return `false`.

Example<br>
<img src="img.PNG" alt="Container with most water" width="500"/>

> **Input**: head = [3,2,0,-4], pos = 1

> **Output**: true

> **Explanation**: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

## Solution 🙋
<details>
  <summary>Click here to expand the solution</summary>

01. This is straight forward solution. We are maintaining a `Set` that contains seen nodes and then keep checking 
against the current node in each iteration.

</details>

[//]: # (adding additional margin from bottom)
<br>
<br>
<br>
<br>

