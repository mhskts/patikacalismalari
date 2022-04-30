import  java.util.Scanner;
public class kenarlar {
    public static void main(String[] args) {
        int ilkKenar, ikinciKenar;
        double hipotenus;
        Scanner girdi = new Scanner(System.in);
        System.out.print("İlk Kenarın Değerini Girin: ");
        ilkKenar = girdi.nextInt();
        System.out.println("İlk Kenarın Değerini " + ilkKenar + " olarak girdiniz.");
        System.out.print("İkinci Kenarın Değerini Girin: ");
        ikinciKenar = girdi.nextInt();
        System.out.println("İkinci Kenarın Değerini " + ikinciKenar + " olarak girdiniz.");
        hipotenus = Math.sqrt((ilkKenar*ilkKenar)+(ikinciKenar*ikinciKenar));
        System.out.print("Hipotenüs: " + hipotenus);


    }
}
