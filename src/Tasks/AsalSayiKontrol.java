package Tasks;

import java.util.Scanner;

public class AsalSayiKontrol {


    static boolean isPrime(int n, int i) {

        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)

            return true;

        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sayı Giriniz : ");
        int num = input.nextInt();

        if (isPrime(num, 2)) {
            System.out.println(num + " sayısı asaldır.");
        }else{
            System.out.println(num + " sayısı asal değildir.");
        }
    }
}



