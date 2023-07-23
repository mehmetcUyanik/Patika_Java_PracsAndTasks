package Pracs;

import java.util.Arrays;
import java.util.Scanner;

public class DiziMaxMinBulma {
    public static void main(String[] args) {

        int[] numsList = {15,12,788,1,-1,-778,2,0};
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayi giriniz :");
        int inputNumber = inp.nextInt();
        int min = inputNumber;
        int max = inputNumber;
        Arrays.sort(numsList);


        for (int nums: numsList){
            if (nums > inputNumber){
                max = nums;
                break;
            }
        }

        for (int i = numsList.length-1; i >= 0; i--){
            if (numsList[i] < inputNumber){
                min = numsList[i];
                break;
            }
        }

        System.out.println("Dizi : "+Arrays.toString(numsList));
        System.out.println("Girilen Sayı : "+inputNumber);
        System.out.println("Girilen sayıdan küçük en yakın sayı :" +min);
        System.out.println("Girilen sayıdan büyük en yakın sayı :" +max);
    }
}
