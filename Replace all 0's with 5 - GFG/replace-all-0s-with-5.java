// { Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}// } Driver Code Ends


class GfG {
    int convertfive(int num) {
        int res=0;
        int m=1;
        while(num>0)
        {
            int rem=num%10;
            if(rem!=0)
            {
                res=(rem*m)+res;
            }
            else{
                res=(m*5)+res;
            }
            m*=10;
            num=num/10;
        }
        return res;
    }
}