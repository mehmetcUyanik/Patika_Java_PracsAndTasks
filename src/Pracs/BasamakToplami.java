package Pracs;

import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {

        int number;
        int remain = 1 ;
        int result = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Basamaklarındaki rakamları toplamak istediğiniz sayıyı giriniz :");
        number=input.nextInt();

        while (number !=0 && remain !=0){
            remain=number%10;
            number=number/10;
            result = result + remain;
        }

        System.out.println("Sonuç : "+result);
    }
}
