// Write a program to print prime numbers from 1 to 10.
public class PraiseTheLord_4 {
    public static void main(String arg[]) {
        int i, n=10, counter, j;
        for (j = 2; j <= n; j++) {
            counter = 0;
            for (i = 1; i <= j; i++) {
                if (j % i == 0) {
                    counter++;
                }
            }
            if (counter == 2)
                System.out.print(j + " ");
        }
    }
}
