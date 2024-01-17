import java.util.*;

public class PrintSum1stNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//5
        int sum = 0;
        int count = 1;
        while (count <= n) {
            sum += count;
            count++;

        }
        System.out.println(sum);
    }
}