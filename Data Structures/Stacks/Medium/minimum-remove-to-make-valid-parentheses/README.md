## Question 🤔
Given a string `s` of `'('` , `')'` and `lowercase English characters`.

Your task is to remove the minimum number of parentheses ( `'('` or `')'`, in any 
positions ) so that the resulting parentheses string is valid and return **any** valid string.

Formally, a parentheses string is valid if and only if:

It is the empty string, contains only lowercase characters, or
It can be written as `AB` (`A` concatenated with `B`), where `A` and `B` are valid strings, or
It can be written as `(A)`, where `A` is a valid string.

Example<br>

> **Input**: s = "lee(t(c)o)de)"<br>
> **Output**: "lee(t(c)o)de"<br>
> **Explanation**: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.

## Solution 🙋
<details>
  <summary>Click here to expand the solution</summary>

1. First we are convert String to `char` array.
2. We are iterating from beginning of the array.
3. Then we're maintaining a stack with indexes of character positions. here we are keeping only `'('` positions.
   We know that if we found an open bracket(`'('`) first it should be close. Hence, we are removing all the `'('`
   positions from the stack once we found a closing bracket(`')'`).
4. But if are first found a closing bracket(`')'`) we can directly remove it from the array without keep track in the stack.
5. After iterating over the array we have final indexes of brackets positions that need to remove.

***Here we did a trick that using `'-'` to identify the removing characters. Since Java does not support to store empty
char`''` in a char variable. Then we replace all `'-'` characters with empty space in the return statement.***

</details>

[//]: # (adding additional margin from bottom)
<br>
<br>
<br>
<br>

