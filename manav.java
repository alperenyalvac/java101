import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double elma = 3.67, armut = 2.14, domates = 1.11, muz = 0.95, patlican = 5;
        
        System.out.println("Kaç kilo elma: ");
        double elmaKilo = inp.nextDouble();
        System.out.println("Kaç kilo armut: ");
        double armutKilo = inp.nextDouble();
        System.out.println("Kaç kilo domates: ");
        double domatesKilo = inp.nextDouble();
        System.out.println("Kaç kilo muz: ");
        double muzKilo = inp.nextDouble();
        System.out.println("Kaç kilo patlıcan: ");
        double patlicanKilo = inp.nextDouble();
        
        double tutar = ((elma*elmaKilo)+(armut*armutKilo)+(domates*domatesKilo)+(muz*muzKilo)+(patlican*patlicanKilo));
        System.out.println("Toplam tutar: " + tutar);
    }

}
