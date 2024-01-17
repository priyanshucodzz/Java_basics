public class typepromotion {
    public static void main(String[] args) {
        // 1st type promotion
        // char a = 'a';
        // char b = 'b';
        // System.out.println((int) b);
        // System.out.println((int) a);
        // System.out.println(b - a);
        //2nd type promotion
        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        double ans = a + b + c + d;
        System.out.println(ans);

    }
}
