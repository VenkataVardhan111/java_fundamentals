import java.util.Scanner;
public class MaleFemale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter gender (Male/Female): ");
       
        String gender = sc.next();
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (gender.equals("Male") || gender.equals("male")) {
            System.out.println("Male");
            if (age < 58) {
                System.out.println("the percentage of interest is 8.4%");
            }
            else if (age >= 58) {
                System.out.println("the percentage of interest is 10.5%");
            }
        } else if (gender.equals("Female") || gender.equals("female")) {
            System.out.println("Female");
            if (age < 58) {
                System.out.println("the percentage of interest is 8.2%");
            }
            else if (age >= 58) {
                System.out.println("the percentage of interest is 9.2%");
            }
        }
    }
}
