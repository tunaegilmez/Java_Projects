import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Sayi : ");
        int num = scn.nextInt();
        int basNumber = 0;
        int tempNumber=num;
        int basValue;
        int result = 0 ;
        int basPow;

        while (tempNumber != 0){
            tempNumber /= 10 ;
            basNumber++;
        }
        tempNumber=num;
        while (tempNumber != 0){
            basValue = tempNumber % 10 ;
            basPow = 1;
            for (int i = 1 ; i <= basNumber ; i++){
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10 ;
        }

        if (result == num){
            System.out.println(num + " Sayısı bir Amstrong sayıdır.");
        }else {
            System.out.println(num + " Sayısı bir Amstrong sayı değildir !");
        }
    }
}
