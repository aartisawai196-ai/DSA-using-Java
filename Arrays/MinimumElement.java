import java.util.*;
class Main {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
          System.out.println("Enter Limit");
          int n=sc.nextInt();
          int a[]=new int[n];

           System.out.println("Enter array Elements");
           for(int i=0;i<a.length;i++)
           {
             a[i]=sc.nextInt();
           }
           int min=a[0];
            for(int i=0;i<a.length;i++)
            {
                if(a[i]<min)
                {
                    min=a[i];
                }
            }
            System.out.println("Minimum From the Array elements is " +min);
    }
}
