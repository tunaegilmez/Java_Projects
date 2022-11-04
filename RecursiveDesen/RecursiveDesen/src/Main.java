import java.util.Scanner;

public class Main {
    static int eksilme(int num){
        if (num <= 0){
            return num;
        }

        System.out.print(num+" ");
        return eksilme(num -5);
    }
    static int arttirma(int num , int i){
        if (num > i){
            return num;
        }

        System.out.print(num + " ");
        return arttirma(num + 5,i);
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Sayı : ");
        int num = scn.nextInt();

        arttirma(eksilme(num),num);
    }
}
