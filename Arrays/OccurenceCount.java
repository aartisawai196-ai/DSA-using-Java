import java.util.*;
class Main {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);         
  System.out.println("Enter Limit");
 int n = sc.nextInt();
 int a[] = new int[n];

 int count=0; 
 System.out.println("Enter array Elements");
 for (int i = 0; i < a.length; i++) {
  a[i] = sc.nextInt();
  System.out.println("Enter number you want to Count occurences");
 int target = sc.nextInt();
 for (int i = 0; i < a.length; i++){
        if (a[i] == target) {           
           count++;
           }                                                                                                 
   System.out.println(target+" Occurs "+ count +" times");
 }
}
