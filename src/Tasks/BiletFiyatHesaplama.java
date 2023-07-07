package Tasks;

import java.util.Scanner;

public class BiletFiyatHesaplama {
    public static void main(String[] args) {
        int distance, age, tripType;
        double perDistanceCost = 0.10;

        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz : ");
        distance = input.nextInt();

        System.out.println("Yaşınızı giriniz : ");
        age = input.nextInt();

        System.out.println("Yolculuk tipini giriniz (1-> Tek Yön , 2-> Gidiş-Dönüş) : ");
        tripType=input.nextInt();

        double cost = distance * perDistanceCost;

        if((distance > 0) && (age > 0) && (tripType ==1 || tripType ==2)){
            if(age < 12){
                cost -=(cost*0.50);
            }else if (age <=24){
                cost -=(cost*0.10);
            }else if(age > 65){
                cost -=(cost*0.30);
            }
        }else{
            System.out.println("Hatalı Veri Girdiniz!");
        }

        if (tripType == 2){
            cost -=(cost*0.20);
            cost *= 2;
        }

        System.out.println("Toplam Tutar : "+cost+" TL");

    }
}
