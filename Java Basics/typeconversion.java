public class typeconversion {
    public static void main(String[] args) {
        int a = 25;
        long b = a;
        System.out.println(b);

        // not possible lossy conversion
        // long a = 25;
        // int b  = a;
        // System.out.println(b);

    }
}
