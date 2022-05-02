import java.util.Scanner;

public class ucakbiletihesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, age, type;
        String error = "", error2 = "", error3 = "";
        double dist = 0.10;
        boolean isError = false;
        System.out.print("Lütfen mesafeyi KM olarak giriniz: ");
        km = input.nextInt();
        System.out.print("Lütfen yolcunun yaşını giriniz. : ");
        age = input.nextInt();
        System.out.println("Lütfen yolculuk tipini giriniz.\n1-Tek Yön\n2-GidişDönüş");
        type = input.nextInt();
        double total = km*dist;
        if (km < 1) {
            error = "Km ";
            isError = true;
        }
        if (age < 1) {
            error2 = "yaş ";
            isError = true;
        }
        if (type != 1 && type != 2) {
            error3 = "yolculuk tipi ";
            isError = true;
        }
        if (isError) {
            System.out.println(error + error2 + error3 + "verisini hatalı girdiniz.");
        } else if (age < 12) {
            if (type == 1) {
                System.out.println("Bilet ücretiniz = " + (total * 0.5));
            }else {
                System.out.println("Bilet ücretiniz = " + (((total)-(total*0.50))-((total*0.50)*0.2))*2);
            }
        } else if (age >= 12 && age <= 24) {
            if (type == 1) {
                System.out.println("Bilet ücretiniz = " + (total * 0.9));
            } else {
                System.out.println("Bilet ücretiniz = " + (((total)-(total*0.10))-((total*0.90)*0.2))*2);
            }
        } else if (age >= 65) {
            if (type == 1) {
                System.out.println("Bilet ücretiniz = " + (total * 0.7));
            } else {
                System.out.println("Bilet ücretiniz = " + (((total)-(total*0.30))-((total*0.70)*0.2))*2);
            }
        } else if (type == 2){
            System.out.println("Bilet ücretiniz = " + (total * 0.8)*2);
        } else {
            System.out.println("Bilet ücretiniz = " + (total));
        }
    }
}