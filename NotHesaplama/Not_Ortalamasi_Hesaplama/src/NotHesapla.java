import java.util.Scanner;

public class NotHesapla {
    public static void main(String[] args) {
        // Değişken oluşturma .
        int mat , fzk , kim , turk , tarih , muzik ;

        // Scanner sınıfı tanımlama .
        Scanner scn = new Scanner(System.in);

        // Kullanıcıdan verileri alma .
        System.out.print("Matematik Notunuz : ");
        mat = scn.nextInt();

        System.out.print("Fizik Notunuz : ");
        fzk = scn.nextInt();

        System.out.print("Kimya Notunuz : ");
        kim = scn.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turk = scn.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = scn.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = scn.nextInt();

        double ortalama = (mat + fzk + kim + turk + tarih +muzik) / 6.0 ;

        System.out.println("Genel Not Ortalamanız : " + ortalama);

        // Sınıfı geçme - kalma durumu .
        String str = ortalama >= 60 ? "-> Sınıfı Geçti" : "-> Sınıfta Kaldı" ;
        System.out.println(str);
    }
}
