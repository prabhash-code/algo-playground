## Insertion Sort 🤔
Insertion sort **places an unsorted element at its suitable place** in each iteration.

Insertion sort works similarly as we sort cards in our hand in a card game.

We assume that the first card is already sorted then, we select an unsorted card. If the unsorted card is greater 
than the card in hand, it is placed on the right otherwise, to the left. In the same way, other unsorted cards 
are taken and put in their right place.

* **Time Complexity**: `O(n)` on best case and `O(n^2)` in the average and worst cases.
* **Space Complexity**: `O(1)` in the best, average and worst case scenarios.

Few links to learn more
* [**Youtube Video**](https://www.youtube.com/watch?v=0lOnnd50cGI)
* [**Article on Programiz**](https://www.programiz.com/dsa/insertion-sort)

### Working of Insertion Sort
1. The first element in the array is assumed to be sorted. Take the second element and store it separately in `key`. 
Compare `key` with the first element. If the first element is greater than `key`, then `key` is placed in front of 
the first element.
2. Now, the first two elements are sorted. Take the third element and compare it with the elements on the left of it. 
Placed it just behind the element smaller than it. If there is no element smaller than it, then place it at the 
beginning of the array.
3. Similarly, place every unsorted element at its correct position

<img src="https://upload.wikimedia.org/wikipedia/commons/0/0f/Insertion-sort-example-300px.gif" alt="Quick Sort Algorithm" width="300"/>

### Insertion Sort Algorithm 🙋
```java
insertionSort(array)
  mark first element as sorted
  for each unsorted element X
    'extract' the element X
    for j <- lastSortedIndex down to 0
      if current element j > X
        move sorted element to the right by 1
    break loop and insert X here
end insertionSort
```



[//]: # (adding additional margin from bottom)
<br>
<br>
<br>
<br>

