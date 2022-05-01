import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz: ");
        int n1 = input.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        int n2 = input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma");
        System.out.print("Seçiminiz: ");
        int select = input.nextInt();
        switch (select) {
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (n1 - n2));
                break;
            case 3:
                if (n2 != 0) {
                    System.out.println("Bölme: " + (n1 / n2));
                } else {
                    System.out.println("Bir sayı 0'a bölünemez.");
                }
                break;
            case 4:
                System.out.println("Çarpma: " + (n1 * n2));
                break;
            default:
                System.out.println("Hatalı seçim yaptınız, lütfen tekrar deneyiniz.");
                break;
        }
    }
}