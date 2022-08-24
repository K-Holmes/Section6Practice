import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number to list the multiples");
        int userNum = sc.nextInt();
        int multiple = 1;

        while (multiple !=13) {
            System.out.println(userNum + " x " + multiple + " = " + (userNum*multiple));
            multiple++;
        }


    }

}
