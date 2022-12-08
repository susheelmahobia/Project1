public class StarPattern2 {
    static void pattern2_rec(int n) {
        if (n > 0) {
            pattern2_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {

        pattern2_rec(5);

    }
}