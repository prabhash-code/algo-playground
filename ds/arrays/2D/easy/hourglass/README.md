## Question
Given a `6 x 6` 2D Array, `arr`:
> 1 1 1 0 0 0<br>
> 0 1 0 0 0 0<br>
> 1 1 1 0 0 0<br>
> 0 0 0 0 0 0<br>
> 0 0 0 0 0 0<br>
> 0 0 0 0 0 0<br>

An hourglass in `A` is a subset of values with indices falling in this pattern in `arr`'s graphical representation:
> a b c<br>
> &nbsp;&nbsp;&nbsp;d<br>
> e f g<br>

There are 16 hourglasses in `arr`. An hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in `arr`, then print the maximum hourglass sum. The array will always be `6 x 6`.

## Solution - Thought process
1. Define `sum` variable with minimum integer value
2. We need two loops since this is a 2D array.
3. We have a condition that array always be `6 x 6`. 
4. Then we can get total of `first`, `second` and `third` rows separately. ( Hence we just need to loop 4 times in both sides; to right and to bottom. )
5. Finally, checked that total(`temp`) with previous total(`sum`) and keep the greater one.

