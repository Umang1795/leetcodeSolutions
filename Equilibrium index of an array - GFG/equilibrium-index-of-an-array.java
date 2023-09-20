//{ Driver Code Starts
import java.util.*;
class Index{
public static void main(String[] args)
 {
	 Scanner sc = new Scanner(System.in);
	 int T = sc.nextInt();
		while(T-- > 0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.findEquilibrium(a,n));
		}
}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG
{
           public static int findEquilibrium(int arr[], int n)
              {
                //add code here.
                int sl,sr;
                sl=sr=0;
                if(n==1)return 0;
                for(int i=1;i<n;i++){
                    sr+=arr[i];
                }
                for(int i =0; i<n-1;i++){
                    if(sl==sr){
                        return i;
                    }else {
                        sl+=arr[i];
                        sr-=arr[i+1];
                    }
                }
                return -1;
              }
}