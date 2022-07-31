## Question 🤔
There is a collection of input strings and a collection of query strings. For each query string, determine how many times it occurs in the list of input strings. Return an array of the results.

Example<br>
>***strings = ['ab', 'ab', 'abc']***
>***queries = ['ab', 'abc', 'bc']***

Return<br>
There are 2 instances of `ab`, 1 of `abc` and 0 of `bc`.
>***[2,1,0]***

## Solution 🙋
<details>
  <summary>Click here to expand the solution</summary>

> We can use the commented brute force way. But it will take O(n^2). There is a better solution that executes in O(n) time. (Tip: It uses HashMap which takes constant time for `get` and `put` operations.)

1. First, we create a `HashMap` to hold our `string` counts and an `ArrayList` for the final output.
2. Then we loop through in `strings` and get the count for each `string`.
   1. If the hashmap already contains the key we increase the count for it.
   2. Otherwise, put it as a new key.
3. Now we know how many times each `string` appear in the `strings` array.
4. Finally, we need to check if the `queries` contains any additional keys/strings and form the final output.
   1. Check if the hashmap already contains the `query/key` if not that `query` does not appear in the `strings`.
</details>

