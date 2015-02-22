/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * <p/>
 * What is the largest prime factor of the number 600851475143 ?
 */

import java.util.LinkedList;

/**
 * The first idea: simple brute force. Won't work. 600851475143 is way too big number, takes A LOT of time to compile
 * <p/>
 * The second Idea: start from smallest prime number, divide given number by this prime number as long as it is evenly divisible
 * find larger prime number by which we can evenly divide given number again and again
 * the last possible prime number which gives us evenly divisible number will be an answer
 * <p/>
 * Example: given 72765 number
 * 1. divide by smallest prime number 3: 72765 / 3 = 24255
 * 2. divide again 24255 / 3 = 8085
 * 3. and again 8085 / 3 = 2695
 * 4. let's try one more time: 2695 % 3 != 0
 * 5. then try to divide by larger prime number, i.e by 5: 2695 / 5 = 539
 * 6. let's try again: 539 % 5 != 0
 * 7. divide by another larger prime number, which appears to be 7: 539 / 7 = 77
 * 8. and again: 77 / 7 = 11
 * 9. since 11 % 7 != 0, let's try next prime number: 11 / 11 = 1
 * 10. eventually we should stop on 1, and 11 is the largest prime number
 * 72765 = 3*3*3*5*7*7*11
 */

public class Problem3 {

    public static void main(String[] args) {

        final long givenNumber = 600851475143L;
        long remainder = givenNumber;

        LinkedList<Long> primeNumbers = new LinkedList<Long>();
        primeNumbers.add(1L);
        long currentPrime = primeNumbers.getLast();

        while (remainder > 1) {
            currentPrime = nextPrime(currentPrime);
            if (remainder % currentPrime == 0)
                remainder /= currentPrime;
        }
        System.out.println(currentPrime);

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