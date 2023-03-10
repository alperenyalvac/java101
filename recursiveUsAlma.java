import java.util.Scanner;

public class Main {
    static int usAlma(int taban, int us) {
        if (us == 0) {
            return 1;
        } else if (us == 1) {
            return taban;
        } else {
            return taban * usAlma(taban, us-1);
        }
        
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Taban değeri girin: ");
        int taban = sc.nextInt();
        System.out.print("Üs değeri girin: ");
        int us = sc.nextInt();
        System.out.println(usAlma(taban, us));
    }
}
