import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        String s1 = "Eşit sayı girdiniz, tekrar deneyiniz", s2 = "İşleminiz gerçekleştiriliyor";
        
        System.out.println("Birinci Sayı: ");
        a = sc.nextInt();
        System.out.println("İkinci Sayı: ");
        b = sc.nextInt();
        System.out.println("Üçüncü Sayı: ");
        c = sc.nextInt();
        
         String s = ((a == c) || (a == b) || (b == c)) ? "Eşit sayı girdiniz, tekrar deneyiniz" : "İşleminiz gerçekleştiriliyor";
        
         if (s == s1){
             System.out.println(s1);
             System.exit(0);
         }else{
             System.out.println(s2);
         }
         
        if ((a > b) && (a > c)){
            if(b > c){
                System.out.println(a + ">" + b + ">" + c);
            }else{
                System.out.println(a + ">" + c + ">" + b);  
            }
        }else if((b > a) && (b > c)){
            if (a > c){
                System.out.println(b + ">" + a + ">" + c);
            }else{
                System.out.println(b + ">" + c + ">" + a);
            }
        }else if ((c > a) && (c > b)){
            if (a > b){
                System.out.println(c + ">" + a + ">" + b);
            }else{
                System.out.println(c + ">" + b + ">" + a);
            }
        }
        
    }
    
}
