import java.util.Scanner;

public class OdevMain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int ebob ;
        int ekok ;

        System.out.print("n1 Sayısı : ");
        int n1 = scn.nextInt();
        System.out.print("n2 Sayısı : ");
        int n2 = scn.nextInt();

        if (n1 < n2){
            int i = n1 ;
            while (i >= 1){
                if (n1 % i == 0 && n2 % i == 0){
                    ebob = i ;
                    System.out.println("Ebob = " + ebob);
                    break;
                }
                i--;
            }
        } else if (n2 < n1) {
            int i = n2 ;
            while (i >= 1){
                if (n1 % i == 0 && n2 % i == 0){
                    ebob = i ;
                    System.out.println("Ebob = " + ebob);
                    break;
                }
                i--;
            }
        }else {
            System.out.println("Eşit SAyılar");
        }

        int k = 1 ;
        while (k <= n1*n2){
            if (k % n1 == 0 && k % n2 == 0){
                ekok = k ;
                System.out.println("Ekok = "+ekok);
                break;
            }
            k++;
        }
    }
}
