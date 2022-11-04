package sortingFromSmallestToLargest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a , b , c ;

        Scanner input = new Scanner(System.in);

        System.out.println("\t!Please enter three different numbers!");

        System.out.print("First number :");
        a = input.nextInt();
        System.out.print("Second number :");
        b = input.nextInt();
        System.out.print("Third number :");
        c = input.nextInt();

        if (a < b && a < c){
            if(b < c){
                System.out.println(a+"<"+b+"<"+c);
            } else if (c < b) {
                System.out.println(a+"<"+c+"<"+b);
            }
        } else if (b < a && b < c) {
            if (a < c){
                System.out.println(b+"<"+a+"<"+c);
            } else if (c < a) {
                System.out.println(b+"<"+c+"<"+a);
            }
        } else {
            if (a < b){
                System.out.println(c+"<"+a+"<"+b);
            } else if (b < a) {
                System.out.println(c+"<"+b+"<"+a);
            }
        }
    }
}
