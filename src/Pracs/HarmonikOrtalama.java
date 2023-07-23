package Pracs;

public class HarmonikOrtalama {
    public static void main(String[] args) {


        double numsArr[] = {1,2,3,4,5,6};

        double sum = 0.0;
        for (int i = 0; i < numsArr.length; i++) {
            sum += 1.0 / numsArr[i];
        }

        double harmonicMean = numsArr.length / sum;
        System.out.println("Dizinin harmonik ortalaması :" + harmonicMean);
    }
}
