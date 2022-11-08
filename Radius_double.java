import java.util.Scanner;

public class Radius_double {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double pi = 3.14;

        int S = (int)(pi*radius*radius);
        System.out.println(S);

    }
}
