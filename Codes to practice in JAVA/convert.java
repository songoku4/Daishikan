import java.util.Scanner;

public class convert {

    public static void main(String[] args) {
        float input, answer;
        int unit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        input = sc.nextFloat();
        System.out.println("Press '1' if temp. is in Celcius and '2' if in Fahrenheit: ");
        unit = sc.nextInt();
        if (unit != 1 && unit != 2) {
            System.out.println("Invalid Input !");
            System.exit(0);
        }

        if (unit == 1) {
            answer = (input * 9 / 5) + 32;
            System.out.println("Answer: " + answer + " F");
        }

        else {
            answer = (input - 32) * 5 / 9;
            System.out.println("Answer: " + answer + " C");
        }

    }
}
