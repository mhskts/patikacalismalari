import java.util.Scanner;
public class degertipi {
    public static void main(String[] args) {
        long deger;
        Scanner input = new Scanner(System.in);
        deger = input.nextLong();
        boolean byreq = 127>= deger;
        boolean byreq2 = -128 <= deger;
        boolean by = byreq && byreq2;
        String by2 = by ? "* byte" : "";

        boolean shreq = 32767>= deger;
        boolean shreq2 = -32768 <= deger;
        boolean sh = shreq && shreq2;
        String sh2 = sh ? "* short" : "";

        boolean inreq = 2147483647>= deger;
        boolean inreq2 = -2147483648 <= deger;
        boolean in = inreq && inreq2;
        String in2 = in ? "* int" : "";

        boolean lonreq = 2147483647>= deger;
        boolean lonreq2 = -2147483648 <= deger;
        boolean lon = lonreq && lonreq2;
        boolean value2 = 2147483647< deger;
        boolean value3 = -2147483648 > deger;
        boolean val = (value2 || value3);
        String lon2 = lon ? "* long" : "";
        String val2 = val ? (deger + " can't be fitted anywhere.") : "";
        System.out.println(deger + " can be fitted in:");
        System.out.println(by2);
        System.out.println(sh2);
        System.out.println(in2);
        System.out.print(lon2);
        System.out.println(val2);
    }
}