## Question 🤔

Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each the array element between two given indices, inclusive. Once all operations have been performed, return the maximum value in the array.

Example:<br>
***n = 10***<br>
***queries = [[1, 5, 3],[4, 8, 7],[6, 9, 1]]***

Queries are interpreted as follows:
> a b k<br>
> 1 5 3<br>
> 4 8 7<br>
> 6 9 1<br>

Add the values of `k` between the indices `a` and `b` inclusive:

|     Index     |   1 |   2 |   3 |   4 |   5 |   6 |   7 |   8 |   9 | 10 |
|:-------------:|----:|----:|----:|----:|----:|----:|----:|----:|----:|---:|
| Initial value |    0  |   0 |   0 |   0 |   0 |   0 |   0 |   0 |   0 |  0 |
|   Step one    |       3       |   3 |   3 |   3 |   3 |   0 |   0 |   0 |   0 |  0 |
|   Step two    |       3       |   3 |   3 |  10 |  10 |   7 |   7 |   7 |   0 |  0 |
|  Step three   |       3       |   3 |   3 |  10 |  10 |   8 |   8 |   8 |   1 |  0 |

The largest value is `10` after all operations are performed.


## Solution 🙋
<details>
  <summary>Click here to expand the solution</summary>

#### Brute force solution
1. ...
</details>
