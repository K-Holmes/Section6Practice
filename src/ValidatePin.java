import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sysPin = 1234 , userPin;
        System.out.println("Enter your PIN");
        userPin = sc.nextInt();
        while (userPin != sysPin) {
            System.out.println("Incorrect try again");
            userPin = sc.nextInt();
        }
        System.out.println("Correct, you now have access to your account");

    }
}
