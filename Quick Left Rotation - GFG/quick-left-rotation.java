//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
class Solution
{
    void leftRotate(long arr[], int k,int n)
    {
        k = k%n;
       int newK = n-k;
        //part 1 reverse
        reverse(arr,0,n-newK-1);
        //part 2 revers
        reverse(arr,n-newK,n-1);
        //whole array reverse
        reverse(arr,0,n-1);
        return;
        
        
    }
    void reverse(long arr[], int i, int j){
        long temp;
        int l,r;
        temp=0;
        l=i;
        r=j;
        while(l<r){
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int k =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(a2[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
//            String line2 = br.readLine();
//            String[] a2 = line2.trim().split("\\s+");
//            long b[] = new long[n];
//            for (int i = 0; i < m; i++) {
//                b[i] = Long.parseLong(a2[i]);
//            }
            Solution ob = new Solution();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            ob.leftRotate(a,k,n);
            for (int i = 0; i < n; i++)
                out.print(a[i]+" ");
            out.println();
        }
        out.close();
    }
}





// } Driver Code Ends