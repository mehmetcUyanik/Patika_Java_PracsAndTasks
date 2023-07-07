package Pracs;

import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık Değerini Giriniz : ");
        heat=input.nextInt();

        if (heat<5){
            System.out.println("Kayak yapabilirsin.");
        }else if(heat <= 25){
            if(heat<=15){
                System.out.println("Sinemaya gideblirsin.");
            }if (heat >= 10){
                System.out.println("Pikniğe gidebilirsin.");
            }
        }else {
            System.out.println("Yüzmeye gidebilirsin.");
        }
    }
}
