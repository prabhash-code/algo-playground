## Question 🤔
Given the pointer to the head node of a linked list, change the next pointers of the nodes so that their order is 
reversed. The head pointer given may be null meaning that the initial list is empty.

Example<br>
`head*` refers to the linked list with `data` values:<br>
`1 -> 2 -> 3 -> NULL`

Manipulate the `next` pointers of each node in place and return `head`, now referencing the head of the list:<br>
`3 -> 2 -> 1 -> NULL`

## Solution 🙋
<details>
  <summary>Click here to expand the solution</summary>

1. As guide in the question we need to change the `next` pointers of the node. So we maintain the 3 pointers for 
`current`, `previous` and `next` nodes.
2. Then we are changing the pointers of the nodes until the `current` node is empty. 
Here is the illustration of how the variables are assigns after each loop for above example.

|   variable   | initial | #1  |  #2  |  #3  |
|:------------:|:-------:|:---:|:----:|:----:|
|     next     |  null   |  2  |  3   | null |
| current.next |    2    |  3  | null | null |
|   previous   |  null   |  1  |  2   |  3   |
|   current    |    1    |  2  |  3   | null |
3. We can see finally the `previous` provide what we are need i.e. reversed LinkedList.

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

