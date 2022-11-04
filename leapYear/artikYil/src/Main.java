import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil ;
        boolean isError ;

        Scanner scn = new Scanner(System.in);

        System.out.println("Yıl girin : ");
        yil = scn.nextInt();

        if (yil % 4 == 0){
            if(yil % 100 == 0){
                if (yil % 400 == 0){
                    isError = true ;
                }else {
                    isError = false ;
                }
            }else {
                isError = true ;
            }
        }else {
            isError = false ;
        }

        if(isError){
            System.out.println(yil + " bir artık yıldır.");
        }else {
            System.out.println(yil + " artık yıl değildir.");
        }
    }
}
