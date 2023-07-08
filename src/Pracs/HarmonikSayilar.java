package Pracs;

import java.util.Scanner;

public class HarmonikSayilar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("N Sayısını giriniz : ");
        int n = input.nextInt();

        double result = 0;

        for (int i=1;i<=n;i++){
            result+=(1.0/i);
        }

        System.out.println(result);
    }
}
