import java.util.*;

public class CompatibleArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of first array: ");
        int n1 = sc.nextInt();
        
        if(n1 > 0) {
            int[] arr1 = new int[n1];
            System.out.print("Enter the elements in first array: ");
            for(int i=0;i<n1;i++) {
                arr1[i] = sc.nextInt();
            }
            System.out.print("Enter the size of second array: ");
            int n2 = sc.nextInt();

            if(n2 > 0) {
                int[] arr2 = new int[n2];
                System.out.print("Enter the elements of second array");
                for(int i=0;i<n2;i++) {
                    arr2[i] = sc.nextInt();
                }
                int flag = 0;
                if(n1 == n2) {
                    for(int i=0;i<n1;i++) {
                        if(arr1[i] >= arr2[i]) {
                            flag++;
                        }
                    }
                    if(flag == n1) {
                        System.out.println("Array is compactible");
                    } else {
                        System.out.println("Array is not compactible");
                    }
                } else {
                    System.out.println("Array is not compactible");
                }
            } else {
                System.out.println("Invalid array size");
            }
        } else {
            System.out.println("Invalid Array size");
        }
    }
}
