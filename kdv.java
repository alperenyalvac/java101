import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        double kdv = 0.18;
        
        System.out.print("Fiyatı girin: ");
        double kdvsiz = inp.nextDouble();
        
        boolean durum = kdvsiz >= 1000;
        double cikti = durum ? 0.08 : kdv;
        
        double kdvT = kdvsiz * cikti;
        double kdvli = kdvsiz + kdvT;
        
        System.out.println("KDVli Fiyat: " + kdvli);
        System.out.println("KDV Tutarı: " + kdvT);
    }

}
