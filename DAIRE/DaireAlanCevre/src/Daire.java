import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        int  r ;
        double pi = 3.14 ;
        Scanner scn = new Scanner(System.in);

        System.out.print("Yarı çap uzunluğu giriniz : ");
        r = scn.nextInt();

        double alan = pi * r * r ;
        double cevre = 2 * pi * r ;

        System.out.println("ALAN : "+alan);
        System.out.println("ÇEVRE : "+cevre);
    }
}
