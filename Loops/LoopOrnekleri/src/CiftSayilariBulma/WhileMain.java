package CiftSayilariBulma;

import java.util.Scanner;

public class WhileMain {
    public static void main(String[] args) {
        int sayi , i = 0 ;

        Scanner scn = new Scanner(System.in);

        System.out.print("Sayi : ");
        sayi = scn.nextInt();

        while (i <= sayi){
            System.out.println(i);
            i+=2 ;
        }
    }
}
