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
`QuickSelect` algorithm is a selection algorithm to find the `k-th smallest element` in an unordered list or array in 
linear time on average. It works by using the same partitioning idea as the `QuickSort` algorithm, but instead of 
recursively sorting the whole array, it only continues sorting the part of the array that could contain the k-th 
the smallest element.

As per our example above we know that 2nd largest element (when regarding from tail of the array to start) also 
become the 5th smallest (when regarding from starting point of the array to tail) element.

This `QuickSelect` Algorithm only takes `O(n)` time complexity and `O(1)` space complexity.

</details>

[//]: # (adding additional margin from bottom)
<br>
<br>
<br>
<br>

