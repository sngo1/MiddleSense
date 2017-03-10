public class QuickSortTester{

    /*** Test driver for QuickSort sorting algo. 
	 Target: nlogn
    ***/

    public static void main (String[] args) {
	// arrays of randomly generated ints
	int[] arr1 = QuickSort.buildArray(1,100);
   	//int[] arr2 = QuickSort.buildArray(10,100);
	//int[] arr3 = QuickSort.buildArray(100,100);
	//int[] arr4 = QuickSort.buildArray(1000,100);
	//int[] arr5 = QuickSort.buildArray(10000,100);
	//int[] arr6 = QuickSort.buildArray(100000,100);

	System.out.println("\narr init'd to: " );
	QuickSort.printArr(arr1);
	
       	QuickSort.shuffle(arr1);
       	System.out.println("arr post-shuffle: " );
	QuickSort.printArr(arr1);

	QuickSort.qsort( arr1 );
	System.out.println("arr after sort: " );
	QuickSort.printArr(arr1);
    }
}


	
       
	
