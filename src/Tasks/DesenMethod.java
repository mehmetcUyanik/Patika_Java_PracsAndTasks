package Tasks;

import java.util.Scanner;

public class DesenMethod {

    static void pattern(int number) {

        int num = number;

        while (num > 0) {
            System.out.print(num + " ");
            num -= 5;
        }

        while (num <= number) {
            System.out.print(num + " ");
            num += 5;
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("N sayısı :");
        int x = input.nextInt();
        pattern(x);

    }
}
