/**
 * The sum of the squares of the first ten natural numbers is,
 * <p/>
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 * <p/>
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * <p/>
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem6 {

    public static void main(String[] args) {

        System.out.println(Double.valueOf((Math.pow(sumOfRange(100, 1), 2) - sumOfRange(100, 2))).longValue());

    }

    private static long sumOfRange(int range, int power) {
        long sum = 0;
        for (int i = 1; i <= range; i++)
            sum += Math.pow(i, power);

        return sum;
    }

}
