package Tasks;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int bounder;
        int num1=0;
        int num2=1;
        int total=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç Elemanlı Fibonacci Dizisi İstiyorsunuz? :");
        bounder = scanner.nextInt();

        for (int i = 1; i <= bounder; i++) {
            System.out.print(num1 + " ");
            total = num1 + num2;
            num1 = num2;
            num2 = total;
        }
    }
}
