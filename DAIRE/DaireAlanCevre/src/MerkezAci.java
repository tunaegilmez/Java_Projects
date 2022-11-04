import java.util.Scanner;

public class MerkezAci {
    public static void main(String[] args) {
        int r , merkezAci ;
        double pi = 3.14 ;
        Scanner giris = new Scanner(System.in);

        System.out.print("Yarı çap değerini giriniz : ");
        r = giris.nextInt();

        System.out.print("Merkez açı değerini giriniz : ");
        merkezAci = giris.nextInt();

        double alan = (pi * (r*r) * merkezAci) / 360 ;

        System.out.println("ALAN : " + alan);
    }
}
