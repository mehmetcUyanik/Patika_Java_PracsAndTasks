package Tasks;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        int number;
        int total = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        number= input.nextInt();

        for (int i = 1;i<number;i++){
            if (number%i==0){
                total += i;
            }
        }

        if (number == total){
            System.out.println(number+" Mükemmel Sayıdır.");
        }else {
            System.out.println(number+" Mükemmel Sayı Değildir.");
        }
    }
}
