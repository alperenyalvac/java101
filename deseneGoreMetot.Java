import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number, temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Gir: ");
        number = input.nextInt();
        temp = number;
        desen1(number,temp);
    }
    public static void desen1(int number, int temp){
       if(number>0) {
           System.out.print(number + " ");
           desen1(number - 5,temp);
       }else if(number<=0){
            desen2(number,temp);
       }
   }
   public static void desen2(int number, int temp){
        if(temp>=number){
            System.out.print(number + " ");
            desen2(number+5,temp);
        }
   }
}
