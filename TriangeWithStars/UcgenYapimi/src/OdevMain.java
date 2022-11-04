import java.util.Scanner;

public class OdevMain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Satır Sayısı : ");
        int satirSayisi = scn.nextInt();
        int tempSatirSayisi = satirSayisi;

        for (int satir = 1 ; satir <= satirSayisi ; satir++){
            for (int bosluk = 1 ; bosluk <= satirSayisi-(satir-1); bosluk++){
                System.out.print(" ");
            }
            for (int yildiz = 1 ; yildiz <= (satir*2)-1 ; yildiz++){
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = (satirSayisi-1) ; i > 0 ; i--){
            for (int bosluk = 1 ; bosluk <= (satirSayisi-i)+1 ; bosluk++){
                System.out.print(" ");
            }
            for (int yildiz = 1 ; yildiz <= (2*i-1) ; yildiz++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
