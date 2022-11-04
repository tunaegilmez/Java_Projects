import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int bakiye = 1500 ;
        int select ;
        int hak = 3 ;
        String userName , password ;

        while (hak > 0){
            System.out.print("Kullanıcı Adı : ");
            userName = scn.nextLine();
            System.out.print("Şifre : ");
            password = scn.nextLine();

            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("\n-------------------");
                System.out.println("\tHOŞGELDİNİZ");
                System.out.println("-------------------");
                do {
                    System.out.println("\tİŞLEMLER");
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış Yap");
                    System.out.print("Seçiminiz : ");
                    select = scn.nextInt();
                    if (select == 1){
                        System.out.print("Yatırmak istediğiniz miktar : ");
                        int paraYatirma = scn.nextInt();
                        bakiye += paraYatirma ;
                    } else if (select == 2) {
                        System.out.println("Çekmek istediğiniz miktar : ");
                        int paraCekme = scn.nextInt();
                        if (paraCekme > bakiye){
                            System.out.println("\tYETERSİZ BAKİYE!");
                        }else {
                            bakiye -= paraCekme;
                        }
                    } else if (select == 3) {
                        System.out.println("Güncel Bakiyeniz : "+bakiye);
                    }else if (select == 4){
                        System.out.println("ÇIKIŞ YAPILIYOR...");
                    }else {
                        System.out.println("----Yanlış Seçim Yaptınız----");
                    }
                }while (select != 4);
                System.out.println("Tekrar Görüşmek Üzere.");
                break;
            }else {
                hak--;
                System.out.println("Kullanıcı adı veya şifre yanlış !");
                if (hak == 0){
                    System.out.println("Hesap bloke edildi !!!");
                }else {
                    System.out.println("Kalan hakkınız : "+ hak);
                }
            }
        }
    }
}
