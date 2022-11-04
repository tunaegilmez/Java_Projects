import java.util.Scanner;

public class OdevMain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String userName , password ;
        int bakiye = 2400 ;
        int hak = 3 ;
        int select ;

        while (hak > 0){
            System.out.print("Kullanıcı Adı : ");
            userName = scn.nextLine();
            System.out.print("Parola : ");
            password = scn.nextLine();

            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("\n----------------------");
                System.out.print("\tHOŞGELDİNİZ :)");
                System.out.println("\n----------------------");

                do {
                    System.out.println("\tİŞLEMLER");
                    System.out.println("1-Bakiye Sorgula\n" +
                            "2-Para Çek\n" +
                            "3-Para Yatır\n" +
                            "4-Çıkış");
                    System.out.print("Seçiminiz : ");
                    select = scn.nextInt();
                    switch (select){
                        case 1 :
                            System.out.println("GÜNCEL BAKİYNİZ : "+bakiye);
                            break;
                        case 2 :
                            System.out.print("ÇEKMEK İSTEDİĞİNİZ MİKTARI GİRİN : ");
                            int paraCekme = scn.nextInt();
                            bakiye -= paraCekme;
                            break;
                        case 3 :
                            System.out.print("YATIRMAK İSTEDİĞİNİZ MİKTARI GİRİN : ");
                            int paraYatirma = scn.nextInt();
                            bakiye += paraYatirma;
                            break;
                        case 4 :
                            System.out.println("Çıkış Yapılıyor...");
                            break;
                        default :
                            System.out.println("\n----------------------");
                            System.out.print("Hatalı Seçim Yaptınız.");
                            System.out.println("\n----------------------");
                    }
                }while (select != 4);
                System.out.println("\n----------------------");
                System.out.print("TEKRAR BEKLERİZ");
                System.out.println("\n----------------------");
                break;
            }else {
                hak--;
                if (hak == 0){
                    System.out.println("HESABINIZ BLOKE EDİLDİ!!!");
                }else {
                    System.out.println("HATALI KULLANICI ADI VEYA ŞİFRE!");
                    System.out.println("Kalan Hakkınız -> " + hak);
                }
            }
        }
    }
}
