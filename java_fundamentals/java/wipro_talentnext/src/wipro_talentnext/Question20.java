package wipro_talentnext;
import java.util.Scanner;
public class Question20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter gender (Male/Female): ");
        String gender = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        if (gender.equalsIgnoreCase("Female")) {
            if (age >= 1 && age <= 58) {
                System.out.println("8.2%");
            } else if (age >= 59 && age <= 100) {
                System.out.println("9.2%");
            } else {
                System.out.println("Invalid age");
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            if (age >= 1 && age <= 58) {
                System.out.println("8.4%");
            } else if (age >= 59 && age <= 100) {
                System.out.println("10.5%");
            } else {
                System.out.println("Invalid age");
            }
        } else {
            System.out.println("Invalid gender");
        }
    }
}
