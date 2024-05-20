import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n]; 
        int bigDifference=0, smallIndex=0;

        if(n <= 3) {
            System.out.println("Minimum array size > 3");
            System.exit(0);
        }

        System.out.println("Enter Array Elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();

            for(int j=0;j<n-2;j++) {
                bigDifference = Math.abs(arr[j] - arr[j+2]) > bigDifference ? Math.abs(arr[j] - arr[j+2]) : bigDifference;
                smallIndex = (arr[j] <= arr[j+2]) ? j : j+2;
            }
        }
        System.out.println("Small Index " + smallIndex);
        sc.close();
    }
}
