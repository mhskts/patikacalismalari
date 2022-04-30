import java.util.Scanner;

public class nothesaplama {
    public static void main(String[] args) {
        int mat, fizik, kimya, tarih, resim, beden;
        Scanner giris = new Scanner(System.in);
        System.out.print("Matematik Notunuzu Giriniz :");
        mat = giris.nextInt();
        System.out.println("Matematik Notunuz :" + mat);

        System.out.print("Fizik Notunuzu Giriniz :");
        fizik = giris.nextInt();
        System.out.println("Fizik Notunuz :" + fizik);

        System.out.print("Kimya Notunuzu Giriniz :");
        kimya = giris.nextInt();
        System.out.println("Kimya Notunuz : " + kimya);

        System.out.print("Tarih Notunuzu Giriniz :");
        tarih = giris.nextInt();
        System.out.println("Tarih Notunuz : " + tarih);

        System.out.print("Resim Notunuzu Giriniz :");
        resim = giris.nextInt();
        System.out.println("Resim Notunuz : " + resim);

        System.out.print("Beden Notunuzu Giriniz :");
        beden = giris.nextInt();
        System.out.println("Beden Notunuz : " + beden);

        int total = mat + fizik + kimya + tarih + resim + beden;
        double res = total / 6;
        System.out.println("Not Ortalamanız: " + res);
        boolean result = res >= 60.0;
        String sonucBildirme = result ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.print(sonucBildirme);


    }
}