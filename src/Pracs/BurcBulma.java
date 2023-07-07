package Pracs;

import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int month,day;
        String zodiac="";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Doğduğunuz ay : ");
        month=input.nextInt();

        System.out.println("Doğduğunuz gün : ");
        day=input.nextInt();

        switch (month){
            case 1:
                if (day >= 1 && day <=31){
                    if(day< 22){
                        zodiac = "Oğlak";
                    }else {
                        zodiac = "Kova";
                    }
                }else {
                    isError=true;
                }
                break;
            case 2:
                if (day >= 1 && day <=28){
                    if(day< 22){
                        zodiac = "Kova";
                    }else {
                        zodiac = "Balık";
                    }
                }else {
                    isError=true;
                }
                break;
            case 3:
                if (day >= 1 && day <=31){
                    if(day< 21){
                        zodiac = "Balık";
                    }else {
                        zodiac = "Koç";
                    }
                }else {
                    isError=true;
                }
                break;
            case 4:
                if (day >= 1 && day <=30){
                    if(day< 21){
                        zodiac = "Koç";
                    }else {
                        zodiac = "Boğa";
                    }
                }else {
                    isError=true;
                }
                break;
            case 5:
                if (day >= 1 && day <=31){
                    if(day< 22){
                        zodiac = "Boğa";
                    }else {
                        zodiac = "İkizler";
                    }
                }else {
                    isError=true;
                }
                break;
            case 6:
                if (day >= 1 && day <=30){
                    if(day< 23){
                        zodiac = "İkizler";
                    }else {
                        zodiac = "Yengeç";
                    }
                }else {
                    isError=true;
                }
                break;
            case 7:
                if (day >= 1 && day <=31){
                    if(day< 23){
                        zodiac = "Yengeç";
                    }else {
                        zodiac = "Aslan";
                    }
                }else {
                    isError=true;
                }
                break;
            case 8:
                if (day >= 1 && day <=31){
                    if(day< 23){
                        zodiac = "Aslan";
                    }else {
                        zodiac = "Başak";
                    }
                }else {
                    isError=true;
                }
                break;
            case 9:
                if (day >= 1 && day <=30){
                    if(day< 23){
                        zodiac = "Başak";
                    }else {
                        zodiac = "Terazi";
                    }
                }else {
                    isError=true;
                }
                break;
            case 10:
                if (day >= 1 && day <=31){
                    if(day< 23){
                        zodiac = "Terazi";
                    }else {
                        zodiac = "Akrep";
                    }
                }else {
                    isError=true;
                }
                break;
            case 11:
                if (day >= 1 && day <=30){
                    if(day< 22){
                        zodiac = "Akrep";
                    }else {
                        zodiac = "Yay";
                    }
                }else {
                    isError=true;
                }
                break;
            case 12:
                if (day >= 1 && day <=31){
                    if(day< 22){
                        zodiac = "Yay";
                    }else {
                        zodiac = "Oğlak";
                    }
                }else {
                    isError=true;
                }
                break;

                }
                if(isError){
                    System.out.println("Hatalı giriş yaptınız.");
                }else{
                    System.out.println("Burcunuz : "+zodiac);
                }
        }
    }

