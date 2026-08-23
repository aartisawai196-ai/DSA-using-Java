import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Limit");
        int n = sc.nextInt();

        int a[] = new int[n];
        int unique[] = new int[n];

        int uniqueCount = 0;

        System.out.println("Enter array Elements");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {

            boolean found = false;

            for (int j = 0; j < uniqueCount; j++) {

                if (a[i] == unique[j]) {
                    found = true;
                    break;
                }
            }

            if (found == false) {

                unique[uniqueCount] = a[i];
                uniqueCount++;

            } else {

                System.out.println("Duplicate element: " + a[i]);
            }
        }
    }
}
