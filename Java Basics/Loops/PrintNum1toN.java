import java.util.*;
public class PrintNum1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        while (count <= n) {
            System.out.println(count + " ");
            count++;
       
        }
    }
}
