package Tasks;

import java.util.Scanner;

public class UsAlma {

    static int pow(int a, int b) {
        if(b==0) {
            return 1;
        }
        else {
            return a * pow(a,b-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag=true;

        while (flag) {
            System.out.println("Taban Değeri : ");
            int x= input.nextInt();
            System.out.println("Üs : ");
            int y = input.nextInt();
            System.out.println("Sonuç : " + pow(x, y));

            System.out.println("1-Yeni işlem\n2-Çıkış yap");
            int choice = input.nextInt();

            if(choice == 2){
                System.out.println("Çıkış Yapıldı...");
                flag=false;
            }
        }
    }
}


