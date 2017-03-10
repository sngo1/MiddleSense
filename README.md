# MiddleSense

##Team Information

###
Team MiddleSense <br>
Despoina Sparakis, Samantha Ngo, Kevin Bao <br>
APCS2 - pd1 <br>
QuickSort <br> <br>

##Big-O Runtime

### <b>best case</b>: The best case for QuickSort would be if the pivot is always the median of the set of ints being partitioned. Each partition will divide the set of ints in half logn times. Because partition-ing, itself, has a runtime of O(n), the combined runtime of partitioning at the median is O(nlogn).<br><br>

###<b>average or most likely case</b>: The most likely case for QuickSort would be if the pivot is any random int other than the smallest and the largest int. Since the probability of a random pivot being the smallest or largest int is 2/n , if n is increased, the probability of having a worst-case pivot will decrease significantly, resulting in a runtime of O(nlogn). <br><br>

###<b>worst case</b>: The worst case for QuickSort would be if the pivot is always the smallest or the largest int. Because this will cause partition to be called on each and every int in the set, and partition-ing, itself, has a runtime of O(n), the combined runtime of partitioning at the smallest or largest int is O(n^2).<br><br>

##Methodology

###We used 3 helper functions to calculate the average time for each array. <br>
We used QuickSort.buildArray(size,maxVal) to build new randomly generated arrays.<br>We used calculateTime to calculate the time (in milliseconds) to quicksort by utilizing System.currentTimeMillis().<br>We used avgTime to calculate the average time to quicksort 100 different arrays 100 times.





