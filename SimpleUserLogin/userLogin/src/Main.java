import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName , password , newPassword ;
        int select ;

        Scanner input = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);

        System.out.print("Username :");
        userName = input.nextLine();
        System.out.print("Password :");
        password = input.nextLine();

        if (userName.equals("user1") && password.equals("12345")){
            System.out.println("Login successful");
        }
        else if (!password.equals("12345")) {
            System.out.println("Wrong password!");
            System.out.println("Do you want to reset your password");
            System.out.println("1-YES\t2-NO");
            select = input.nextInt();

            switch (select){
                case 1:
                    System.out.print("Create new password :");
                    newPassword = scn.nextLine();
                    if (newPassword.equals("12345")){
                        System.out.println("Could not create password. Please enter another password! :");
                    }
                    else {
                        System.out.println("Registration Successful");
                    }
                    break;
                case 2:
                    System.out.println("Program terminated");
                    break;
                default:
                    System.out.println("choose 1 or 2");
            }
        } else if (!userName.equals("user1")) {
            System.out.println("Username is incorrect. Try again");
        }
        else {
            System.out.println("ERROR");
        }
    }
}
