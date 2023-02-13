## Selection Sort 🤔
Selection sort is a sorting algorithm that **selects the smallest element** from an unsorted list in each iteration 
and places that element at the beginning of the unsorted list.


### Selection Sort Algorithm 🙋
```java
selectionSort(array, size)
    repeat (size - 1) times
    set the first unsorted element as the minimum
    for each of the unsorted elements
        if element < currentMinimum
            set element as new minimum
    swap minimum with first unsorted position
end selectionSort
```

### Working of Selection Sort
1. Set the first element as `minimum`.
2. Compare `minimum` with the second element. If the second element is smaller than `minimum`, assign the second 
element as `minimum`. Compare `minimum` with the third element. Again, if the third element is smaller, then 
assign `minimum` to the third element otherwise do nothing. The process goes on until the last element.
3. After each iteration, `minimum` is placed in the front of the unsorted list.
4. For each iteration, indexing starts from the first unsorted element. Step `1` to `3` are repeated until all 
the elements are placed at their correct positions.

* **Time Complexity**: `O(n^2)` on the best, average and worst case scenarios.
* **Space Complexity**: `O(1)` on the best, average and worst case scenarios.

<img src="img.PNG" alt="Quick Sort Algorithm" width="800"/>


[//]: # (adding additional margin from bottom)
<br>
<br>
<br>
<br>

