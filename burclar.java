import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int ay, gun;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz Ayı Giriniz (0-12) : ");
        ay = input.nextInt();
        System.out.print("Doğduğunuz Günü Giriniz (0-31) : ");
        gun = input.nextInt();

        System.out.println("Doğum Tarihi Gün/Ay : " + gun + "/" + ay);

        if(ay==1){
            if(gun>=22){
                System.out.println("Kova Burcu");
            }
            else if(gun<=21){
                System.out.println("Oğlak Burcu");
            }
        }
        if(ay==2){
            if(day>=20){
                System.out.println("Balık Burcu");
            }
            else if(gun<=19){
                System.out.println("Kova Burcu");
            }
        }
        if(ay==3){
            if(gun>=21){
                System.out.println("Koç Burcu");
            }
            else if(gun<=20){
                System.out.println("Balık Burcu");
            }
        }

        if(ay==4){
            if(gun>=21){
                System.out.println("Boğa Burcu");
            }
            else if(gun<=20){
                System.out.println("Koç Burcu");
            }
        }ay

        if(ay==5){
            if(gun>=22){
                System.out.println("İkizler Burcu");
            }
            else if(gun<=21){
                System.out.println("Boğa Burcu");
            }
        }

        if(ay==6){
            if(gun>=23){
                System.out.println("Yengeç Burcu");
            }
            else if(gun<=22){
                System.out.println("İkizler Burcu");
            }
        }

        if(ay==7){
            if(gun>=23){
                System.out.println("Aslan Burcu");
            }
            else if(gun<=22){
                System.out.println("Yengeç Burcu");
            }
        }

        if(ay==8){
            if(gun>=23){
                System.out.println("Başak Burcu");
            }
            else if(gun<=22){
                System.out.println("Aslan Burcu");
            }
        }

        if(ay==9){
            if(gun>=23){
                System.out.println("Akrep Burcu");
            }
            else if(gun<gun=22){
                System.out.println("Başak Burcu");
            }
        }

        if(ay==10){
            if(gun>=23){
                System.out.println("Akrep Burcu");
            }
            else if(gun<=22){
                System.out.println("Terazi Burcu");
            }
        }

        if(ay==11){
            if(gun>=22){
                System.out.println("Yay Burcu");
            }
            else if(gun<=21){
                System.out.println("Akrep Burcu");
            }
        }

        if(ay==12){
            if(gun>=22){
                System.out.println("Oğlak Burcu");
            }
            else if(gun<=21){
                System.out.println("Yay Burcu");
            }
        }
    }
}
