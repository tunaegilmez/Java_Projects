import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1 , Fighter f2 , int minWeight , int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight)&&(this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    void run(){
        int i = 1;
        if (isCheck()){
            while (this.f1.health > 0 && this.f2.health > 0){
                System.out.println("========"+ i + ". ROUND ===========");
                int chance = Math.round((float)Math.random());

                if(chance ==0){
                    f2.health = f1.hit(f2);
                    if (isWin())break;
                    f1.health = f2.hit(f1);
                    if (isWin()) break;
                }
                if(chance ==1){
                    f1.health = f2.hit(f1);
                    if (isWin()) break;
                    f2.health = f1.hit(f2);
                    if (isWin()) break;
                }

                System.out.println(this.f1.name + " Sağlık : " + this.f1.health);
                System.out.println(this.f2.name + " Sağlık : " + this.f2.health);
            }
        }else {
            System.out.println("Sporcuların siklerleri uyuşmuyor.");
        }
    }

    boolean isWin(){
        if (this.f1.health == 0){
            System.out.println(this.f2.name + " Kazandı!");
            return true;
        }
        if (this.f2.health == 0){
            System.out.println(this.f1.name + " Kazandı!");
            return true;
        }

        return false;
    }
}