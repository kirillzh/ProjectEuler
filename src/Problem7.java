import java.util.LinkedList;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * <p/>
 * What is the 10 001st prime number?
 */

public class Problem7 {

    public static void main(String[] args) {
        LinkedList<Long> primes = new LinkedList<Long>();
        primes.add(1L);
        while (primes.size() <= 10001) {
            primes.add(nextPrime(primes.getLast()));
        }

        System.out.println(primes.get(10001));

    }

    public static boolean isPrime(long n) {
        for (long i = 2; i < n; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static long nextPrime(long n) {
        for (long i = n + 1; ; i++) {
            if (isPrime(i)) return i;
        }
    }

}
