// Java code for kth smallest element
// in an array
import java.util.Arrays;
import java.util.Collections;
import java.util.*;

class Main {
	// Function to return k'th smallest
	// element in a given array
	public static int kthSmallest(int[] arr,
								int k)
	{
		// Sort the given array
		Arrays.sort(arr);

		// Return k'th element in
		// the sorted array
		return arr[k - 1];
	}

	// driver program
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		int arr[] = new int[n] ;
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		int k = sc.nextInt();
		System.out.print("K'th smallest element is " + kthSmallest(arr, k));
	}
}

// This code is contributed by Chhavi
