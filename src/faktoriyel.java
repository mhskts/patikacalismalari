import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
        int n, total = 1, i = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Faktöriyel almak istediğiniz sayıyı giriniz: ");
        n = input.nextInt();
        while(i<=n){
            total = total * i;
            i++;
        }
        System.out.println(n +". Faktöriyel = " + total);
    }
}