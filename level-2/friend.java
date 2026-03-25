import java.util.Scanner;

public class friend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ageAmar, ageAkbar, ageAnthony;
        double heightAmar, heightAkbar, heightAnthony;

        System.out.print("Enter Amar's age: ");
        ageAmar = sc.nextInt();
        System.out.print("Enter Amar's height: ");
        heightAmar = sc.nextDouble();

        System.out.print("Enter Akbar's age: ");
        ageAkbar = sc.nextInt();
        System.out.print("Enter Akbar's height: ");
        heightAkbar = sc.nextDouble();

        System.out.print("Enter Anthony's age: ");
        ageAnthony = sc.nextInt();
        System.out.print("Enter Anthony's height: ");
        heightAnthony = sc.nextDouble();

        // Finding youngest
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("The youngest friend is Amar");
        } 
        else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            System.out.println("The youngest friend is Akbar");
        } 
        else {
            System.out.println("The youngest friend is Anthony");
        }

        // Finding tallest
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("The tallest friend is Amar");
        } 
        else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            System.out.println("The tallest friend is Akbar");
        } 
        else {
            System.out.println("The tallest friend is Anthony");
        }

        sc.close();
    }
}