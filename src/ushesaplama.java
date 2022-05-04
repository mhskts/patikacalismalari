import java.util.Scanner;

public class ushesaplama {
    public static void main(String[] args) {
        int n, total = 1, i;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n = input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz: ");
        i = input.nextInt();
        for (int k = 1; i >= k; k++) {
            total *= n;
        }
        System.out.println("Cevap : " + total);
    }
}