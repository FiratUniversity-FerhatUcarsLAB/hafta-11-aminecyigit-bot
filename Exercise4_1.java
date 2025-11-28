/**
* Adı-Soyadı: Amine Ceren Yiğit
* Okul No:250541048
* Açıklama: Tarihleri Avrupa ve Amerikan formatında yazan bir program
*/    
package v1;
import java.util.Scanner;
public class Exercise4_1 {

    public static void printAmerican(String haftaninGunu,int day, int month, int year){
        if(day>0 && month>0 && year>0 && (day<32 && month<13 && year<2026)){
            System.out.printf("%s %d/%d/%d\n" ,haftaninGunu,day,month,year);
        }else{
            System.out.println("Lütfen geçerli bir tarih giriniz:");
        }


    }

    public static void printEuropean(int gun, int ay, int yil, String day_name){
        if((gun>0 && ay>0 && yil>0) && (gun<32 && ay<13 && yil<2026)){
            System.out.printf("%d/%d/%d %s\n" ,gun,ay,yil,day_name);
        }else{
                System.out.println("Lütfen geçerli bir tarih giriniz!");
        }


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gun, ay,yil;
        String gunAdi;
        System.out.println("Gün: ");
        gun=input.nextInt();
        System.out.println("Ay: ");
        ay=input.nextInt();
        System.out.println("Yil: ");
        yil=input.nextInt();
        System.out.println("Günün adı(örn pazartesi,salı, vb.):");
        gunAdi =  input.next();
        printEuropean(gun,ay,yil,gunAdi);
        printAmerican(gunAdi,gun,ay,yil);
    }
}
