package If_ElseYapisi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month , day ;
        String constellation = "";
        boolean isError = false ;

        Scanner scn = new Scanner(System.in);

        System.out.println("Doğduğunuz ay :");
        month = scn.nextInt();
        System.out.println("Doğduğunuz gün :");
        day = scn.nextInt();

        if (month == 1) {
            if (day >= 1 && day <=31) {
                if (day < 22){
                    constellation = "Oğlak";
                }else {
                    constellation = "Kova";
                }
            }else {
                isError = true ;
            }
        } else if (month == 2) {
            if (day >= 1 && day <=28){
                if (day < 20){
                    constellation = "Kova";
                }else {
                    constellation = "Baık";
                }
            }else {
                isError = true ;
            }
        } else if (month == 3) {
            if (day >= 1 && day <=31){
                if (day < 21){
                    constellation = "Balık";
                }else {
                    constellation = "Koç";
                }
            }else {
                isError = true ;
            }
        } else if (month == 4) {
            if (day >= 1 && day <=30){
                if (day < 21){
                    constellation = "Koç";
                }else {
                    constellation = "Boğa";
                }
            }else {
                isError = true ;
            }
        } else if (month == 5) {
            if (day >= 1 && day <=31){
                if (day < 22){
                    constellation = "Boğa";
                }else {
                    constellation = "İkizler";
                }
            }else {
                isError = true ;
            }
        } else if (month == 6) {
            if (day >= 1 && day <=30){
                if (day < 23){
                    constellation = "İkizler";
                }else {
                    constellation = "Yengeç";
                }
            }else {
                isError = true ;
            }
        } else if (month == 7) {
            if (day >= 1 && day <=30){
                if (day < 23){
                    constellation = "Yengeç";
                }else {
                    constellation = "Aslan";
                }
            }else {
                isError = true ;
            }
        } else if (month == 8) {
            if (day >= 1 && day <=31){
                if (day < 23){
                    constellation = "Aslan";
                }else {
                    constellation = "Başak";
                }
            }else {
                isError = true ;
            }
        } else if (month == 9) {
            if (day >= 1 && day <=30){
                if (day < 23){
                    constellation = "Başak";
                }else {
                    constellation = "Terazi";
                }
            }else {
                isError = true ;
            }
        } else if (month == 10) {
            if (day >= 1 && day <=31){
                if (day < 23){
                    constellation = "Terazi";
                }else {
                    constellation = "Akrep";
                }
            }else {
                isError = true ;
            }
        } else if (month == 11) {
            if (day >= 1 && day <=30){
                if (day < 22){
                    constellation = "Akrep";
                }else {
                    constellation = "Yay";
                }
            }else {
                isError = true ;
            }
        }else if (month == 12){
            if (day >= 1 && day <=31){
                if (day < 22){
                    constellation = "Yay";
                }else {
                    constellation = "Oğlak";
                }
            }else {
                isError = true ;
            }
        }else {
            isError = true ;
        }

        if (isError){
            System.out.println("Hatalı giriş yapıldı");
        }else {
            System.out.println("burcunuz :" + constellation);
        }
    }
}
