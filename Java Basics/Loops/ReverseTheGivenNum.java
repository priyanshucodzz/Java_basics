public class ReverseTheGivenNum {
    public static void main(String[] args) {
       
        int n = 10899;
        int rev = 0;
        while (n > 0) {
            int lastdigit = n % 10;  //find the last digit
            rev = (rev * 10) + lastdigit;
            n = n/10; //Remove the last digit

        }
        System.out.println(rev);
    }
}
