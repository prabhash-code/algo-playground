## Question 🤔
Given the `head` of a singly linked list and two integers `left` and `right` where `left <= right`, 
reverse the nodes of the list from position `left` to position `right`, and return the reversed list.

*`left` and `right` indexes are starting from `1` not `0`.

#### Example
> head = [1,2,3,4,5], left = 2, right = 4

#### Return
> [1,4,3,2,5]

## Solution 🙋
<details>
  <summary>Click here to expand the solution</summary>

Here we need to consider 4 positions,
<br>`m-1` -> 1, `m` -> 2,   `n` -> 4,   `n+1` ->5

**Steps to reverse a LinkedList**
1. get current Node
2. Store next value
3. Update next value to list so far
4. Store current Node as lsi so far
5. Update current Node to stored next value at step 2


</details>

[//]: # (adding additional margin from bottom)
<br>
<br>
<br>
<br>

