import java.util.Scanner;
public class kdvhesaplama {
    public static void main(String[] args) {
        double kdv = 1.18;
        double urunDegeri;
        Scanner giris = new Scanner(System.in);
        System.out.print("Lütfen Ürünün Değerini Giriniz : ");
        urunDegeri = giris.nextDouble();
        double  kdvli = urunDegeri * kdv;
        double  kdvliyuvarla = (double) (Math.round(kdvli*10.0)/10.0);
        double kdvTutar = kdvliyuvarla - urunDegeri;
        double  kdvYuvarla = (double) (Math.round(kdvTutar*10.0)/10.0);
        System.out.println("Girdiğiniz Ürünün Değeri : " + urunDegeri);
        System.out.println("Ürünün Kdv Dahil Fiyatı : " + kdvliyuvarla);
        System.out.print("Kdv Tutarı : " + kdvYuvarla );
    }
}