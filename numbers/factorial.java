public class factorial {
        public long calculateFactorial(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
            }
            if (n == 0 || n == 1) {
                return 1;
            }
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
}
