/**
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 * <p/>
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * <p/>
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
public class Problem2 {

    public static void main(String[] args) {

        int sum = 0;
        int prev = 0;
        int current = 1;

        while (current < 4000000) {
            sum += current % 2 == 0 ? current : 0;
            current += prev;
            prev = current;
        }
        System.out.println(sum);
    }
}