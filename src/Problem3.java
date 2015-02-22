import java.util.ArrayList;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * <p/>
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {

    public static void main(String[] args) {

        long number = 600851475143L;
        long prime = 0L;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i < number; i++) {
            list.add(i);
            if (isPrime(list, i))
                prime = i;
        }
        System.out.println(prime);
    }

    public static boolean isPrime(ArrayList<Integer> list, int a) {
        for (int b : list)
            if (a % b == 0)
                return false;
        return true;
    }
}
