/**
 * Created by kirill on 1/5/15.
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