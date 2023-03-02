import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mesafe, yas, tip, tutar ;
        
        System.out.println("Mesafeyi girin: ");
        mesafe = sc.nextDouble();
        String mesaj = (mesafe < 0) ? "Hatalı veri girdiniz!!" : " Devam edebilirsiniz.";
        System.out.println(mesaj);
        
        System.out.println("Yaşınızı girin: ");
        yas = sc.nextDouble();
        mesaj = (yas < 0) ? "Hatalı veri girdiniz!!" : " Devam edebilirsiniz.";
        System.out.println(mesaj);
        
        System.out.println("Yolculuk tipini giriniz: ");
        tip = sc.nextDouble();
        mesaj = ((tip != 1) && (tip != 2)) ? "Hatalı veri girdiniz!!" : "Tutarınız hesaplanıyor...";
        System.out.println(mesaj);
        
        tutar = mesafe * 0.1;
        
        if (yas < 12){
            tutar *= 0.5;
        } else if ((yas >= 12) && (yas <= 24)){
            tutar *= 0.9;
        } else if (yas > 65){
            tutar *= 0.7;
        }
        
        tutar = (tip == 2) ? tutar * 1.6 : tutar * 2.0;
        
        System.out.println("Yolculuk ücretiniz: " + tutar + "TL");
        }   
    }
