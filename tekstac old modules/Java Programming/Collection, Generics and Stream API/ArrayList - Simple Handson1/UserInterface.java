import java.util.*;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.print("Enter the Length: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String s = sc.nextLine();
            list.add(s);
        }
        for(String s: list) {
            System.out.println("String: " + s);
        }
        sc.close();
    }
}
