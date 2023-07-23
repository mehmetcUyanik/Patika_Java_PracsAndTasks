package Pracs;

import java.util.Scanner;

public class PalindromeKelime {


    static boolean isPalindrome(String str) {

        StringBuffer str2 = new StringBuffer(str);
        str2.reverse();
        String str3 = str2.toString();

        if (str.equals(str3)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Palindrome kontrolu için kelime giriniz : ");
        String word=input.nextLine();

        if (isPalindrome(word)){
            System.out.println(word+" kelimesi palindrome bir kelimedir.");
        }else {
            System.out.println(word+" kelimesi palindrome bir kelime değildir.");
        }

    }
}

