public class Main {
  static boolean isP(int sayi) {
    int islem = sayi, tersSayi = 0, sonRakam;
    while (islem != 0) {
      sonRakam = islem % 10;
      tersSayi = (tersSayi * 10) + sonRakam;
      islem /= 10;
    } if (sayi == tersSayi){ 
    return true;
    } else {
      return false;
    }
    
  }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      boolean sonuc = isP(11);
      if (sonuc) {
        System.out.println("Palindrom");
      } else {
        System.out.println("Palindrom değil");
      }
      
    }
}
