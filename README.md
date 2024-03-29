<h1 align="center">Algo Playground</h1>

<h4 align="center">A place to find and imagine solutions for all your algorithmic problems</h4>

<div align="center">

![LeetCode](https://img.shields.io/badge/-LeetCode-FFA116.svg?style=Flat-square&logo=LeetCode&logoColor=white)
![HackerRank](https://img.shields.io/badge/-Hackerrank-2EC866?style=Flat-square&logo=HackerRank&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=Flat-square&logo=java&color=red)
![PR](https://img.shields.io/static/v1?label=Made%20with%20%F0%9F%A4%8D%20by&message=develpoers&color=blue&style=Flat-square)
![Solution Count](https://img.shields.io/badge/Total%20Solutions-35-blueviolet.svg)

[comment]: <> (PR welcome badge - https://img.shields.io/static/v1?label=PRs&message=Welcome&color=ff69b4&style=Flat-square)

</div>

## Content

- [How to Use](#how-to-use)
- [Basic steps to solve a problem](#basic-steps-to-solve-a-problem)
- [Data Structures](#data-structures)
    - [Arrays](#arrays)
    - [Linked Lists](#linked-lists)
    - [Stacks & Queues](#stacks-&-queues)
- [Algorithms](#algorithms)
    - [Sorting](#sorting)
    - [Searching](#searching)
- [Contribute](#contribute)

## How to Use

- Folders are based on the category of the DSA.( Currently, have ***Data Structures*** folder only. )
    - Each category has three subcategories called `Easy`, `Medium` and `Hard` based on the difficulty level.
    - Every leaf folder has `Solution.java` and `README.md` file.
        - `README.md` file describes the question and the solution process.
        - `Solution.java` file contains the code.
- There is the ***src*** folder which you can use for test the code.

## Basic steps to solve a problem

#### Step 01: Verify the constraints
    First, identify the constraints/boundaries for the problem. This is good to find out the edge cases.
        Example:
           - Are all the numbers positive or can there be negatives?
           - Are there any duplicate numbers in the array?
           - Will there always be a solution available? What do we do/return if there’s no solution?

#### Step 02: Write out some test cases

    Then write down some test inputs that cover the above constraints/boundaries.

#### Step 03: Figure out a solution without code

    Write your solution in a paper or on notepad (not on a IDE)

#### Step 04: Write out a solution in code
    Code your solution in the IDE

#### Step 05: Test the code with test cases
    Important: Always test the code
        - with empty array,
        - array with one value,
        - array with duplicates


[//]: # (##########################################################################################################################################################################################################################################################################################################################################################################################################)
[//]: # (-------------------- SECTION BREAK ------------------)
[//]: # (##########################################################################################################################################################################################################################################################################################################################################################################################################)


## Data Structures

|     Type     | Solutions |
|:------------:|:---------:|
|    Arrays    |    14     |
| Linked Lists |    11     |
|    Stacks    |     3     |
|     Tree     |     1     |

### Arrays

<details>
  <summary>Click here for more details</summary>

|                                                                               Problem                                                                                |                                                                           Web Link                                                                           |                                                                Solution                                                                 |
|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:------------------------------------------------------------------------------------------------------------------------------------------------------------:|:---------------------------------------------------------------------------------------------------------------------------------------:|
|                                      [Array Reverse](Data%20Structures/Arrays/One%20Dimensional/Easy/array%20reverse/README.md)                                      |                          [www.hackerrank.com/arrays-ds](https://www.hackerrank.com/challenges/arrays-ds/problem?isFullScreen=true)                           |                     [Solution.java](Data%20Structures/Arrays/One%20Dimensional/Easy/array%20reverse/Solution.java)                      |
|                                           [Hourglass](Data%20Structures/Arrays/Two%20Dimensional/Easy/hourglass/README.md)                                           |                      [www.hackerrank.com/2d-array-hourglass](https://www.hackerrank.com/challenges/2d-array/problem?isFullScreen=true)                       |                        [Solution.java](Data%20Structures/Arrays/Two%20Dimensional/Easy/hourglass/Solution.java)                         |
|                                      [Dynamic Array](Data%20Structures/Arrays/Two%20Dimensional/Easy/dynamic%20array/README.md)                                      |                      [www.hackerrank.com/dynamic-array](https://www.hackerrank.com/challenges/dynamic-array/problem?isFullScreen=true)                       |                     [Solution.java](Data%20Structures/Arrays/Two%20Dimensional/Easy/dynamic%20array/Solution.java)                      |
|                                      [Left Rotation](Data%20Structures/Arrays/One%20Dimensional/Easy/left%20rotation/README.md)                                      |                [www.hackerrank.com/array-left-rotation](https://www.hackerrank.com/challenges/array-left-rotation/problem?isFullScreen=true)                 |                     [Solution.java](Data%20Structures/Arrays/One%20Dimensional/Easy/left%20rotation/Solution.java)                      |
|                                     [Sparse Arrays](Data%20Structures/Arrays/One%20Dimensional/Medium/sparse%20arrays/README.md)                                     |                      [www.hackerrank.com/sparse-arrays](https://www.hackerrank.com/challenges/sparse-arrays/problem?isFullScreen=true)                       |                    [Solution.java](Data%20Structures/Arrays/One%20Dimensional/Medium/sparse%20arrays/Solution.java)                     |
|                                 [Array Manipulation](Data%20Structures/Arrays/Two%20Dimensional/Hard/array%20manipulation/README.md)                                 |                        [www.hackerrank.com/array-manipulation](https://www.hackerrank.com/challenges/crush/problem?isFullScreen=true)                        |                   [Solution.java](Data%20Structures/Arrays/Two%20Dimensional/Hard/array%20manipulation/Solution.java)                   |
|                                        [Sum of two](Data%20Structures/Arrays/One%20Dimensional/Easy/sum%20of%20two/README.md)                                        |                                             [www.leetcode.com/two-sum/](https://leetcode.com/problems/two-sum/)                                              |                      [Solution.java](Data%20Structures/Arrays/One%20Dimensional/Easy/sum%20of%20two/Solution.java)                      |
|                  [Sum of two contiguous integers](Data%20Structures/Arrays/One%20Dimensional/Easy/sum%20of%20two%20contiguous%20integers/README.md)                  |                                                                              -                                                                               |          [Solution.java](Data%20Structures/Arrays/One%20Dimensional/Easy/sum%20of%20two%20contiguous%20integers/Solution.java)          |
|                       [Container with most water](Data%20Structures/Arrays/One%20Dimensional/Medium/container%20with%20most%20water/README.md)                       |                            [www.leetcode.com/container-with-most-water](https://leetcode.com/problems/container-with-most-water/)                            |            [Solution.java](Data%20Structures/Arrays/One%20Dimensional/Medium/container%20with%20most%20water/Solution.java)             |
|                               [Trapping rain water](Data%20Structures/Arrays/One%20Dimensional/Hard/trapping%20rain%20water/README.md)                               |                                  [www.leetcode.com/trapping-rain-water](https://leetcode.com/problems/trapping-rain-water/)                                  |                 [Solution.java](Data%20Structures/Arrays/One%20Dimensional/Hard/trapping%20rain%20water/Solution.java)                  |
|                                  [Typed out string](Data%20Structures/Arrays/One%20Dimensional/Easy/typed%20out%20string/README.md)                                  |                           [www.leetcode.com/typed-out-string](https://leetcode.com/problems/backspace-string-compare/description/)                           |                   [Solution.java](Data%20Structures/Arrays/One%20Dimensional/Easy/typed%20out%20string/Solution.java)                   |
| [Longest substring without repeating characters](Data%20Structures/Arrays/One%20Dimensional/Medium/longest%20substring%20without%20repeating%20characters/README.md) | [www.leetcode.com/longest-substring-without-repeating-characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/description/) | [Solution.java](Data%20Structures/Arrays/One%20Dimensional/Medium/longest%20substring%20without%20repeating%20characters/Solution.java) |
|                                   [Valid palindrome](Data%20Structures/Arrays/One%20Dimensional/Easy/valid%20palindrome/README.md)                                   |                                     [www.leetcode.com/valid-palindrome](https://leetcode.com/problems/valid-palindrome/)                                     |                    [Solution.java](Data%20Structures/Arrays/One%20Dimensional/Easy/valid%20palindrome/Solution.java)                    |
|                              [Almost a palindrome](Data%20Structures/Arrays/One%20Dimensional/Medium/almost%20a%20palindrome/README.md)                              |                                       [www.leetcode.com/almost-a-palindrome](https://leetcode.com/problems/valid-palindrome-ii/)                             |                  [Solution.java](Data%20Structures/Arrays/One%20Dimensional/Medium/almost%20a%20palindrome/Solution.java)               |

*Some String based questions are also added to the `Arrays` category
</details>

### Linked Lists

<details>
  <summary>Click here for more details</summary>

|                                                                             Problem                                                                              |                                                                                             Web Link                                                                                              |                                                           Solution                                                           |
|:----------------------------------------------------------------------------------------------------------------------------------------------------------------:|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:----------------------------------------------------------------------------------------------------------------------------:|
|                             [Print Elements in Linked List](Data%20Structures/Linked%20Lists/Singly/Easy/print%20elements/README.md)                             |                   [www.hackerrank.com/print-the-elements-of-a-linked-list](https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem?isFullScreen=true)                   |                 [Solution.java](Data%20Structures/Linked%20Lists/Singly/Easy/print%20elements/Solution.java)                 |
|             [Insert a Node at the Tail of a Linked List](Data%20Structures/Linked%20Lists/Singly/Easy/insert%20a%20node%20at%20the%20tail/README.md)             |            [www.hackerrank.com/insert-a-node-at-the-tail-of-a-linked-list](https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem?isFullScreen=true)            |       [Solution.java](Data%20Structures/Linked%20Lists/Singly/Easy/insert%20a%20node%20at%20the%20tail/Solution.java)        |
|             [Insert a Node at the Head of a Linked List](Data%20Structures/Linked%20Lists/Singly/Easy/insert%20a%20node%20at%20the%20head/README.md)             |            [www.hackerrank.com/insert-a-node-at-the-head-of-a-linked-list](https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem?isFullScreen=true)            |       [Solution.java](Data%20Structures/Linked%20Lists/Singly/Easy/insert%20a%20node%20at%20the%20head/Solution.java)        |
| [Insert a node at a specific position in a Linked List](Data%20Structures/Linked%20Lists/Singly/Easy/insert%20a%20node%20at%20a%20specific%20position/README.md) | [www.hackerrank.com/insert-a-node-at-a-specific-position-in-a-linked-list](https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem?isFullScreen=true) | [Solution.java](Data%20Structures/Linked%20Lists/Singly/Easy/insert%20a%20node%20at%20a%20specific%20position/Solution.java) |
|                                    [Delete a Node](Data%20Structures/Linked%20Lists/Singly/Easy/delete%20a%20node/README.md)                                     |                      [www.hackerrank.com/delete-a-node-from-a-linked-list](https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem?isFullScreen=true)                      |                [Solution.java](Data%20Structures/Linked%20Lists/Singly/Easy/delete%20a%20node/Solution.java)                 |
|                                 [Print in Reverse](Data%20Structures/Linked%20Lists/Singly/Easy/print%20in%20reverse/README.md)                                  |                 [www.hackerrank.com/print-linked-list-in-reverse](https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse/problem?isFullScreen=true)                 |               [Solution.java](Data%20Structures/Linked%20Lists/Singly/Easy/print%20in%20reverse/Solution.java)               |
|                                     [Reverse a linked list](Data%20Structures/Linked%20Lists/Singly/Easy/reverse/README.md)                                      |                                 [www.hackerrank.com/reverse-a-linked-list](https://www.hackerrank.com/challenges/reverse-a-linked-list/problem?isFullScreen=true)                                 |                     [Solution.java](Data%20Structures/Linked%20Lists/Singly/Easy/reverse/Solution.java)                      |
|                                    [Compare two linked lists](Data%20Structures/Linked%20Lists/Singly/Easy/compare/README.md)                                    |                              [www.hackerrank.com/compare-two-linked-lists](https://www.hackerrank.com/challenges/compare-two-linked-lists/problem?isFullScreen=true)                              |                     [Solution.java](Data%20Structures/Linked%20Lists/Singly/Easy/compare/Solution.java)                      |
|                              [Reverse a linked list n to m](Data%20Structures/Linked%20Lists/Singly/Hard/reverse-n-to-m/README.md)                               |                                                 [www.leetcode.com/reverse-linked-list-ii](https://leetcode.com/problems/reverse-linked-list-ii/)                                                  |                  [Solution.java](Data%20Structures/Linked%20Lists/Singly/Hard/reverse-n-to-m/Solution.java)                  |
|           [Flatten a Multilevel Doubly Linked List](Data%20Structures/Linked%20Lists/Doubly/Medium/flatten-a-multilevel-doubly-linked-list/README.md)            |                                [www.leetcode.com/flatten-a-multilevel-doubly-linked-list](https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/)                                 |    [Solution.java](Data%20Structures/Linked%20Lists/Doubly/Medium/flatten-a-multilevel-doubly-linked-list/Solution.java)     |
|                                    [Linked List Cycle](Data%20Structures/Linked%20Lists/Singly/Easy/linked-list-cycle/README.md)                                 |                                                             [www.leetcode.com/linked-list-cycle](https://leetcode.com/problems/linked-list-cycle/)                                                |                 [Solution.java](Data%20Structures/Linked%20Lists/Singly/Easy/linked-list-cycle/Solution.java)                |

</details>

### Stacks & Queues

<details>
  <summary>Click here for more details</summary>

|                                                            Problem                                                             |                                                               Web Link                                                               |                                                Solution                                                 |
|:------------------------------------------------------------------------------------------------------------------------------:|:------------------------------------------------------------------------------------------------------------------------------------:|:-------------------------------------------------------------------------------------------------------:|
|                         [Valid Parentheses](Data%20Structures/Stacks/Easy/valid-parentheses/README.md)                         |                        [www.leetcode.com/valid-parentheses](https://leetcode.com/problems/valid-parentheses/)                        |             [Solution.java](Data%20Structures/Stacks/Easy/valid-parentheses/Solution.java)              |
| [Minimum Remove to Make Valid Parentheses](Data%20Structures/Stacks/Medium/minimum-remove-to-make-valid-parentheses/README.md) | [www.leetcode.com/minimum-remove-to-make-valid-parentheses](https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/) | [Solution.java](Data%20Structures/Stacks/Medium/minimum-remove-to-make-valid-parentheses/Solution.java) |
|              [Implement Queue using Stacks](Data%20Structures/Stacks/Easy/implement-queue-using-stacks/README.md)              |             [www.leetcode.com/implement-queue-using-stacks](https://leetcode.com/problems/implement-queue-using-stacks/)             |        [Solution.java](Data%20Structures/Stacks/Easy/implement-queue-using-stacks/Solution.java)        |

</details>

### Tree

<details>
  <summary>Click here for more details</summary>

|                                                     Problem                                                     | Web Link |                                                    Solution                                                    |
|:---------------------------------------------------------------------------------------------------------------:|:--------:|:--------------------------------------------------------------------------------------------------------------:|
|  [Binary Search Tree](Data%20Structures/Tree/Binary-Search-Tree/Appendices/binary-search-tree-intro/README.md)  |    -     |  [Solution.java](Data%20Structures/Tree/Binary-Search-Tree/Appendices/binary-search-tree-intro/Solution.java)  |

</details>


[//]: # (##########################################################################################################################################################################################################################################################################################################################################################################################################)
[//]: # (-------------------- SECTION BREAK ------------------)
[//]: # (##########################################################################################################################################################################################################################################################################################################################################################################################################)


## Algorithms

|   Type    | Solutions |
|:---------:|:---------:|
|  Sorting  |     4     |
| Searching |     1     |
|   Other   |     1     |

### Other

<details>
  <summary>Click here for more details</summary>

|                                 Problem                                 |                                Web Link                                |                               Solution                                |
|:-----------------------------------------------------------------------:|:----------------------------------------------------------------------:|:---------------------------------------------------------------------:|
| [Least Recently Used](Algorithms/Algorithms/Other/Medium/LRU/README.md) | [www.leetcode.com/lru-cache](https://leetcode.com/problems/lru-cache/) | [Solution.java](Algorithms/Algorithms/Other/Medium/LRU/Solution.java) |

</details>

### Sorting

<details>
  <summary>Click here for more details</summary>

|                                              Problem                                               |                                                       Web Link                                                        |                                      Solution                                       |
|:--------------------------------------------------------------------------------------------------:|:---------------------------------------------------------------------------------------------------------------------:|:-----------------------------------------------------------------------------------:|
|  [Kth Largest Element in an Array](Algorithms/Sorting/kth-largest-element-in-an-array/README.md)   |  [www.leetcode.com/kth-largest-element-in-an-array](https://leetcode.com/problems/kth-largest-element-in-an-array/)   |  [Solution.java](Algorithms/Sorting/kth-largest-element-in-an-array/Solution.java)  |


#### Appendices
|                                 Problem                                  |                                                    Web Link                                                     |                                  Solution                                   |
|:------------------------------------------------------------------------:|:---------------------------------------------------------------------------------------------------------------:|:---------------------------------------------------------------------------:|
|     [Quick Sort](Algorithms/Sorting/Appendices/quick-sort/README.md)     | [www.leetcode.com/quicksort-java](https://leetcode.com/problems/sort-an-array/solutions/281685/quicksort-java/) |   [Solution.java](Algorithms/Sorting/Appendices/quick-sort/Solution.java)   |
|    [Bubble Sort](Algorithms/Sorting/Appendices/bubble-sort/README.md)    |                 [www.leetcode.com/bubblesort-java](https://leetcode.com/problems/sort-colors/)                  |  [Solution.java](Algorithms/Sorting/Appendices/bubble-sort/Solution.java)   |
| [Selection Sort](Algorithms/Sorting/Appendices/selection-sort/README.md) |                 [www.leetcode.com/bubblesort-java](https://leetcode.com/problems/sort-colors/)                  | [Solution.java](Algorithms/Sorting/Appendices/selection-sort/Solution.java) |
| [Insertion Sort](Algorithms/Sorting/Appendices/insertion-sort/README.md) |                 [www.leetcode.com/bubblesort-java](https://leetcode.com/problems/sort-colors/)                  | [Solution.java](Algorithms/Sorting/Appendices/insertion-sort/Solution.java) |

</details>

### Searching

<details>
  <summary>Click here for more details</summary>

|                                                                      Problem                                                                       |                                                                              Web Link                                                                              |                                                  Solution                                                   |
|:--------------------------------------------------------------------------------------------------------------------------------------------------:|:------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:-----------------------------------------------------------------------------------------------------------:|
| [Find First and Last Position of Element in Sorted Array](Algorithms/Searching/find-first-and-last-position-of-element-in-sorted-array/README.md)  | [www.leetcode.com/find-first-and-last-position-of-element-in-sorted-array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) | [Solution.java](Algorithms/Searching/find-first-and-last-position-of-element-in-sorted-array/Solution.java) |


#### Appendices
|                                 Problem                                  |                                      Web Link                                      |                                   Solution                                   |
|:------------------------------------------------------------------------:|:----------------------------------------------------------------------------------:|:----------------------------------------------------------------------------:|
| [Binary Search](Algorithms/Searching/Appendices/binary-search/README.md) |   [www.leetcode.com/binary-search](https://leetcode.com/problems/binary-search/)   | [Solution.java](Algorithms/Searching/Appendices/binary-search/Solution.java) |


</details>


[//]: # (##########################################################################################################################################################################################################################################################################################################################################################################################################)
[//]: # (-------------------- SECTION BREAK ------------------)
[//]: # (##########################################################################################################################################################################################################################################################################################################################################################################################################)


## Contribute

Contributions are always welcome! Please read the [contribution guidelines](contributing.md) first.

[//]: # (adding additional margin from bottom)
<br>
<br>
<br>
<br>