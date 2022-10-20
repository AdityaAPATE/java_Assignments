import java.util.Scanner;

public class PraiseTheLord3 {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner var = new Scanner(System.in);
        System.out.println("Enter 3 number : ");
        n1 = var.nextInt();
        n2 = var.nextInt();
        n3 = var.nextInt();
        if (n1 > n2 && n1 > n3) {
            System.out.println("N1 is greater : " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("N2 is greater : " + n2);
        } else if (n3 > n1 && n3 > n2) {
            System.out.println("N3 is greater : " + n3);
        }
    }

}
