public class Main {
    public static void main(String[] args) {
        System.out.print("2 3 5 7 ");
        for (int i = 11 ; i <= 100 ; i++){
            if (i%2 != 0 && i%3 != 0 && i%5 != 0 && i%7 != 0){
                System.out.print(i+" ");
            }
        }
    }
}
