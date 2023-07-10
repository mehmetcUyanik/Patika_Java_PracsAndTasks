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

            System.out.println("Taban Değeri :");
            int x = input.nextInt();
            System.out.println("Üs Değeri :");
            int y = input.nextInt();
            System.out.println("Sonuç : " + pow(x, y));

        }
    }


