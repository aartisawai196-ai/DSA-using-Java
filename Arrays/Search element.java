import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Limit");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter array Elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter number you want to search");
        int target = sc.nextInt();

        boolean found = false;
        int index = -1;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == target) {
                found = true;
                index = i;
                break;
            }
        }

        if (found == true) {
            System.out.println(target + " found at index " + index);
        }
        else {
            System.out.println(target + " not found in the array");
        }
    }
}
