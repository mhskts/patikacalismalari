import java.util.Scanner;

public class mukemmelsayisorgulama {


    public static void main(String[] args) {
        int n = 1, i = 1, k = 0, per = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sorgulamak istediğiniz sayıyı giriniz: ");
        n = scan.nextInt();
        for (i = 1; n >= i; i++) {
            if (n % i == 0)
                k = k + i;
            per = k / 2;
        }
        if (per == n) {
            System.out.println("Sorguladığınız sayı mükemmel sayıdır.");
        } else {
            System.out.println("Sorguladığınız sayı mükemmel sayı değildir.");
        }
    }
}