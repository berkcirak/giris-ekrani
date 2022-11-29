package com.company;

import javax.management.StringValueExp;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kullaniciadigercek = "berkcirak";
        String parolagercek = "15042002";
        System.out.println("kullanici adini giriniz: ");
        String kullaniciadi = scan.nextLine();
        System.out.println("parolayi giriniz: ");
        String parola = scan.nextLine();
        if (!(kullaniciadigercek.equals(kullaniciadi)) && !(parolagercek.equals(parola)))
        {
            System.out.println("kullanici adi ve sifre yanlis");
        }
        else if ( (kullaniciadi.equals(kullaniciadigercek)) && !(parola.equals(parolagercek)))
        {
            System.out.println("parola yanlis");
        }
        else if ( !(kullaniciadi.equals(kullaniciadigercek)) && (parola.equals(parolagercek)))
        {
            System.out.println("kullanici adi yanlis");
        }
        else
        {
            System.out.println("giris basarili");
        }

    }
}
