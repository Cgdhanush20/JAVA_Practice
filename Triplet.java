import java.util.*;
public class Triplet {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array values:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==0)
                    {
                        count++;
                    }
                }
            }
        }
        if(count!=0)
        {
            System.out.println("output:1");
        }
        else{
            System.out.println("output:0");
        }
    }
}
