import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        int mat , turk , kim , fiz , muzik , i=0 , notlarTop = 0 ;
        double avarage ;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();
        if(mat>=0 && mat<=100) {
            notlarTop += mat;
            i++;
        }

        System.out.println("Fizik notunuz : ");
        fiz = input.nextInt();
        if (fiz>=0 && fiz<=100) {
            notlarTop += fiz ;
            i++;
        }

        System.out.print("Türkçe notunuz : ");
        turk = input.nextInt();
        if (turk>=0 && turk<=100) {
            notlarTop += turk ;
            i++;
        }

        System.out.println("Kimya notunuz : ");
        kim = input.nextInt();
        if (kim>=0 && kim<=100) {
            notlarTop += kim ;
            i++;
        }

        System.out.println("Müzik notunuz : ");
        muzik = input.nextInt();
        if (muzik>=0 && muzik<=100) {
            notlarTop += muzik ;
            i++;
        }

        avarage = notlarTop / i ;
        if(avarage<55){
            System.out.println("Sınıfta kaldınız!");
        }
        else {
            System.out.println("Teblikler ! Sınıfı geçtiniz");
        }

        System.out.println("Ortalamanız : "+ avarage);
    }
}
