//vücut kitle indeksi hesaplama

import java.util.Scanner;//veri alabilmek için

public class JavaLearn2 {
    public void main(){
        Scanner input = new Scanner(System.in);

        double vki, kg, boy, boymetre;
        System.out.print("kilonuz:");
        kg = input.nextDouble();
        System.out.print("Boyunuz:");
        boy = input.nextDouble();
        boymetre= boy/100;
        vki =  (kg/(boymetre*boymetre));
        System.out.println("vücut kitle indeksiniz="+vki);
        if(vki<18.5){
            System.out.println("yemek yemelisiniz");
        } else if (18.5<=vki && vki<24.9) {
            System.out.println("ideal kilodasınız");
        }else if (25<=vki && vki<29.9) {
            System.out.println("Biraz dikkat etmelisiniz ama yine de iyi");
        }
        else if(30<=vki && vki<35.9){
            System.out.println("birinci derece obezite");
        } else if (36<=vki) {
            System.out.println("acilen zayıflamalısınız");

        }
    }
}
