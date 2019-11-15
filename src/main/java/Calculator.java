public class Calculator {
    public static double my_fact(int n) {
        if (n==0 | n==1) {
            return 1;
        } else {
            return n * my_fact(n-1);
        }

    }
}
