import java.util.Scanner;
public class kdvhesaplama {
    public static void main(String[] args) {
        double kdv = 1.18;
        double proValue;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Ürünün Değerini Giriniz : ");
        proValue = input.nextDouble();
        double  withkdv = proValue * kdv;
        double kdvround = (double) (Math.round(withkdv*10.0)/10.0);
        double kdvValue = kdvround - proValue;
        double  kdvro = (double) (Math.round(kdvValue*10.0)/10.0);
        System.out.println("Girdiğiniz Ürünün Değeri : " + proValue);
        System.out.println("Ürünün Kdv Dahil Fiyatı : " + kdvround);
        System.out.print("Kdv Tutarı : " + kdvro );
    }
}