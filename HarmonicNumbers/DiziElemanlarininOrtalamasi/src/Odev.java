public class Odev {
    public static void main(String[] args) {
        double[] number = {1,2,3,4,5};
        double sum = 0.0;
        for (double i : number){
            sum += (1 / i);
        }

        double avg = number.length / sum;

        System.out.println("Harmonik ortalaması : " + avg);
    }
}
