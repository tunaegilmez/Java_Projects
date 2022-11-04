package Ödev;

import java.util.Scanner;

public class VucutKitleHesaplama {
    public static void main(String[] args) {
        double boy , kg ;

        Scanner scn = new Scanner(System.in);

        System.out.print("Boyunuzu ( metre ) Giriniz : ");
        boy = scn.nextDouble();

        System.out.print("Kilonuzu Giriniz : ");
        kg = scn.nextDouble();

        double sonuc = kg / (boy * boy) ;

        System.out.println("Vücut Kitle İndeksiniz : " + sonuc);
    }
}
