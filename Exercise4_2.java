/**
adı_soyadı: Amine Ceren YİĞİT
Okul no: 250541048
Açıklama: metotların birbirini çağırması programını sıralamaları yapılır  
*/  


public class Exercise4_2 {

  // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

    public static void main(String[] args) { //1
        zippo("rattle", 13); //2
    }

    public static void baffle(String blimp) { //7
        System.out.println(blimp); //8
        zippo("ping", -5); //9
    }

    public static void zippo(String quince, int flag) { //3,10
        if (flag < 0) { //11
            System.out.println(quince + " zoop"); //12
        } else { //4
            System.out.println("ik");//5
            baffle(quince);//6
            System.out.println("boo-wa-ha-ha"); //13
        }
    }
}

/** Soruların cevapları 
* 2- baffle ilk çağırıldığında blimp'in değeri "rattle"dir
* 3- Çıktı
ik
rattle
ping zoop
boo-wa-ha-ha
* 4- 21.satır (zippo metotu) birden fazla kez çağırılşmıştır.
*/

