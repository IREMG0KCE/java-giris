//kullanıcıdan alınan iki sayının ortalaması
import java.util.Arrays;
import java.util.Scanner;// kullanıcıdan veri girişi almak için

public class Main{
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     int sayi1,sayi2;
     System.out.println("ilk sayi giriniz:");
     sayi1 = input.nextInt();
     System.out.println("ikinci sayi giriniz:");
     sayi2 = input.nextInt();
        int[] sayilar = {sayi1, sayi2};
        double ort = Arrays.stream(sayilar).average().orElse(0);
     System.out.println("ortalama sonuç:"+ (int) ort);
    }
}