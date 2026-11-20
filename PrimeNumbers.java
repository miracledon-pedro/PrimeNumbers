public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 0 and 500:");

        for (int num = 0; num <= 500; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        // 0 and 1 are not prime numbers
        if (n <= 1) {
            return false;
        }
        
        // Check for factors from 2 up to the square root of n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}