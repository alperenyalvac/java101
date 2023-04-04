import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dizinin boyutunu giriniz: ");
        int n = sc.nextInt();
        int[] list = new int[n];

        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + ". Eleman: ");
            list[i] = sc.nextInt();
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
