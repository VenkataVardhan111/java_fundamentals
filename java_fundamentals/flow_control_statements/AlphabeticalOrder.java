import java.util.Scanner;
public class AlphabeticalOrder {
    public static void main(String[] args) {
        // Initialize two character variables
        Scanner sc = new Scanner(System.in);
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        char ch3 = sc.next().charAt(0);

        // Compare and display the characters in alphabetical order
        if (ch1 > ch2 && ch1 > ch3) {
            System.out.println(ch3 + "," + ch1 + "," + ch2);
        } else if (ch2 > ch1 && ch2 > ch3) {
            System.out.println(ch3 + "," + ch2 + "," + ch1);
        } else if (ch3 > ch1 && ch3 > ch2) {
            System.out.println(ch1 + "," + ch3 + "," + ch2);
        }
        else if (ch1 > ch2 && ch2 > ch3) {
            System.out.println(ch1 + "," + ch2 + "," + ch3);
        
        }
    }
}