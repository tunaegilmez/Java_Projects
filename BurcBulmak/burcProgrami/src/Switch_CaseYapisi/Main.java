package Switch_CaseYapisi;

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

        switch (month){
            case 1:
                if (day >= 1 && day <=31) {
                    if (day < 22){
                        constellation = "Oğlak";
                    }else {
                        constellation = "Kova";
                    }
                }else {
                    isError = true ;
                }
                break;
            case 2:
                if (day >= 1 && day <=28){
                    if (day < 20){
                        constellation = "Kova";
                    }else {
                        constellation = "Baık";
                    }
                }else {
                    isError = true ;
                }
                break;
            case 3:
                if (day >= 1 && day <=31){
                    if (day < 21){
                        constellation = "Balık";
                    }else {
                        constellation = "Koç";
                    }
                }else {
                    isError = true ;
                }
                break;
            case 4:
                if (day >= 1 && day <=30){
                    if (day < 21){
                        constellation = "Koç";
                    }else {
                        constellation = "Boğa";
                    }
                }else {
                    isError = true ;
                }
                break;
            case 5:
                if (day >= 1 && day <=31){
                    if (day < 22){
                        constellation = "Boğa";
                    }else {
                        constellation = "İkizler";
                    }
                }else {
                    isError = true ;
                }
                break;
            case 6:
                if (day >= 1 && day <=30){
                    if (day < 23){
                        constellation = "İkizler";
                    }else {
                        constellation = "Yengeç";
                    }
                }else {
                    isError = true ;
                }
                break;
            case 7:
                if (day >= 1 && day <=30){
                    if (day < 23){
                        constellation = "Yengeç";
                    }else {
                        constellation = "Aslan";
                    }
                }else {
                    isError = true ;
                }
                break;
            case 8:
                if (day >= 1 && day <=31){
                    if (day < 23){
                        constellation = "Aslan";
                    }else {
                        constellation = "Başak";
                    }
                }else {
                    isError = true ;
                }
                break;
            case 9:
                if (day >= 1 && day <=30){
                    if (day < 23){
                        constellation = "Başak";
                    }else {
                        constellation = "Terazi";
                    }
                }else {
                    isError = true ;
                }
                break;
            case 10:
                if (day >= 1 && day <=31){
                    if (day < 23){
                        constellation = "Terazi";
                    }else {
                        constellation = "Akrep";
                    }
                }else {
                    isError = true ;
                }
                break;
            case 11:
                if (day >= 1 && day <=30){
                    if (day < 22){
                        constellation = "Akrep";
                    }else {
                        constellation = "Yay";
                    }
                }else {
                    isError = true ;
                }
                break;
            case 12:
                if (day >= 1 && day <=31){
                    if (day < 22){
                        constellation = "Yay";
                    }else {
                        constellation = "Oğlak";
                    }
                }else {
                    isError = true ;
                }
                break;
            default:
                isError = true ;
        }

        if (isError){
            System.out.println("Hatalı giriş yapıldı");
        }else {
            System.out.println("burcunuz :" + constellation);
        }
    }
}
