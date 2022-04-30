import  java.util.Scanner;
public class kitleendeks {
    public static void main(String[] args) {
        double  kg, mt, bmi;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = input.nextDouble();
        System.out.print("Lütfen metre cinsinden boyunuzu giriniz: ");
        mt = input.nextDouble();
        bmi = Math.round(((kg/(mt*mt))*10.0))/10.0;
        System.out.print("Vücut Kitle Endeks Oranınız :" + bmi);
    }
}
