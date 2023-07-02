package depoYonetimi;

import java.util.Scanner;

import static depoYonetimi.Method.*;

public class DepoGirisPaneli {
    static Scanner sc = new Scanner(System.in);

    public static void girisPaneli() {
        System.out.println("-".repeat(20) + "DEPO ANASAYFASI" + "-".repeat(20));
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz...\n" + "İŞLEMLER\n" +
                "1- Ürün Tanımlama\n" + "2- Miktar Güncelleme\n" + "3- Raf Güncelleme\n" + "4- Ürün Çıkışı\n" + "5- Ürün Listele\n" + "6- Çıkış" );

        String secim = sc.next();
        boolean scm = true;

        do {
            switch (secim) {
                case "1":
                    urunTanimlama();
                    scm = false;
                    break;
                case "2":
                    miktarGuncelleme();
                    scm = false;
                    break;
                case "3":
                    rafGuncelleme();
                    scm = false;
                    break;
                case "4":
                    urunCikisi();
                    scm = false;
                    break;
                case "5":
                    urunListeleme();
                    scm = false;
                    break;
                case "6":
                    cikis();
                    scm = false;
                    break;
                default:
                    System.out.println("Yanlış bir seçim yaptınız. Lütfen tekrar deneyiniz.");
                    secim = sc.next();
            }
        } while (scm);

    }
}
