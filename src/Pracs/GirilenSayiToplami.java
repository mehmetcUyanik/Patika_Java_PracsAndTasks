package Pracs;

import java.util.Scanner;

public class GirilenSayiToplami {
    public static void main(String[] args) {

        int number;
        int total = 0;

        Scanner input = new Scanner(System.in);


        do {
            System.out.println("Sayı Giriniz : ");
            number= input.nextInt();

            if (number%4==0){
                total = total + number;
            }
        }

        while (number%2==0);

            System.out.println(total);

    }
}
