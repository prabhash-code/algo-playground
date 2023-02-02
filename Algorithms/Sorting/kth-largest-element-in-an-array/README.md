## Question 🤔
Given an integer array `nums` and an integer `k`, return the 2nd `kth` largest element in the array.

Note that it is the `kth` largest element in the sorted order, not the `kth` distinct element.

You must solve it in `O(n)` time complexity.

Example<br>
> Input: nums = [3,2,1,5,6,4], k = 2 <br>
> Output: 5

## Solution 🙋
<details>
  <summary>Click here to expand the solution</summary>

### Solution One - QuickSort
Here we are using the `Quicksort` to sort the array. You can get a basic idea from 
[Appendices](../Appendices/quick-sort/README.md).

**Time Complexity:** This algorithm(`Quicksort`) takes `O(n log n)` time.
* In the `partition` function we compare all the element with `pivot` element, hence it can take `O(n)` time in worst case.
* In the `quickSort` function we call `left` and `right` side arrays recursively, hence it takes `O(log n)` time.
* Then, this algorithm takes `O(n log n)` time.

**Space Complexity:** This algorithm(`Quicksort`) takes `O(log n)` time.
* Space depend on how many recursive calls we have. So, we have `O(log n)` tasks in recursive call.


### Solution Two - QuickSelect
`QuickSelect` Algorithm only takes `O(n)` time complexity and `O(1)` space complexity.

</details>

[//]: # (adding additional margin from bottom)
<br>
<br>
<br>
<br>

