import java.util.Scanner;

public class maxminhesap {


    public static void main(String[] args) {
        int n, i, no, max = 0, min = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = scan.nextInt();
        i = 1;
        if (n > 1) {
            do {
                System.out.print(i + ". sayıyı giriniz: ");
                no = scan.nextInt();
                if (i == 1) {
                    max = no;
                    min = no;
                } else {
                    if (no >= max)
                        max = no;
                    if (no <= min)
                        min = no;
                }
                i++;
            } while (i <= n);
        } else {
            System.out.println("Girdiğiniz adet karşılaştırma için düşüktür.");
        }
        System.out.println("Girdiğiniz en küçük sayı: " + min);
        System.out.print("Girdiğiniz en büyük sayı : " + max);
    }
}