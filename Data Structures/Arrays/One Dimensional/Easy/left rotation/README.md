## Question 🤔
A left rotation operation on an array of size `n` shifts each of the array's elements 1 unit to the left. Given an integer, `d`, rotate the array that many steps left and return the result.

Example<br>
>***d = 2***
>***arr = [1,2,3,4,5]***

Return<br>
>***[3,4,5,1,2]***

## Solution 🙋
<details>
  <summary>Click here to expand the solution</summary>

1. If the rotate steps are equals to the array's size we don't need an explicit rotation and return the same array.
2. If not, then we are split the array and swap that two part.
   1. If the steps are less than the array's size first we get the right part of the array.(As per example `right = [3,4,5]`)
   2. Then we can append the left part to it.(As per example `left = [1,2]`)
3. If both above are not the cases we get the remainder/modular and do the above swapping.(Let's say need to 7 steps rotation, that means we actually need 2 rotations since after 5 rotations elements are placed in the original locations)
</details>

