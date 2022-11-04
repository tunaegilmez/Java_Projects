import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km , age , yolculukTipi ;
        double normalTutar , yasIndirimi = 0 , gidisDonusIndirim = 0 , toplamTutar ;
        boolean isError = false ;

        Scanner scn = new Scanner(System.in);

        System.out.print("KM tründen mesafeyi giriniz : ");
        km = scn.nextInt();
        if (km <= 0){
            isError = true ;
        }

        System.out.print("Yaşınızı giriniz : ");
        age = scn.nextInt();
        if (age <= 0){
            isError = true ;
        }

        System.out.println("Yolculuk tipini seçiniz.\n\t1=>Tek Yön\n\t2=>Gidiş Dönüş");
        yolculukTipi = scn.nextInt();
        if (yolculukTipi != 1 && yolculukTipi != 2){
            isError = true ;
        }

        normalTutar = km * 0.10 ;

        if (age <= 12){
            yasIndirimi = normalTutar * 0.50 ;
        } else if (age < 24) {
            yasIndirimi = normalTutar * 0.10 ;
        } else if (age >= 65) {
            yasIndirimi = normalTutar * 0.30 ;
        }else {
            yasIndirimi = 0 ;
        }

        double indirimliTutar = normalTutar - yasIndirimi ;

        if (yolculukTipi == 2){
            gidisDonusIndirim = indirimliTutar * 0.20 ;
            toplamTutar = (indirimliTutar - gidisDonusIndirim) * 2 ;
        }else {
            toplamTutar = indirimliTutar ;
        }


        if (isError){
            System.out.println("Hatalı Giriş Yaptınız!");
        }else {
            System.out.println("Toplam Tutar : " + toplamTutar + "TL");
        }
    }
}
