package Ödev;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        /*  Armut : 2,14 TL
            Elma : 3,67 TL
            Domates : 1,11 TL
            Muz: 0,95 TL
            Patlıcan : 5,00 TL  */

        double armut = 2.14 , elma = 3.67 , domates = 1.11 , muz = 0.95 , patlıcan = 5.00 ;
        double armutKg , elmaKg , domatesKg , muzKg , patlıcanKG ;
        Scanner scn = new Scanner(System.in);

        System.out.print("Armut kilo : ");
        armutKg = scn.nextDouble();

        System.out.print("Elma kilo : ");
        elmaKg = scn.nextDouble();

        System.out.print("Domates kilo : ");
        domatesKg = scn.nextDouble();

        System.out.print("Muz kilo : ");
        muzKg = scn.nextDouble();

        System.out.print("Patlıcan kilo : ");
        patlıcanKG = scn.nextDouble();

        double toplamFiyat = (armut * armutKg) + (elma * elmaKg) + (domates * domatesKg) + (muz * muzKg) + (patlıcan * patlıcanKG) ;

        System.out.println("Toplam Alışveriş Tutarı : " + toplamFiyat + "TL");
    }
}
