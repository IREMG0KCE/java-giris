//üçgen çizme işlemleri
public class JavaLearn4 {
    public  void main(String[] args){
        //i satır j her satırda yazdırılcak yıldız simgesi adeti
      int i,j,k,t;
//        for(int a=1; a<=1; a++){
//          for( i=1; i<=10; i++){
//                for(j=1; j<=i; j++){
//                    System.out.print("*");
//                }
//                System.out.println(" ");
//            }
//            //k satır t yazdırılcak yıldız adedi
//            for(k=9; k>=1; k--){
//                for(t=1; t<=k; t++){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//        }

       // **********BAKLAVA DESENİ***********

        for(i=1; i<=4; i++){
            for(int a=1; a<=4; a++) {
                //KENAR BOŞLUKLARI
                for (k = 1; k <= 4 - i; k++) {
                    System.out.print(" ");
                }
                //YILDIZ SAYILARI
                for (j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");

                }
                // SAĞ BOŞLUK (Simetriyi bu sağlar!)
                for (int p = 1; p <= 4 - i; p++) {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();

        }
        //alt desen

        for(i=3; i>=1; i--) {
            for(int a=1; a<=4; a++) {
            for (k = 1; k <= 4 - i; k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
                // SAĞ BOŞLUK (Simetriyi bu sağlar!)
                for (int p = 1; p <= 4 - i; p++) {
                    System.out.print(" ");
                }
            System.out.print(" ");
        }
            System.out.println();
        }


    }
}
