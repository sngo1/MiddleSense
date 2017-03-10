public class QuickSortTester{

    /*** Test driver for QuickSort sorting algo. 
	 Target: nlogn
    ***/

    public static void main (String[] args) {
	// arrays of randomly generated ints
	for(int x = 0; x < 5; x++){
//	int[] arr1 = QuickSort.buildArray(1,100);
  // 	int[] arr1 = QuickSort.buildArray(10,100);
	//int[] arr1 = QuickSort.buildArray(100,100);
	//int[] arr1 = QuickSort.buildArray(1000,100);
	int[] arr1 = QuickSort.buildArray(10000,100);
	//int[] arr1 = QuickSort.buildArray(100000,100);

	//System.out.println("\narr init'd to: " );

	
       	QuickSort.shuffle(arr1);
       	//System.out.println("arr post-shuffle: " );
	//QuickSort.printArr(arr6);
	double q = System.currentTimeMillis();
	QuickSort.qsort( arr1 );
	double y =  System.currentTimeMillis();
	System.out.println(x + ": " + (y-q));
	//System.out.println("arr after sort: " );
	//QuickSort.printArr(arr6);
	}
	
	

    }
}


	
       
	
