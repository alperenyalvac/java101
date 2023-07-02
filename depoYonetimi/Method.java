package depoYonetimi;

import java.util.*;

public class Method {
    static Scanner sc = new Scanner(System.in);
    static Map<String, UrunlerPojo> urunlerListesi = new HashMap<>();
    static Set<Map.Entry<String, UrunlerPojo>> urunDetaylari = urunlerListesi.entrySet();
    static Set<String> idNumaralari = urunlerListesi.keySet();
        public static void urunTanimlama() {
            System.out.println("-".repeat(20) + "Urun Tanimlama Sayfasi" + "-".repeat(20));

            String urunIsmi = "";
            String uretici = "";
            int miktar = 0;
            String birim = "";

            boolean validInput = false;

            while (!validInput) {
                System.out.print("Tanımlama yapmak istediğnizi ürünün ismini giriniz: ");
                urunIsmi = sc.nextLine().trim();
                if (urunIsmi.isEmpty() || urunIsmi.contains(" ") || !urunIsmi.matches("[A-Za-z]+")) {
                    System.out.println("Girmiş olduğunuz ürün ismi, istenen kriterlere uygun değildir. Lütfen tekrar deneyiniz.");
                    continue;
                }
                validInput = true;
            }

            validInput = false;
            while (!validInput) {
                System.out.print("Tanımlama yapmak istediğiniz ürünün üreticisini giriniz: ");
                uretici = sc.nextLine().trim();
                if (uretici.isEmpty() || uretici.contains(" ") || !uretici.matches("[A-Za-z]+")) {
                    System.out.println("Girmiş olduğunuz üretici, istenen kriterlere uygun değildir. Lütfen tekrar deneyiniz.");
                    continue;
                }
                validInput = true;
            }

            validInput = false;
            while (!validInput) {
                System.out.print("Tanımlama yapmak istediğiniz ürünün mikarını giriniz: ");
                String miktarStr = sc.nextLine().trim();
                if (miktarStr.isEmpty() || miktarStr.contains(" ")) {
                    System.out.println("Girmiş olduğunuz miktar, istenen kriterlere uyugn değildir. Lütfen tekrar deneyiniz.");
                    continue;
                }
                try {
                    miktar = Integer.parseInt(miktarStr);
                    if (miktar >= 0) {
                        validInput = true;
                    } else {
                        System.out.println("Girmiş olduğunuz miktar, istenen kriterlere uyugn değildir. Lütfen tekrar deneyiniz.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Miktar değeri, sayısal bir değer olmalıdır. Lütfen tekrar deneyiniz.");
                }
            }

            validInput = false;
            while (!validInput) {
                System.out.print("Tanımlama yapmak istediğiniz ürünün birimini giriniz:");
                birim = sc.nextLine().trim();
                if (birim.isEmpty() || birim.contains(" ") || !birim.matches("[A-Za-z]+")) {
                    System.out.println("Girmiş olduğunuz birim, istenen kriterlere uygun değildir. Lütfen tekrar deneyiniz.");
                    continue;
                }
                validInput = true;
                int idx = (int) (Math.random() * 300);
                String id = String.valueOf(idx);

                String raf = null;

                UrunlerPojo urunObje = new UrunlerPojo(id, urunIsmi, uretici, miktar, birim, raf);
                urunlerListesi.put(id, urunObje);
                urunListeleme();
            }
        }

        public static void miktarGuncelleme() {
            System.out.println("-".repeat(20) + "Miktar Güncelleme Sayfası" + "-".repeat(20));
            System.out.print("Eklemek istediğiniz ürünün ID Numarasını giriniz: ");
            String girilenId = sc.next();
            UrunlerPojo guncellemeObje = urunlerListesi.get(girilenId);

            if (idNumaralari.contains(girilenId)) {
                System.out.print("Güncelleme yapmak istediğiniz ürün miktarını giriniz: ");
                int guncellenecekMiktar = sc.nextInt();
                if (!(guncellenecekMiktar <= 0)) {
                    guncellemeObje.setMiktar(guncellemeObje.getMiktar() + guncellenecekMiktar);

                    System.out.println("Ürün miktarınız başarı ile güncellenmiştir.");
                    urunListeleme();

                    System.out.println("Depo giriş paneline girmek için 1'e basınız.");

                    String tercih = sc.next();
                    if (tercih.equals("1")) {
                        DepoGirisPaneli.girisPaneli();
                    } else {
                        System.out.println("Yanlış seçim yaptınız.");
                    }
                } else {
                    System.out.println("Depoda çıkış yapmak istediğiniz kadar ürün bulunmamaktadır.");
                }
            } else {
                System.out.println("Miktar güncelleme yapmak istediğiniz ürüne ait id, depoda bulunmamaktadır.");
                System.out.println("Ürün miktarı güncellemeye devam etmek için 1'e basınız.\n" +
                        "Depo giriş paneline dönmek için 2'ye basınız\n");
                String sss = sc.next();
                if(sss.equals("1")) {
                    miktarGuncelleme();
                } else {
                    DepoGirisPaneli.girisPaneli();
                }
            }
        }

        public static void rafGuncelleme() {
            System.out.println("-".repeat(20) + "Raf Güncelleme Sayfası" + "-".repeat(20));
            System.out.println("Raf güncellemek istediğiniz ürünün ID numarasını giriniz.");
            String girilenId1 = sc.next();
            UrunlerPojo rafObje = urunlerListesi.get(girilenId1);

            if (idNumaralari.contains(girilenId1)) {
                if (Integer.valueOf(girilenId1) > 0 && Integer.valueOf(girilenId1) < 101) {
                    rafObje.setRaf("raf1");
                } else if (Integer.valueOf(girilenId1) > 100 && Integer.valueOf(girilenId1) < 201) {
                    rafObje.setRaf("raf2");
                } else if (Integer.valueOf(girilenId1) > 200 && Integer.valueOf(girilenId1) < 301) {
                    rafObje.setRaf("raf3");
                }

                System.out.println("Ürününüz raflarımızda başarı ile güncellenmiştir.");
                urunListeleme();
                System.out.println("Depo giriş paneline girmek için 1'e basınız.");

                String tercih = sc.next();
                if (tercih.equals("1")) {
                    DepoGirisPaneli.girisPaneli();
                } else {
                    System.out.println("Yanlış seçim yaptınız.");
                }
            } else {
                System.out.println("Raf güncelleme yapmak istediğiniz ID'ye air ürün, depoda bulunamadı.");
                System.out.println("Raf güncellemeye devam etmek için 1'e basınız.\n" +
                        "Depo giriş paneline gitmek için 2'ye basınız.\n");
                String sss = sc.next();
                if (sss.equals("1")) {
                    rafGuncelleme();
                } else {
                    System.out.println("Hatatlı seçim yaptınız");
                    DepoGirisPaneli.girisPaneli();
                }
            }
        }

        public static void urunCikisi() {
            System.out.println("-".repeat(20) + "Ürün Çıkış Sayfası" + "-".repeat(20));
            System.out.print("Çıkış yapmak istediğiniz ürünün ID numarasını giriniz: ");
            String cikisId = sc.next();

            if (!idNumaralari.contains(cikisId)) {
                System.out.println("Girdiğiniz ID'ye ait ürün depoda bulunamadı.");
                System.out.print("Çıkış işlemine devam etmek için 1'e, depo giriş paneline dönmek için 2'ye basınız: ");

                String tercih = sc.next();

                if (tercih.equals("1")) {
                    urunCikisi();
                } else if (tercih.equals("2")) {
                    DepoGirisPaneli.girisPaneli();
                }
                } else {
                    UrunlerPojo cikisObje = urunlerListesi.get(cikisId);

                    System.out.print("Çıkış yapmak istediğiniz ürün miktarını giriniz: ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Geçersiz giriş yaptınız. Lütfen sadece rakamsal değerler giriniz!");
                        sc.next();
                    }
                    int cikarilacakMiktar = sc.nextInt();

                    if (cikisObje.getMiktar() >= cikarilacakMiktar) {
                        cikisObje.setMiktar(cikisObje.getMiktar() - cikarilacakMiktar);

                        System.out.println("Ürün çıkış işleminiz başarıyla gerçekleştirilmiştir.");
                        urunListeleme();

                        System.out.println("Depo giriş paneline gitmek için 1'e basınız.");
                        String tercih = sc.next();
                        if (tercih.equals("1")) {
                            DepoGirisPaneli.girisPaneli();
                    } else {
                            System.out.println("Yanlış seçim yaptınız.");
                        }
                } else {
                        System.out.println("Depoda belirtilen miktar kadar ürün bulunmamaktadır.");
                        urunCikisi();
                    }
            }
        }
        public static void urunListeleme() {
            System.out.printf("%-20s %-19s %-19s %-19s %-19s %-15s\n", "id", "UrunIsmi", "Uretici", "Miktar", "Birim", "Raf");
            System.out.println("-".repeat(120));

            for (Map.Entry<String, UrunlerPojo> w : urunDetaylari) {
                String key = w.getKey();

                System.out.printf("%-20s %-19s %-19s %-19s %-19s %-15s\n", key, urunlerListesi.get(key).getUrunIsmi(), urunlerListesi.get(key).getUretici(),
                        urunlerListesi.get(key).getMiktar(), urunlerListesi.get(key).getBirim(), urunlerListesi.get(key).getRaf());

            }
            System.out.println("Ürün tanımlama devam etmek için 1'e basınız.\n" +
                    "Ürün listenizi tekrar görmek için 2'ye basınız.\n" +
                    "Depo giriş paneline gitmek için 3'e basınız.\n");
            String tercih = sc.next();
            if (tercih.equals("1")) {
                urunTanimlama();
            } else if (tercih.equals("2")) {
                urunListeleme();
            } else if (tercih.equals("3")) {
                DepoGirisPaneli.girisPaneli();
            } else {
                System.out.println("Hatalı seçim yaptınız.");
                DepoGirisPaneli.girisPaneli();
            }
        }

        public static void cikis() {
            System.out.println("Depo Yönetim Sistemi'ni kullandığınız için teşekkür ederiz.\n" +
                    "İyi günler dileriz.");
        }
}





















