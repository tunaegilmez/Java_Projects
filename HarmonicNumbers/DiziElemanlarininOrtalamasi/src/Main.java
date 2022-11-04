public class Main {
    public static void main(String[] args) {
        int[] arr = {3 , 12 , 7 };
        int sum = 0;
        for (int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
        }
        System.out.println("Dizi Elemanlarının ortalamsı : " +sum / arr.length);
    }
}
