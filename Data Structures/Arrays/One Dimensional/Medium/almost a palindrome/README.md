## Question 🤔
A phrase is a ***palindrome*** if, after converting all uppercase letters into lowercase letters
and removing all non-alphanumeric characters, it reads the same forward and backward.
Alphanumeric characters include letters and numbers.

Given a string `s`, return `true` if the `s` can be palindrome after deleting ***at most one*** character from it.

Example<br>
>***s = "abca"***

Return<br>
You could delete the character 'b' or 'c'. Hence we are return,
>***true***

## Solution 🙋
<details>
  <summary>Click here to expand the solution</summary>

We can solve palindrome questions using two pointers. We are matching the left and 
right characters and if they are matching it is a palindrome. But here we need an additional logic.

Idea behind this logic is when we come to the point that `left` and `right` characters aren't matching we call 
a function by,
* first removing the `left` indexed character
* secondly removing the `right` indexed character

Because we are allowed to remove only one character and we can remove it either front or back. Then check the 
string with the updated `left` and `right` pointers to check the palindrome. 

</details>

[//]: # (adding additional margin from bottom)
<br>
<br>
<br>
<br>

