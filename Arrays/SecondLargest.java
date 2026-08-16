import java.util.*;
class Main {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    int secondlargest=a[0];
    int max=a[0];
        for(int i=0;i<a.length;i++)
    {
        if(a[i]>max)
        {
            secondlargest=max;
            max=a[i];
        }
        else if(a[i]>secondlargest)
        {
            secondlargest=a[i];
        }
    }
     System.out.println("Second largest element from the array is "+ secondlargest);
    }
}
