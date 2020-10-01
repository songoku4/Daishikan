import java.util.Scanner;

public class arithmatic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number ");
        int x = sc.nextInt();
        System.out.print("Enter the second number ");
        int y = sc.nextInt();
        System.out.println("Enter an operator '+,-,*,/,%' ");
        char opt = sc.next().charAt(0);
        int result;
        switch (opt) {
            case '+':
                result = x + y;
                System.out.println(x + " " + opt + " " + y + " = " + result);
                break;
            case '-':
                result = x - y;
                System.out.println(x + " " + opt + " " + y + " = " + result);
                break;
            case '*':
                result = x * y;
                System.out.println(x + " " + opt + " " + y + " = " + result);
                break;
            case '/':

                if (y != 0) {
                    result = x / y;
                    System.out.println(x + " " + opt + " " + y + " = " + result);
                } else {
                    System.out.println(x + " " + opt + " " + y + " = Not Defined");
                }
                break;
            case '%':
                result = x % y;
                System.out.println(x + " " + opt + " " + y + " = " + result);
                break;
            default:
                System.out.println("Invalid operator !!");
        }

    }
}
