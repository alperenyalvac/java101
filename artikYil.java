import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yil;
        String mesaj;
        
        System.out.println("Yılı giriniz: ");
        yil = sc.nextInt();
        
        if (yil % 100 == 0) {
            mesaj = ((yil % 400) == 0) ? "Artık yıldır." : "Artık yıl değildir.";
        } else if ((yil % 4) == 0) {
            mesaj = "Artık yıldır.";
        } else {
            mesaj = "Artık yıl değildir.";
        }
        System.out.println(mesaj);
        }
}
