import  java.util.Scanner;

public class cinzodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen doğum yılınızı giriniz: ");
        int dogumyili = input.nextInt();
        System.out.println("Doğum yılınız : " + dogumyili);
        switch (dogumyili % 12){
            case 0:
                System.out.println("Doğum yılına göre burcunuz = Maymun");
                break;
            case 1:
                System.out.println("Doğum yılına göre burcunuz = Horoz");
                break;
            case 2:
                System.out.println("Doğum yılına göre burcunuz = Köpek");
                break;
            case 3:
                System.out.println("Doğum yılına göre burcunuz = Domuz");
                break;
            case 4:
                System.out.println("Doğum yılına göre burcunuz = Fare");
                break;
            case 5:
                System.out.println("Doğum yılına göre burcunuz = Öküz");
                break;
            case 6:
                System.out.println("Doğum yılına göre burcunuz = Kaplan");
                break;
            case 7:
                System.out.println("Doğum yılına göre burcunuz = Tavşan");
                break;
            case 8:
                System.out.println("Doğum yılına göre burcunuz = Ejderha");
                break;
            case 9:
                System.out.println("Doğum yılına göre burcunuz = Yılan");
                break;
            case 10:
                System.out.println("Doğum yılına göre burcunuz = At");
                break;
            case 11:
                System.out.println("Doğum yılına göre burcunuz = Koyun");
                break;
            default:
                System.out.println("Girdiğiniz değer hatalı, lütfen tekrar deneyiniz.");
        }
    }
}
