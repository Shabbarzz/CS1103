import java.util.Random;
import java.lang.Math;
import java.util.Arrays;
//size 1000 takes 0.008 sec for s1 and 0.002 sec for s2
//size 10000 takes  0.205 sec for s1 and 0.013 sec for s2
//size 100000 takes 8.202 sec for s1 and  0.061  sec for s2

public class Sorting {
	
	static void insertionSort(int[] A) {
		// Sort the array A into increasing order.
		int itemsSorted; // Number of items that have been sorted so far.
		for (itemsSorted = 1; itemsSorted < A.length; itemsSorted++) {
		int temp = A[itemsSorted]; // The item to be inserted.
		int loc = itemsSorted - 1; // Start at end of list.
		while (loc >= 0 && A[loc] > temp) {
		A[loc + 1] = A[loc]; // Bump item from A[loc] up to loc+1.
		loc = loc - 1; // Go on to next location.
		}
		A[loc + 1] = temp; 
		}
		}

	public static void main(String[] args) {
		int v= 1000;
		int [ ] s1 = new int [v];
		int [ ] s2 = new int [v];
		
		for (int i = 0; i < s1.length; i++){
			s1[i] = (int)(Integer.MAX_VALUE * Math.random());
		}
		for (int i = 0; i < s1.length; i++){
			s2[i] = (int)(Integer.MAX_VALUE * Math.random());
		}
		
		long startTime = System.currentTimeMillis();
		insertionSort(s1);
		long endTime = System.currentTimeMillis();
		long timeDiff = endTime - startTime;
		System.out.println("Time of s1 array: " + timeDiff/1000.0);
		
		
		long startTime2 = System.currentTimeMillis();
		Arrays.sort(s2);
		long endTime2 = System.currentTimeMillis();
		long timeDiff2 = endTime2 - startTime2;
		System.out.println("Time of s2 array: " + timeDiff2/1000.0);

	}

}
