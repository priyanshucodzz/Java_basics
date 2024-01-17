import java.util.*;

public class EvensumorOddsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int evensum = 0;
        int oddsum = 0;
        int choice;
        do{
        System.err.println("Enter the number ");
         num = sc.nextInt();
        if (num % 2 == 0) {
            evensum += num;
        } else {
            oddsum += num;
        }
        
        
        System.out.println("press  1 for yes or 0 for no");
        choice = sc.nextInt();

        }while(choice == 1);
        System.out.println("Sum of even num "+ evensum);
        System.out.println("Sum of oddsum "+ oddsum);
    }
}
