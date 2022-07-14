// { Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java


class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        ArrayList<Long> ans=new ArrayList<>();
        int low=0;
        int high=n-1;
        long fi=-1;
        while(low<=high)
        {
            int mid=(low+high)>>1;
            if(x>arr[mid]) low=mid+1;
            else if(x<arr[mid]) high=mid-1;
            else{
                fi=mid;
                high=mid-1;
            }
        }
        ans.add(fi);
        low=0;
        high=n-1;
        long li=-1;
        while(low<=high)
        {
            int mid=(low+high)>>1;
            if(x>arr[mid])low=mid+1;
            else if(x<arr[mid])high=mid-1;
            else{
                li=mid;
                low=mid+1;
            }
        }
        ans.add(li);
        return ans;
    }
}



// { Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Long> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}
  // } Driver Code Ends