import  java.util.Scanner;
public class kullanicigiris {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kullanıcı adınızı giriniz : ");
        userName = input.nextLine();
        System.out.print("Lütfen şifrenizi giriniz : ");
        password = input.nextLine();
        if ((userName.equals("patika")) && (password.equals("java1234"))){
            System.out.print("Giriş yaptınız.");
        }
        else {
            System.out.print("Hatalı bilgi girdiniz, lütfen tekrar deneyiniz.");
        }
    }
}
