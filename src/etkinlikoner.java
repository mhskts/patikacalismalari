import java.util.Scanner;
public class etkinlikoner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heat;
        System.out.print("Sıcaklık değerini giriniz: ");
        heat = input.nextInt();
        if (heat <= 5){
            System.out.println("Kayak yapabilirsiniz.");
        }
        if ((heat<=15) && (heat>=5) ){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if ((heat<=25) && (heat>=15)){
            System.out.println("Piknik yapabilirsiniz.");
        }
        if ((heat>25)){
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}