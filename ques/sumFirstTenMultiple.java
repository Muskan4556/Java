public class sumFirstTenMultiple {
    public static void main(String[] args) {
        int num = 10;
        int sum  = 0;
        
        for (int i = 1; i <= num; i++) {
            int mul = 10 * i;
            sum += mul;
        }
        System.err.println(sum);
    }
}
