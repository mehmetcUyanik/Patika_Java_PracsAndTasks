package Tasks;

import java.util.Scanner;

public class MinMaxBulma {
    public static void main(String[] args) {

        int nums, number;

        Scanner input= new Scanner(System.in);

        System.out.println("Kaç Tane Sayı Gireceksiniz :");
        nums=input.nextInt();

        System.out.println("1.Sayıyı Giriniz :");
        number=input.nextInt();

        int max=number;
        int min=number;

        for (int i=2;i<=nums;i++){
            System.out.println(i + ".Sayıyı Giriniz : ");
            number=input.nextInt();

            if (number > max){
                max = number;
            }else if (number < min){
                min = number;
            }

        }

        System.out.println("En Büyük Sayı : "+max);
        System.out.println("En Küçük Sayı : "+min);

    }
}
