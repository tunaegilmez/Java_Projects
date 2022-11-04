import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int degree ;

        Scanner scn = new Scanner(System.in);

        System.out.print("How many degrees weather today :");
        degree = scn.nextInt();

        if(degree < 5){
            System.out.println("Let's ski today.");
        } else if (degree <= 25) {
            if(degree <= 15){
                System.out.println("Let's go to cinema today.");
            }
            if (degree >= 10){
                System.out.println("Let's go on a picnic today.");
            }
        }else {
            System.out.println("Let's go swimming today.");
        }
    }
}
