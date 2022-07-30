## Question 🤔
This is a simple "do as you are told" thing, with a direct straightforward implementation and no algorithmic cleverness needed.
The way they have described the question is pretty awkward in the HackerRank and you may confuse. I'll describe it in an easy manner.

You are given a 2-dimensional Integer array `queries` and `n` which is the size of the array.
The inner array of `queries` contains 3 items `query type`, `x` and `y` respectively. You just need to guide the below instructions.

- Declare a 2-dimensional array, `arr`, of `n` empty arrays. All arrays are zero indexed.
- Declare an integer, `lastAnswer`, and initialize it to `0`.
- The inner array of `queries` contains 3 items `query type`, `x` and `y` respectively. Based on the `query type`, you need to execute these:
  - Query: 1 x y
    - Let `idx = ((x ^ lastAnswer) % n)`.
    - Append the integer `y` to `arr[idx]`.
  - Query: 2 x y
    - Let `idx = ((x ^ lastAnswer) % n)`.
    - Assign the value `arr[idx][y % size(arr[idx])]` to `lastAnswer`.
    - Store the new value of `lastAnswer` to an answers array.

## Solution 🙋
<details>
  <summary>Click here to expand the solution</summary>

1. There is no need a detailed description since all the instructions and logic already given by the questions itself. We just need to copy-paste kind of thing to do.
</details>
