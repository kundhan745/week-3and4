import java.util.Scanner;

public class large {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1, number2, number3;

        System.out.print("Enter first number: ");
        number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        number3 = sc.nextInt();

        System.out.println("Is the first number the largest? " + (number1 > number2 && number1 > number3));
        System.out.println("Is the second number the largest? " + (number2 > number1 && number2 > number3));
        System.out.println("Is the third number the largest? " + (number3 > number1 && number3 > number2));

        sc.close();
    }
}