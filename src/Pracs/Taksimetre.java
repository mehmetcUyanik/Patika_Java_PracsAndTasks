package Pracs;

import java.util.Scanner;

public class Taksimetre {

    public static void main(String[] args) {

        int km;
        double perKM = 2.20;
        double total = 10;

        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi giriniz : ");
        km= input.nextInt();

        total += (km * perKM);

        if(total < 20){
            total = 20;
            System.out.println(total);
        }else {
            System.out.println(total);
        }


    }
}
