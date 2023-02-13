## Quick Sort 🤔
Quick Sort is a `divide-and-conquer` sorting algorithm. It works by selecting a `pivot element` from the array and 
partitioning the other elements into two sub-arrays, according to whether they are less than or greater than 
the pivot. The sub-arrays are then sorted recursively. This process continues until the base case is reached, 
which is an array with fewer than two elements. The final result is a sorted array.

* **Time Complexity**: `O(n log n)` on average and `O(n^2)` in the worst case.
* **Space Complexity**: `O(log n)` in the best, average and worst case scenarios.

Few links to learn more 
* [YouTube video](https://www.youtube.com/watch?v=h8eyY7dIiN4)
* [Article on Programiz](https://www.programiz.com/dsa/quick-sort)

### Choosing the `pivot` element
There are several ways to choose the pivot element in Quick Sort:

* **First Element**: Choose the first element of the array as the pivot. This is the simplest method, but it can 
lead to worst-case performance if the array is already sorted or nearly sorted.

* **Last Element**: Choose the last element of the array as the pivot. This method performs better than the first 
element method when the array is already sorted or nearly sorted.

* **Middle Element**: Choose the middle element of the array as the pivot. This method is more efficient than the 
first two methods and provides better overall performance.

* **Random Element**: Choose a random element from the array as the pivot. This method provides an average case 
performance and helps avoid worst-case scenarios.

* **Median Element**: Choose the median element of the array as the pivot. This method provides the best performance 
for cases where the array is not already sorted or nearly sorted. However, it is more computationally expensive 
than other methods as it requires finding the median.

### Quick Sort Algorithm 🙋

<img src="img_1.PNG" alt="Quick Sort Algorithm" width="500"/>
<br/>
<br/>
<img src="img.PNG" alt="Quick Sort Algorithm" width="800"/>


[//]: # (adding additional margin from bottom)
<br>
<br>
<br>
<br>

