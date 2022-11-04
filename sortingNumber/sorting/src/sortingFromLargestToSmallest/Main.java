package sortingFromLargestToSmallest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1 , num2 , num3 ;

        Scanner scn = new Scanner(System.in);

        System.out.println("\t!Please enter three different numbers!");

        System.out.print("First number :");
        num1 = scn.nextInt();
        System.out.print("Second number :");
        num2 = scn.nextInt();
        System.out.print("Third number :");
        num3 = scn.nextInt();

        if (num1 > num2 && num1 > num3){
            if (num2 > num3){
                System.out.println(num1+">"+num2+">"+num3);
            }else if (num3 > num2){
                System.out.println(num1+">"+num3+">"+num2);
            }
        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3){
                System.out.println(num2+">"+num1+">"+num3);
            }else if (num3 > num1){
                System.out.println(num2+">"+num3+">"+num1);
            }
        } else {
            if (num1 > num2) {
                System.out.println(num3 + ">" + num1 + ">" + num2);
            } else if (num2 > num1) {
                System.out.println(num3 + ">" + num2 + ">" + num1);
            }
        }
    }
}
