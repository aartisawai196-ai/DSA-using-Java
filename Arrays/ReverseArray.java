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
            System.out.println("Reversed Array elements are");
            for(int i=a.length-1;i>=0;i--)
            {
                System.out.print(a[i]+" ");
            }
    }
}
