public class LargestofThree {
    public static void main(String[] args) {
        int A = 1;
        int B = 3;
        int C = 6;
        if ((A >= B) && (A >= C)) {
            System.out.println("A");
        } else if (B >= C) {
            System.out.println("B");
        }else{
            System.out.println("C");
        }

    }
}
