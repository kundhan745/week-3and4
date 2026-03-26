import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number, power;
        int result = 1;

        System.out.print("Enter the number: ");
        number = sc.nextInt();

        System.out.print("Enter the power: ");
        power = sc.nextInt();

        if (number > 0 && power >= 0) {

            for (int i = 1; i <= power; i++) {
                result = result * number;
            }

            System.out.println(number + " raised to the power " + power + " is " + result);
        } 
        else {
            System.out.println("Please enter positive integers");
        }

        sc.close();
    }
}