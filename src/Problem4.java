/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * <p/>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {

    public static void main(String[] args) {

        int largestProduct = 0;

        int i, j;
        for (i = 999; i >= 100; i--)
            for (j = 100; j <= 999; j++)
                if (isPalindromic(i * j) && i * j > largestProduct)
                    largestProduct = i * j;

        System.out.println(largestProduct);
    }


    public static boolean isPalindromic(int number) {

        char[] digits = Integer.toString(number).toCharArray();

        for (int index = 0; index < digits.length; index++)
            if (digits[index] != digits[digits.length - 1 - index])
                return false;

        return true;

    }
}
