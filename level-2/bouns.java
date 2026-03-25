import java.util.Scanner;

public class bouns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary;
        int years;

        System.out.print("Enter the salary: ");
        salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        years = sc.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is " + bonus);
        } 
        else {
            System.out.println("The bonus amount is 0");
        }

        sc.close();
    }
}