import java.util.*;
public class Palindrome {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter a num:");
     int num = sc.nextInt();
     int temp = num;
     int rev = 0;
     int rem;
     while(temp != 0){
        rem = temp%10;
        rev = rev*10 + rem;
        temp = temp / 10;
     }
     if(num == rev){
        System.out.println(num + "\nis a Palindrome No");
     }else{
        System.out.println(num + "\nNot a Palindrome no");
     }
  }
}
