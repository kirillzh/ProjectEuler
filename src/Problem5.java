/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * <p/>
 * What is the smallest positive number that is evenly divisible (divisible with no remainder) by all of the numbers from 1 to 20?
 */

public class Problem5 {

    public static void main(String[] args) {

        long wantedNumber = 1;
        for (int i = 2; i <= 20; i++)
            wantedNumber *= i;

        for (int i = 2; i <= 20; i++) {

            while (isDivisible(wantedNumber / i))
                wantedNumber /= i;
        }

        System.out.println(wantedNumber);

    }

    private static boolean isDivisible(long number) {
        for (int i = 2; i <= 20; i++)
            if (number % i != 0)
                return false;
        return true;
    }

}
