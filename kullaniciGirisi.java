import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = "Alperen", pass = "1234", nId, nPass, aPass;
        
        System.out.println("Kullanıcı adınızı girin: ");
        nId = sc.nextLine();
        System.out.println("Şifrenizi giriniz: ");
        nPass = sc.nextLine();
        
        if ((nId.equals(id)) && (nPass.equals(pass))){
            System.out.println("Başarıyla giriş yapıldı: ");
        }else{
            System.out.println("Kullanıcı adı veya şifre yanlış!");
            System.out.println("Şifrenizi değiştirmek ister misiniz?\nEVET için 1'e, HAYIR için 2'ye basınız.");
            int secim = sc.nextInt();
            switch (secim){
                case 1:
                    System.out.println("Yeni şifrenizi giriniz.");
                    aPass = sc.next();
                    if (aPass.equals(pass)){
                        System.out.println("Yeni şifreniz, eskisi ile aynı olamaz. Lütfen tekrar deneyiniz.");
                    }else{
                        System.out.println("Yeni şifreniz başarı ile oluşturuldu.");
                    }
                    break;
                case 2:
                    System.out.println("İşleminiz sonlandırıldı.");
                    break;
                default:
                    System.out.println("Lütfen geçerli sayı giriniz.");
            }
        }
    }

}
