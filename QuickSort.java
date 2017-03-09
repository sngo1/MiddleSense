/*Despoina Sparakis
APCS2 pd1
HW #15: So So Quick
2017-03-08
*/

/*****************************************************
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr): The algorithm runs Mysterion on the first element of the list. It then splits the 
 list into two "parts", and repeats on each of the parts until it goes through the enitre array
 *
 * 2a. Worst pivot choice / array state and associated runtime: 
 *n^2
 * 2b. Best pivot choice / array state and associated runtime:
 *
 * 3. Approach to handling duplicate values in array:
 *Mysterion handles the duplicates. 
 *****************************************************/

/***
    PROTIP: Assume no duplicates during initial development phase.
    Once you have a working implementation, test against arrays 
    with duplicate values, and revise if necessary. (Backup first.)
 ***/

public class QuickSort 
{
    //--------------v  HELPER METHODS  v--------------
    //swap values at indices x, y in array o
    public static void swap( int x, int y, int[] o ) {
	int tmp = o[x];
	o[x] = o[y];
	o[y] = tmp;
    }

    //print input array 
    public static void printArr( int[] a ) {
	for ( int o : a )
	    System.out.print( o + " " );
	System.out.println();
    }

    //shuffle elements of input array
    public static void shuffle( int[] d ) {
	int tmp;
	int swapPos;
	for( int i = 0; i < d.length; i++ ) {
	    tmp = d[i];
	    swapPos = i + (int)( (d.length - i) * Math.random() );
	    swap( i, swapPos, d );
	}
    }

    //return int array of size s, with each element fr range [0,maxVal)
    public static int[] buildArray( int s, int maxVal ) {
	int[] retArr = new int[s];
	for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = (int)( maxVal * Math.random() );
	return retArr;
    }
    //--------------^  HELPER METHODS  ^--------------



    /*****************************************************
     * void qsort(int[])
     * @param d -- array of ints to be sorted in place
     *****************************************************/
    public static void qsort( int[] d ){
		int q = Mysterion(d, 0, d.length - 1, 0);
		if(q == 0){
			qSortHelper(d, 1, d.length-1 );
		}
		else if(q== d.length-1){
			qSortHelper(d, 0, d.length-2);
		}
		else{
			qSortHelper(d, 0, q-1);
			qSortHelper(d, q+1, d.length-1);
		}
    }
	
	public static void qSortHelper(int[] d, int start, int end){
		if(start == end){
			//?
		}
		else{
			int q = Mysterion(d, start, end, start);
			if(q==start){
				qSortHelper(d, start+1, end);
			}
			else if(q==end){
				qSortHelper(d, start, end-1);
			}
			else{
				qSortHelper(d, start, q-1);
				qSortHelper(d, q+1, end);
			}
		}
	}

    // Thinkers are encouraged to roll their own subroutines.
    // Insert your auxiliary helper methods here.

	
	public static int Mysterion(int[] arr, int a, int b, int c){
		int v = arr[c];
		swap(c, b, arr);
		int s = a;
		for(int i = a; i < b; i++){
			if(arr[i] < v){
			swap(s, i, arr);
			s+=1;
			}
		}
		swap(b, s, arr);
		return s;  
	}

    //main method for testing
    public static void main( String[] args ) 
    {
	
	/*int[] q = {7, 8, 4, 2, 6, 3, 9, 5};
	printArr(q);
	qsort(q);
	printArr(q);*/

	/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) 

	
	//get-it-up-and-running, static test case:
	int [] arr1 = {7,1,5,12,3};
	System.out.println("\narr1 init'd to: " );
	printArr(arr1);

	qsort( arr1 );	
       	System.out.println("arr1 after qsort: " );
	printArr(arr1);

	// randomly-generated arrays of n distinct vals
	int[] arrN = new int[10];
	for( int i = 0; i < arrN.length; i++ )
	    arrN[i] = i;
       
	System.out.println("\narrN init'd to: " );
	printArr(arrN);

       	shuffle(arrN);
       	System.out.println("arrN post-shuffle: " );
	printArr(arrN);

	qsort( arrN );
	System.out.println("arrN after sort: " );
	printArr(arrN);
	
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/


	
	//get-it-up-and-running, static test case w/ dupes:
	int [] arr2 = {7,1,5,12,3,7};
	System.out.println("\narr2 init'd to: " );
	printArr(arr2);

	qsort( arr2 );	
       	System.out.println("arr2 after qsort: " );
	printArr(arr2);


	// arrays of randomly generated ints
	int[] arrMatey = new int[20];
	for( int i = 0; i < arrMatey.length; i++ )
	    arrMatey[i] = (int)( 48 * Math.random() );
       
	System.out.println("\narrMatey init'd to: " );
	printArr(arrMatey);

       	shuffle(arrMatey);
       	System.out.println("arrMatey post-shuffle: " );
	printArr(arrMatey);

	qsort( arrMatey );
	System.out.println("arrMatey after sort: " );
	printArr(arrMatey);
	/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) 

	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    }//end main

}//end class QuickSort
