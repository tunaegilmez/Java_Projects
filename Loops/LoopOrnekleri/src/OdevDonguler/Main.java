package OdevDonguler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int sayac= 0 , sayi , toplam = 0;
        int ortalama ;

        System.out.println("Sayi : ");
        sayi = scn.nextInt();

        System.out.println("\t***0 ve "+sayi+"arasındaki 3'e ve 4'e bölünen sayılar***");

        for (int i = 0 ; i <= sayi ; i++){
            if (i % 3 == 0 && i % 4 == 0){
                sayac++;
                System.out.println(i);

                toplam += i ;
            }
        }
        ortalama = toplam / sayac ;

        System.out.println("Bu sayıların ortalaması : " + ortalama);
    }
}
