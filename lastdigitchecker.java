import java.util.Scanner;
public class lastdigitchecker {
   
    public static boolean lastDigit(int a, int b) {
        return (a % 10) == (b % 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(lastDigit(a, b)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
   
    }
}