import  java.util.Scanner;
public class kenarlar {
    public static void main(String[] args) {
        int firstedg, secondedg;
        double hypo;
        Scanner girdi = new Scanner(System.in);
        System.out.print("İlk Kenarın Değerini Girin: ");
        firstedg = girdi.nextInt();
        System.out.println("İlk Kenarın Değerini " + firstedg + " olarak girdiniz.");
        System.out.print("İkinci Kenarın Değerini Girin: ");
        secondedg = girdi.nextInt();
        System.out.println("İkinci Kenarın Değerini " + secondedg + " olarak girdiniz.");
        hypo = Math.sqrt((firstedg * firstedg)+(secondedg * secondedg));
        System.out.print("Hipotenüs: " + hypo);


    }
}
