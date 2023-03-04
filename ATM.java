import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner sc = new Scanner(System.in);
        int right = 3, balance = 1500, select, price;
        
        while (right > 0){
            System.out.println("Kullanıcı Adınız: ");
            userName = sc.nextLine();
            System.out.println("Parolanız: ");
            password = sc.nextLine();
            
            if (userName.equals("Alperen") && password.equals("123alp")){
                System.out.println("Merhaba, Banka Uygulamasına Hoşgeldiniz!\n");
                
                do {
                System.out.println("1- Para Yatırma\n" + "2- Para Çekme\n" + "3- Bakiye Srogulama\n" + "4- Çıkış Yap");
                select = sc.nextInt();
                
                
                switch (select) {
                    case 1:
                        System.out.print("Yatıracağınız tutarı giriniz: ");
                        price = sc.nextInt();
                        balance += price;
                        break;
                    case 2:
                        System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                        price = sc.nextInt();
                        balance -= price;
                        break;
                    case 3:
                        System.out.println("Bakiyeniz: " + balance);
                        break;
                    case 4:
                        System.out.println("Çıkış yapılıyor...");
                }
            }while (select != 4);
                System.out.println("Tekrar görüşmek üzere");
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletşime geçiniz.");
                } else {
                    System.out.println("Giriş için kalan deneme hakkınız: " + right);
                }
            }
        }
    }
    
}
