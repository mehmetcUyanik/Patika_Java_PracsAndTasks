package Tasks;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int birthYear;
        String zodiac;

        Scanner input=new Scanner(System.in);

        System.out.println("Doğum Yılınızı Giriniz : ");
        birthYear= input.nextInt();

        if (birthYear%12==0){
            zodiac="Maymun";
        }else if (birthYear%12==1){
            zodiac="Horoz";
        }else if (birthYear%12==2){
            zodiac="Köpek";
        }else if (birthYear%12==3){
            zodiac="Domuz";
        }else if (birthYear%12==4){
            zodiac="Fare";
        }else if (birthYear%12==5){
            zodiac="Öküz";
        }else if (birthYear%12==6){
            zodiac="Kaplan";
        }else if (birthYear%12==7){
            zodiac="Tavşan";
        }else if (birthYear%12==8){
            zodiac="Ejderha";
        }else if (birthYear%12==9){
            zodiac="Yılan";
        }else if (birthYear%12==10){
            zodiac="At";
        }else{
            zodiac="Koyun";
        }

        System.out.println("Çin Zodyağı Burcunuz : "+zodiac);

    }
}
