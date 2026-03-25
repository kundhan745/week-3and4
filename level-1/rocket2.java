import java.util.Scanner;

public class rocket2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter;
        System.out.print("Enter the countdown number: ");
        counter = sc.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Rocket Launched!");

        sc.close();
    }
}