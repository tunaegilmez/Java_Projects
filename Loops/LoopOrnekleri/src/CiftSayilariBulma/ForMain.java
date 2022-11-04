package CiftSayilariBulma;

import java.util.Scanner;

public class ForMain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Sayi : ");
        int sayi = scn.nextInt();
        for (int i = 0 ; i <= sayi ; i+=2){
            System.out.println(i);
        }
    }
}
