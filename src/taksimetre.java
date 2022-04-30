import  java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
        double km, kmvalue = 2.2, firstprice;
        int open = 10, got = 20;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen KM giriniz: ");
        km = input.nextDouble();
        firstprice = open + (km*kmvalue);
        boolean logprice = firstprice>20;
        double totalprice = logprice ? (firstprice) : (got);
        System.out.print("Toplam Ücret : " + totalprice);
    }
}
