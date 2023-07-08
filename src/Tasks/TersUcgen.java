package Tasks;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {

        int number,i, j;

        Scanner input = new Scanner(System.in);

        System.out.println("Ters Üçgen Modeli İçin Satır Sayısı Giriniz :");
        number= input.nextInt();


        for(i = number; i >= 1; i--){
            for(j = i; j < number; j++){
                System.out.print(" ");
            }
            for(j = 1; j <= (2 * i - 1); j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
