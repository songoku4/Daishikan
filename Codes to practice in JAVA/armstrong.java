import java.util.Scanner;

public class armstrong {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int x = sc.nextInt();
        int y = x;
        int sum = 0;
        int len = Integer.toString(x).length();
        while (y != 0) {
            sum += Math.pow(y % 10, len);
            y = y / 10;
        }
        if (sum == x) {
            System.out.println(x + " is an armstrong number.");
        } else {
            System.out.println(x + " is not an armstrong number.");
        }
    }

}
