## Question 🤔
Given a string `s`, find the length of the longest
`substring` without repeating characters.
Example<br>
>***s = "abcabcbb"***

Return<br>
The answer is `abc`, with the length of `3`.
>***3***

## Solution 🙋
<details>
  <summary>Click here to expand the solution</summary>

* First one will be the brute force solution where we are loop through each possible substring and 
keep looking the duplicate values using a `set`. It'll take `O(n^2)` time and `O(n)` space 
complexities.
* Second one also another brute force solution, and It's also take `O(n^2)` time and `O(n)` space 
complexities.
* Third one is more optimized solution which uses the *Sliding Window* technic. It just takes `O(n)` time and space
  complexities.

> **Sliding Window**: Form a window over some ***portion*** of ***sequential*** data, then move that window
> throughout the data to capture different part of it.

</details>

[//]: # (adding additional margin from bottom)
<br>
<br>
<br>
<br>

