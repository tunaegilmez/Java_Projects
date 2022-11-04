import java.util.Scanner;

public class OdevMain {
    public static void main(String[] args) {

//Bir sayının basamak sayılarının toplamını hesaplayan program.

        Scanner scn = new Scanner(System.in);

        int sum = 0 , adet = 0 ;

        System.out.println("Sayi : ");
        int num = scn.nextInt();

        while (num != 0){
            sum = (num % 10 ) + sum ;
            num /= 10 ;
            adet++;
        }
        System.out.println("Basamak toplamı : "+ sum);
    }
}
