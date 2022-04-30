import  java.util.Scanner;
public class manavkasasi {
    public static void main(String[] args) {
        double  pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, eggplant = 5.0;
        int pearkg, applekg, tomatokg, bananakg, eggplantkg;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kilo armut aldınız? : ");
        pearkg = input.nextInt();
        System.out.print("Kaç kilo elma aldınız? : ");
        applekg = input.nextInt();
        System.out.print("Kaç kilo domates aldınız? : ");
        tomatokg = input.nextInt();
        System.out.print("Kaç kilo muz aldınız? : ");
        bananakg = input.nextInt();
        System.out.print("Kaç kilo patlıcan aldınız? : ");
        eggplantkg = input.nextInt();
        System.out.println("Toplamda " + pearkg +" kilo armut, " + applekg + " kilo elma, " + tomatokg + " kilo domates, " + bananakg + " kilo muz ve " + eggplantkg + " kilo patlıcan aldınız.");
        double total = (pear*pearkg) + (apple*applekg) + (tomato*tomatokg) + (banana*bananakg) + (eggplant*eggplantkg);
        System.out.println("Toplam ödemeniz gereken ücret " + total +" TL'dir.");
    }
}
