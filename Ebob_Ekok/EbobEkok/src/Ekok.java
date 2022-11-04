import java.util.Scanner;

public class Ekok {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int ekok;

        System.out.print("n1 Sayısı : ");
        int n1 = scn.nextInt();
        System.out.print("n2 Sayısı : ");
        int n2 = scn.nextInt();


        for (int i = 1 ; i <= (n1*n2) ; i++){
            if (i % n1 == 0 && i % n2 == 0){
                ekok = i ;
                System.out.println(ekok);
                break;
            }
        }
    }
}
