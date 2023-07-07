package Pracs;

import java.util.Scanner;

public class UcVeDortKatlari {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Sayı Giriniz : ");
        number= input.nextInt();

        for (int i=1;i <=number;i++){
            if (i%3==0 && i%4==0){
                System.out.println(i);
            }
        }
    }
}
