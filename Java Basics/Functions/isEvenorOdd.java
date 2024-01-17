import java.util.*;

public class isEvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        System.out.println("Enter your Number: ");
        num = sc.nextInt();
        if (isEven(num)) {
            System.out.println("Num is even");
        } else {
            System.out.println("Num is Odd");
        }
    }public static boolean isEven(int number){
        if(number % 2== 0){
             return true;
        }else{
            return false;
        }
    }

}
