public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A",12 , 98 , 103,35);
        Fighter f2 = new Fighter("B" , 15 , 93 , 96,30);

        Match match = new Match(f1,f2,85,100);
        match.run();

    }
}