import java.util.Scanner;

public class Main {

    static int usAlma(int num , int n){
        if (n == 0){
            return 1;
        }
        return num * usAlma(num , n - 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Sayı : ");
        int num = scn.nextInt();
        System.out.print("Üs değeri : ");
        int n = scn.nextInt();
        System.out.println(usAlma(num,n));
    }
}
