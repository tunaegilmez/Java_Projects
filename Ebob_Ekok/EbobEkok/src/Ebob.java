import java.util.Scanner;

public class Ebob {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int ebob;

        System.out.print("n1 Sayısı : ");
        int n1 = scn.nextInt();
        System.out.print("n2 Sayısı : ");
        int n2 = scn.nextInt();

        if (n1 < n2){
            for (int i = n1 ; i >= 1 ; i--){
                if (n1 % i == 0 && n2 % i == 0){
                    ebob = i ;
                    System.out.println(ebob);
                    break;
                }
            }
        } else if (n2 < n1) {
            for (int i = n2 ; i >= 1 ; i--){
                if (n1 % i == 0 && n2 % i == 0){
                    ebob = i ;
                    System.out.println("Ebob = "+ebob);
                    break;
                }
            }
        }else {
            System.out.println("Eşit SAyılar");
        }
    }
}
