package lisenceKey;

import java.util.*;

public class CreateCode {
    Random random = new Random(); // Random değerlere ulaşmak için gerekli işlem.
    ArrayList lisenceKey = new ArrayList();
    // Değişkenler:
    String lisenceCode;
    int randomValue;


    public String newCode() {
        lisenceCode = ""; // Her işlem başladığında değişkenin temizlenmesini istiyorum.
        for(int i = 0; i < 16; i++) {
            if(i == 0 || i == 4 || i == 8 || i == 12) { // Oluşturulan anahtarın her zaman ilk harflerinin bir metin olmasını istediğimden sorgulama yaptırıyorum.
                randomValue = random.nextInt(26) + 65;
                if(lisenceKey.contains((char) randomValue)) // ArrayList üzerinde atanan değerin olup olmadığını kontrol ediyor.
                    randomValue = random.nextInt(20) + 71;
                if(lisenceKey.contains((char) randomValue))
                    randomValue = random.nextInt(25) + 66;
                lisenceKey.add((char)randomValue);
            }
            else {
                randomValue = random.nextInt(25);
                if(randomValue < 10){
                    if(lisenceKey.contains(randomValue))
                        randomValue = random.nextInt(10);
                    lisenceKey.add(randomValue);
                }
                else if(randomValue > 10 && randomValue < 35){
                    randomValue = random.nextInt(15) + 76;
                    if(lisenceKey.contains((char) randomValue))
                        randomValue = random.nextInt(26) + 65;
                    lisenceKey.add((char)randomValue);
                }
                else {
                    randomValue = random.nextInt(20) + 71;
                    if(lisenceKey.contains((char) randomValue)){
                        randomValue = random.nextInt(10);
                        lisenceKey.add(randomValue);
                    }
                    else
                        lisenceKey.add((char)randomValue);
                }
            }
        }
        int sp = 0;
        for(var a : lisenceKey) {
            lisenceCode += a;
            if(sp == 3 || sp == 7 || sp == 11)
                lisenceCode += " - ";
            sp++;
        }
        lisenceKey.clear(); // Değişkene atama gerçekleştirdikten sonra bir sonraki oluşturma için diziyi temizliyorum.
        return lisenceCode;
    }
}