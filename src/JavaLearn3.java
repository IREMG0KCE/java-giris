//öklid hesaplama -- Öklid teoremi
import java.util.Scanner;// veri almak için
public class JavaLearn3 {
    public void main(){
        Scanner input = new Scanner(System.in);
        double h, p, k, a,b,c;
        String secim;

        System.out.println("Bulmak istediğiniz yeri seçiniz:");

        System.out.println("          | \\ 90  ");
        System.out.println("         /|  \\");
        System.out.println("        / |   \\");
        System.out.println("     c /  |    \\b");
        System.out.println("      / h |     \\ ");
        System.out.println("     /    |      \\");
        System.out.println("    /     |       \\");
        System.out.println("   /______|________\\");
        System.out.println("        p    k");
        System.out.println("  __________________ ");
        System.out.println("           a ");
        System.out.println();
        System.out.print("bulunmak istenen köşeyi giriniz. a,b,c,h,p,k : ");
        secim = input.next();
        System.out.println("=");

        switch (secim){
            case "a":
                System.out.println("p ve k değerlerini giriniz:");
                p = input.nextDouble();
                k = input.nextDouble();
                a= p+k;
                System.out.println("bulunan sonuç:" +a);
                break;
            case "b":
                System.out.println("p ve k değerlerini giriniz:");
                p = input.nextDouble();
                k = input.nextDouble();
                b= Math.sqrt((k*(p+k)));
                System.out.println("bulunan sonuc :"+b);

                break;
            case "c":
                //c^2=p(p+k)
                System.out.println("P ve k değerlerini giriniz:");
                System.out.print("p:");
                p= input.nextDouble();
                System.out.print("k:");
                k= input.nextDouble();

                c= Math.sqrt(p*(p+k));
                System.out.println("bulunan sonuç : " +c);
                break;
            case "h":
                System.out.println("lütfen p ve k değerelrini giriniz");
                System.out.print("p:");
                p = input.nextDouble();
                System.out.print("k:");
                k = input.nextDouble();
                h = Math.sqrt(p*k);
                System.out.println("bulunan sonuç: " +h);

                break;
            case "p":
                System.out.println("Lütfen h ve k değerlerini giriniz:");
                System.out.print("h:");
                h = input.nextDouble();
                System.out.print("k:");
                k = input.nextDouble();
                p= (h*h)/k;
                System.out.println("bulunan sonuç:"+p);

                break;
            case "k":
                System.out.println("Lütfen h ve p değerlerini giriniz:");
                System.out.print("h:");
                h = input.nextDouble();
                System.out.print("p:");
                p = input.nextDouble();
                k= (h*h)/p;
                System.out.println("bulunan sonuç:"+k);
                break;
        }
    }
}
