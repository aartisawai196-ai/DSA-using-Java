import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Limit");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        boolean isSorted = true;

        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] > a[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is not Sorted");
        }
    }
}
