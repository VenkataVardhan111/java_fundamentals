import java.util.Scanner;
import java.util.Arrays;

public class AlphabeticalOrder2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] chars = new char[3];
        chars[0] = sc.next().charAt(0);
        chars[1] = sc.next().charAt(0);
        chars[2] = sc.next().charAt(0);

        Arrays.sort(chars);

        System.out.println(chars[0] + "," + chars[1] + "," + chars[2]);
    }
}
