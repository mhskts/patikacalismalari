import  java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
        double km, kmucreti = 2.2, ilktutar;
        int acilis = 10, indiBindi = 20;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Lütfen KM giriniz: ");
        km = girdi.nextDouble();
        ilktutar = acilis + (km*kmucreti);
        boolean mantiksalTutar = ilktutar>20;
        double toplamTutar = mantiksalTutar ? (ilktutar) : (indiBindi);
        System.out.print("Toplam Ücret : " + toplamTutar);
    }
}
