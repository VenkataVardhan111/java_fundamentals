import java.util.Scanner;
public class lowerrcaseToUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string in lowercase: ");
        String input = sc.nextLine();
        if (input.equals(input.toLowerCase())) {
            String output = input.toUpperCase();
            System.out.println("The string in uppercase is: " + output);
        }
        else if (input.equals(input.toUpperCase())) {
            String output1 = input.toLowerCase();
            System.out.println("The string in lowercase is: " + output1);
        }
    }
    
}
