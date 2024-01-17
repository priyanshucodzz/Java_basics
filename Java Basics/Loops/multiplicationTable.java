import java.util.*;
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1;i<=10;i++){
        //    int ans = num*i;
           System.out.println(num + "*" + i + "=" + num*i);
        }
    }
}
