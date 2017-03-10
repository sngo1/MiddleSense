public class QuickSortTester{

    /*** Test driver for QuickSort sorting algo. 
	 Target: nlogn

	 The algorithm for the timing mechanism is you calculate the time (millisec)
	 it takes for an array with a certain size to be quicksorted 100 times with
	 100 different randomly generated arrays. Then you find the average time 
	 among these 100 values. Sizes of arrays will be increased by a factor of 5 
	 or 10. 

	 Average time for size      1: 0.0
	 Average time for size     10: 0.0
	 Average time for size    100: 0.0 
	 Average time for size   1000: 0.15
	 Average time for size   5000: 1.41
	 Average time for size  10000: 2.61
	 Average time for size  50000: 26.79
	 Average time for size 100000: 89.9
	 Average time for size 200000: 320.71
    ***/

    public static double calculateTime (int[] arr) {
	double q = System.currentTimeMillis();
	QuickSort.qsort(arr);
	double y = System.currentTimeMillis();
	return y-q;
    }

    public static double avgTime (int[] arr , int numTimes) {
	double retSum = 0;
	for (int x = 0 ; x < numTimes ; x ++) {
	    retSum += calculateTime(arr);
	}
	retSum = retSum/numTimes;
	return retSum;
    }
    
    public static void main (String[] args) {
	// arrays of randomly generated ints

	System.out.println("Average time for size 1: " + avgTime(QuickSort.buildArray(1,100),100));
	System.out.println("Average time for size 10: " + avgTime(QuickSort.buildArray(10,100),100));
	System.out.println("Average time for size 100: " + avgTime(QuickSort.buildArray(100,100),100));
	System.out.println("Average time for size 1000: " + avgTime(QuickSort.buildArray(1000,100),100));
	System.out.println("Average time for size 5000: " + avgTime(QuickSort.buildArray(5000,100),100));
	System.out.println("Average time for size 10000: " + avgTime(QuickSort.buildArray(10000,100),100));
	System.out.println("Average time for size 50000: " + avgTime(QuickSort.buildArray(50000,100),100));
	System.out.println("Average time for size 100000: " + avgTime(QuickSort.buildArray(100000,100),100));
	System.out.println("Average time for size 200000: " + avgTime(QuickSort.buildArray(200000,100),100));
    }
}


	
       
	
