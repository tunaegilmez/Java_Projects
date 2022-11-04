public class Main {

    static boolean isPalindrom(int num){
        int temp = num , reverseNumber = 0 , lastNumber ;
        while (temp != 0){
            lastNumber = temp % 10 ;
            reverseNumber = (reverseNumber * 10) + lastNumber ;
            temp /= 10 ;
        }

        if (num == reverseNumber)
            return true ;
        else
            return false ;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(101));
    }
}
