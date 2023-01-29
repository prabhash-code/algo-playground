## Question 🤔
Implement a first in first out (FIFO) queue using only stack. The implemented queue should support all the 
functions of a normal queue (`push`, `peek`, `pop`, and `empty`).

Implement the `MyQueue` class:
* `void push(int x)` Pushes element x to the back of the queue.
* `int pop()` Removes the element from the front of the queue and returns it.
* `int peek()` Returns the element at the front of the queue.
* `boolean empty()` Returns `true` if the queue is empty, `false` otherwise.


**Notes:**
* You must use only standard operations of a stack, which means only `push to top`, `peek/pop from top`, `size`, 
  and `is empty` operations are valid.
* Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or 
  deque (double-ended queue) as long as you use only a stack's standard operations.

## Solution 🙋
<details>
  <summary>Click here to expand the solution</summary>

The implementation uses two stacks, `stack1` and `stack2`.

* `stack1` is used as an intermediate buffer for all the incoming elements.
* `stack2` is used to store the elements in the order they need to be popped.
* When a new element is pushed onto the queue, it is simply pushed onto `stack1`.
* When an element needs to be popped from the front of the queue, we check if `stack2` is empty. If it is, 
  we transfer all the elements from `stack1` to `stack2`, so that the elements are in the correct order for 
  popping. Finally, we pop the top element from `stack2`.
* To get the front element, we follow the same process of transferring elements from `stack1` to `stack2` if `stack2` 
  is empty, and then return the top element from `stack2`.
* This way, all the elements are stored in `stack1` in the order they were added, and when we want to pop 
  them, we transfer them to `stack2` so that they are in the correct order for popping.

</details>

[//]: # (adding additional margin from bottom)
<br>
<br>
<br>
<br>

