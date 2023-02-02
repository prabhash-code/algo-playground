
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Solution {

  /***
   * QuickSort Algorithm
   * time complexity = O(n log n)
   * space complexity = O(log n)
   */
  public static int findKthLargest(int[] nums, int k) {
    int indexToFind = nums.length-k;
    quickSort(nums, 0, nums.length - 1);

    return nums[indexToFind];
  }

  private static void quickSort(int[] arr, int left, int right) {
    if (left < right) {
      int pivotIdx = partition(arr, left, right);
      quickSort(arr, left, pivotIdx - 1);
      quickSort(arr, pivotIdx + 1, right);
    }
  }

  private static int partition(int[] arr, int left, int right) {

    // choose the rightmost element as pivot
    int pivot = arr[right];

    int partitionIdx = left;

    // iterate until `pivot - 1`. We choose the pivot as rightmost index, hence `j < right` will work.
    // Since we don't need to compare `pivot` with itself, we only compare others with `pivot`
    for (int j = left; j < right; j++) {

      if (arr[j] < pivot) {
        // if element smaller than `pivot` is found
        // swap it with the greater element pointed by `partitionIdx`
        swap(arr, partitionIdx, j);

        // only increase `partitionIdx` when need a swapping operation
        partitionIdx++;
      }
    }

    // swap the pivot element with the greater element specified by `partitionIdx`
    swap(arr, partitionIdx, right);

    // here `partitionIdx` will be the index that `pivot` element now stayed (after swapping)
    return partitionIdx;
  }

  private static void swap(int[] arr, int partitionIdx, int j) {
    int temp = arr[partitionIdx];
    arr[partitionIdx] = arr[j];
    arr[j] = temp;
  }





  /***
   * QuickSelect Algorithm
   * time complexity = O(n)
   * space complexity = O(1)
   */
  public int findKthLargest(int[] nums, int k) {
    // performing quick select will result in finding the k smallest element.
    // As a result, we target the len - k to find the kth largest
    return quick_select(nums,  0, nums.length - 1, nums.length - k);
  }

  private int quick_select(int[] nums, int l, int r, int k_smallest) {
    if(l == r) return nums[r];

    // get smaller partition
    int pivot = new Random().nextInt(r - l) + l;
    pivot = partition(nums, l, r, pivot);

    // three condition
    // base case (works because partition() guarantees that returning pivot will
    // contains the correct sorted position of index pivot) i.e. if pivot  == ksmallest
    // we know for sure that at this position the item is at its final sorted index
    if(pivot == k_smallest)
      return nums[pivot];

    if(pivot > k_smallest)
      return quick_select(nums, l, pivot - 1, k_smallest);
    else
      return quick_select(nums, pivot + 1, r, k_smallest);
  }

  private int partition(int[] nums, int l, int r, int pivot) {
    int pivotVal = nums[pivot];
    // move pivot to very right
    swap(nums, pivot, r);

    // move pivot past smaller elements
    pivot = l;

    // <= allows the loop to also reposition the pivot back
    for(int i = l; i <= r; i++) {
      if(nums[i] <= pivotVal) {
        swap(nums, pivot++, i);
      }
    }

    // strictly the smaller partition
    return pivot - 1;
  }

  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }


}