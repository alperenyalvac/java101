package lisenceKey;

public class Main {
    public static void main(String[] args) {
        CreateCode createCode = new CreateCode();
        String str = "---------";
        System.out.println(str + "\n<< OLUŞTURULAN LİSANS ANAHTARLARI >>\n" + str);
        for (int i = 0; i < 5; i++) {
            System.out.println("-> Oluşan " + (i + 1) + ". Lisans Anahtarı: " + createCode.newCode() + "\n" + str);
        }
    }
}
