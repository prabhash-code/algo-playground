## Question 🤔
A phrase is a ***palindrome*** if, after converting all uppercase letters into lowercase letters
and removing all non-alphanumeric characters, it reads the same forward and backward.
Alphanumeric characters include letters and numbers.

Given a string `s`, return `true` if it is a ***palindrome***, or `false` otherwise.

Example<br>
>***s = "A man, a plan, a canal: Panama"***

Return<br>
Explanation: "amanaplanacanalpanama" is a palindrome. Hence we are return,
>***true***

## Solution 🙋
<details>
  <summary>Click here to expand the solution</summary>

This is an easy question and we can solve this by using two pointers. We are matching the left and 
right characters and if they are matching it is a palindrome.

*There is another two ways to check a palindrome (But we didn't show those algorithms)
1. Using two pointers as above but we are matching characters from middle to left/right. (Instead of left/right to middle)
2. Reverse the string first, and then match the two strings.
</details>

[//]: # (adding additional margin from bottom)
<br>
<br>
<br>
<br>

