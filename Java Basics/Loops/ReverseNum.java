public class ReverseNum {
    public static void main(String[] args) {
        int n = 10899;
        while (n > 0) {
            int lastdig = n % 10;
            System.out.println(lastdig);
            n = n / 10;// n/=10
        }
        System.out.println();
    }
}
