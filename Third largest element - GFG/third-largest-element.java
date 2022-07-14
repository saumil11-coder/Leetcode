// { Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}// } Driver Code Ends


class Solution
{
    int thirdLargest(int a[], int n)
    {
	    PriorityQueue<Integer> pq=new PriorityQueue<>();
	    for(int i=0;i<n;i++)
	    {
	        if(i<3)
	        {
	            pq.add(a[i]);
	        }
	        else{
	            if(a[i]>pq.peek())
	            {
	                pq.remove();
	                pq.add(a[i]);
	            }
	        }
	    }
	    return pq.peek();
    }
}
