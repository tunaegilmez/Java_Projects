import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int toplam = 0 ;

        System.out.println("Sayı : ");
        int num = scn.nextInt();

        for (int i = 1 ; i < num ; i++){
            if (num % i == 0){
                toplam += i ;
            }
        }
        if (toplam == num){
            System.out.println(num + " Bir Mümmel Sayıdır");
        }else {
            System.out.println(num + " Bir Mümmel Sayı Değildir !");
        }
    }
}
