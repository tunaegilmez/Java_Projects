package Ödev;

import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        double kdvOran = 0.18 , miktar , kdvTutar , kdvliTutar ;

        System.out.print("KDV'sini görmek istediğiniz tutar : ");
        miktar = scn.nextDouble();

        kdvTutar = miktar * kdvOran ;
        kdvliTutar = miktar + kdvTutar ;

        System.out.println("KDV'siz Tutar : " + miktar);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV'li Tutar : " + kdvliTutar);
    }
}
