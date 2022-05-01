import java.util.Scanner;

public class dersortalamasi {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();
        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();
        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();
        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();
        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();
        if ((mat > 100) || (mat < 0)) {
            System.out.print("Girdiğiniz not 0 ile 100 arasında olmalıdır.");
        } else if ((turkce > 100) || (turkce < 0)) {
            System.out.print("Girdiğiniz not 0 ile 100 arasında olmalıdır.");
        } else if ((kimya > 100) || (kimya < 0)) {
            System.out.print("Girdiğiniz not 0 ile 100 arasında olmalıdır.");
        } else if ((muzik > 100) || (muzik < 0)) {
            System.out.print("Girdiğiniz not 0 ile 100 arasında olmalıdır.");
        } else {
            double average = ((mat + fizik + turkce + kimya + muzik) / 5);
            if (average >= 55) {
                System.out.println("Geçtiniz, tebrikler.");
            } else {
                System.out.println("Sınıfta kaldınız, gelecek sene görüşmek dileğiyle.");
            }
            System.out.println("Not ortalamanız : " + average);
        }
    }
}
