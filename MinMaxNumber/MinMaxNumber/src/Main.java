import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int min = 0 , max = 0 ;

        System.out.print("Kaç Sayı Giriceksiniz : ");
        int adet = scn.nextInt();

        for (int i = 1 ; i <= adet ; i++){
            System.out.print(i+". Sayı : ");
            int num = scn.nextInt();

            if (i == 1){
                min = num ;
                max = num ;
            }else {
                if (num > max){
                    max = num ;
                }
                if (num < min){
                    min = num ;
                }
            }
        }
        System.out.println("EN KÜÇÜK SAYI : " + min);
        System.out.println("EN BÜYÜK SAYI : " + max);
    }
}
