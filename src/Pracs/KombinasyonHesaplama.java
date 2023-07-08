package Pracs;

import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {

        int n,r;
        int rTotal=1;
        int nTotal=1;
        int xTotal=1;

        Scanner input = new Scanner(System.in);
        System.out.println("Eleman sayısı giriniz (n) : ");
        n=input.nextInt();

        System.out.println("Seçim sayısı giriniz (r) : ");
        r= input.nextInt();

        int x = n-r;

        for (int i=1; i<=n; i++){
            nTotal= nTotal * i;
        }

        for (int i=1; i<=r; i++){
            rTotal= rTotal * i;
        }

        for (int i=1; i<=x; i++){
            xTotal= xTotal * i;
        }

        int result = nTotal / (rTotal * xTotal);

        System.out.println("C("+n+","+r+") = "+result);

    }
}
