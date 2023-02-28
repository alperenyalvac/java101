package java101;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        int mat, fizik, kimya, turkce, tarih, muzik;
        
        System.out.println("Matematik: ");
        mat = inp.nextInt();
        
        System.out.println("Fizik: ");
        fizik = inp.nextInt();
        
        System.out.println("Kimya: ");
        kimya = inp.nextInt();
        
        System.out.println("Türkçe: ");
        turkce = inp.nextInt();
        
        System.out.println("Tarih: ");
        tarih = inp.nextInt();
        
        System.out.println("Müzik: ");
        muzik = inp.nextInt();
        
        double sonuc = (mat + fizik + kimya + turkce + tarih + muzik) / 6.0;
        System.out.println("Ortalama: " + sonuc);
        
        boolean sart = sonuc >= 50;
        String durum = sart ? "Geçtiniz" : "Kaldınız";
        System.out.println(durum);
        
    }

}
