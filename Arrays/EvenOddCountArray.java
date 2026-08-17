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
           int EvenCount=0;
           int OddCount=0;
            for(int i=0;i<a.length;i++)
            {
                if(a[i]%2==0)
                {
                    EvenCount++;
                }
                else{
                    OddCount++;
                }
            }
            System.out.println("Even count from the array is "+EvenCount);
             System.out.println("Odd count from the array is "+OddCount);
            
    }
}
