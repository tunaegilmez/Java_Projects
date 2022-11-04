import java.util.Scanner;

public class Main {

    static boolean isAsal(int number , int i){
        if (number == 1){
            return false;
        } else if (i >= number) {
            return true;
        }else if (number % i == 0){
            return false;
        }

        return isAsal(number,i +1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = scn.nextInt();
        System.out.println(isAsal(number,2));
    }
}
