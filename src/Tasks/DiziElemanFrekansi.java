package Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiziElemanFrekansi {
    public static void main(String[] args) {


        int[] numbers = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicateNumbers = new int[numbers.length];
        Arrays.fill(duplicateNumbers,-1);


        for (int i=0;i<numbers.length;i++){
            int counter = 1;
            boolean isDuplicate = false;
            for (int j=i+1;j< numbers.length;j++){
                if (numbers[i] == numbers[j]){
                    duplicateNumbers[j]=0;
                    counter++;
                }
            }
            if (duplicateNumbers[i] != 0){
                duplicateNumbers[i] = counter;
            }

        }
        System.out.println("Dizi : "+Arrays.toString(numbers));
        System.out.println("Tekrar Sayıları");
        for (int i=0;i< duplicateNumbers.length;i++){
            if (duplicateNumbers[i] !=0 ){
                System.out.println(numbers[i]+" sayısı "+duplicateNumbers[i]+" kere tekrar edildi.");
            }
        }
    }
}
