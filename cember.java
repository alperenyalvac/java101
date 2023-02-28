import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Yarıçapı giriniz: ");
        int r = inp.nextInt();
        System.out.println("Açı ölçüsünü giriniz: ");
        int a = inp.nextInt();
        double pi = 3.14, alan, cevre;
        
        alan = pi*r*r;
        cevre = 2*pi*r;
        
        double dilim = (pi*(r*r)*a)/360;
        
        System.out.println("Çevre: " + cevre);
        System.out.println("Alan: " + alan);
        System.out.println("Dilim: " + dilim);   
    }

}
