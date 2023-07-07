package Pracs;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        String userName,password,select,newPassword;
        select="";

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName=input.nextLine();

        System.out.print("Şifreniz : ");
        password=input.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız.");
        }else if (userName.equals("patika") && !(password.equals("java123"))){
            System.out.println("Şireniz Yanlış.");
            System.out.println("Şifenizi Sıfırlamak İster Misiniz? \n1-Evet\n2-Hayır");
            select = input.nextLine();
        }else {
            System.out.println("Kullanıcı Adı Yanlış.");
        }
        if (select.equals("1")){
            System.out.println("Yeni Bir Şifre Giriniz : ");
            newPassword= input.nextLine();

            if (newPassword.equals("java123")) {
                System.out.println("Şifre Oluşturulamadı, Lütfen Başka Şifre Giriniz.");
            }else{
                System.out.println("Şifre Oluşturuldu.");
            }
        }
    }
}
