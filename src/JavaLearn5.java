public class JavaLearn5 {
    public void main(String[] args) {
        int n=5;//kanat yüksekliği
        int toplamGenislik= 10;
        System.out.println("merhaba kelebek diyarına hoşgeldiniz");

            // üst kanat bölümü satır
            for (int uk = 1; uk <= n; uk++) {
                for(int adet=1; adet<=4; adet++) {
                for (int solKanat = 1; solKanat <= uk; solKanat++) {
                    System.out.print("*");
                }
                // orta boşluk
                for (int arabosluk = 1; arabosluk <= toplamGenislik - 2 * uk; arabosluk++) {
                    System.out.print(" ");
                }

                // sağ kanat
                for (int sagKanat = 1; sagKanat <= uk; sagKanat++) {
                    System.out.print("*");
                }
                    System.out.print(" ");
                    System.out.print(" ");

                }
                System.out.println();

        }

            //alt kanat bölümü satır
        for(int ak=n-1; ak>=1; ak--){
            for(int adet=1; adet<=4; adet++) {
                //sol alt kanat
                for (int solaltkanat = 1; solaltkanat <= ak; solaltkanat++) {
                    System.out.print("*");
                }
                //alt bosluk
                for (int altbosluk = 1; altbosluk <= toplamGenislik - 2 * ak; altbosluk++) {
                    System.out.print(" ");
                }
                //sağ alt kanat
                for (int sagaltkanat = 1; sagaltkanat <= ak; sagaltkanat++) {
                    System.out.print("*");
                }
                System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();

        }

    }

}