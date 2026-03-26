import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number, power;
        int result = 1;

        System.out.print("Enter the number: ");
        number = sc.nextInt();

        System.out.print("Enter the power: ");
        power = sc.nextInt();

        int counter = 0;

        while (counter < power) {
            result = result * number;
            counter++;
        }

        System.out.println(number + " raised to the power " + power + " is " + result);

        sc.close();
    }
}