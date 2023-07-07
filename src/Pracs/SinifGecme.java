package Pracs;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {

        double math, music, chemistry, physics, turk, valid = 0, average, validNumber = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunu dahil ediniz: ");
        math = inp.nextDouble();
        if (math>=0 && math<=100) {
            valid +=math;
            ++validNumber;
        }

        System.out.print("Kimya notunu dahil ediniz: ");
        chemistry = inp.nextDouble();
        if (chemistry>=0 && chemistry<=100) {
            valid +=chemistry;
            ++validNumber;
        }

        System.out.print("Fizik notunu dahil ediniz: ");
        physics = inp.nextDouble();
        if (physics>=0 && physics<=100) {
            valid +=physics;
            ++validNumber;
        }

        System.out.print("Müzik notunu dahil ediniz: ");
        music = inp.nextDouble();
        if (music>=0 && music<=100) {
            valid +=music;
            ++validNumber;
        }

        System.out.print("Türkçe notunu dahil ediniz: ");
        turk = inp.nextDouble();
        if (turk>=0 && turk<=100) {
            valid +=turk;
            ++validNumber;
        }

        average = valid/validNumber;

        if (average>=55){
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        }
        else {
            System.out.println("Sınıfta kaldınız.");
        }
        System.out.println("Ortalamanız: " + average);
    }
}
