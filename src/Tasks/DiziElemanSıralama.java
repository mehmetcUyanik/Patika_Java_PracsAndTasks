package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class DiziElemanSıralama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n = input.nextInt();
        int[] numbers = new int[n];
        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i = 0; i < n; i++){
            System.out.println(i+1+". Elemanı: ");
            int number = input.nextInt();
            numbers[i]=number;
        }
        Arrays.sort(numbers);

        System.out.println("Sıralama : " + Arrays.toString(numbers));
    }
}
