import java.util.Scanner;

public class rocket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter;
        System.out.print("Enter the countdown number: ");
        counter = sc.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        System.out.println("Rocket Launched!");

        sc.close();
    }
}