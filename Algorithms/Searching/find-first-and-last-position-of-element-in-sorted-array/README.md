## Question 🤔
Given an array of integers `nums` sorted in non-decreasing order, find the starting and ending position of a 
given `target` value.

If `target` is not found in the array, return `[-1, -1]`.

You must write an algorithm with `O(log n)` runtime complexity.

Example<br>
> Input: nums = [5,7,7,8,8,10], target = 8 <br>
> Output: [3,4]

## Solution 🙋
<details>
  <summary>Click here to expand the solution</summary>

When the question specifying the terms `sorted array` and `O(log n) time complexity`, obviously we know that we need the 
[Binary Search](../Appendices/binary-search/README.md) to solve this problem. Here is the thought process:

1. First we find a one of index of the `target`.
2. Then we continuously search on the `left` and `right` side of that `targetIdx` using binary search again and again.
<br>
<br>

### Another approach
Instead of the above `2nd` step we can iterate to `left` and `right` from `targetIdx` rather than binary search. 
But it is leaner search and can be end up with `O(n)` time complexity. For an example consider the following array,

>  Input: nums = [4,4,4,4,4,4], target = 4 <br>

1. We can find the `targetIdx = 2` using the binary search.
2. Then we can go to `left` and `right` from the `targetIdx` and ultimately we have to go through the entire array. It 
   will cost `O(n)` time. So using binary search for the `2nd` step will be the best solution.


</details>

[//]: # (adding additional margin from bottom)
<br>
<br>
<br>
<br>

