import java.util.Scanner;

public class artikyilhesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen artık yıl olup olmadığını öğrenmek istediğiniz yılı giriniz: ");
        int artikyil = input.nextInt();
        if ((artikyil %4 == 0 && artikyil %100 != 0 ) || (artikyil % 400 == 0 )){
            System.out.println("Girdiğiniz yıl artık yıldır.");
        }
        else {
            System.out.print("Girdiğiniz yıl artık yıl değildir.");
        }
    }
}
