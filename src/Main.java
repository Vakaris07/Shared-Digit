//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    private static boolean hasSharedDigit(int num1, int num2){

        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }
        int firstDigitnum1 = num1 % 10;
        int secondDigitnum1 = num1 % 10;

        int firstDigitnum2 = num2 / 10;
        int secondDigitnum2 = num2 % 10;

        if (firstDigitnum1 == firstDigitnum2 || secondDigitnum1 == firstDigitnum2 || secondDigitnum1 == secondDigitnum2) {
            return true;
        }
        return false;



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        if (hasSharedDigit(num1, num2)) {
            System.out.println("Has shared digits");
        } else {
            System.out.println("No shared digits");
        }



    }
}





