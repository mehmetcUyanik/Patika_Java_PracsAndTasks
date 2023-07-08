package Pracs;

import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {

        int n,k;
        int total = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Üssü alınacak sayı :");
        n= input.nextInt();

        System.out.println("Üs olacak sayı :");
        k= input.nextInt();

        for(int i=1;i<=k;i++){
            total *= n;
        }

        System.out.println("Sonuç : "+total);
    }
}
