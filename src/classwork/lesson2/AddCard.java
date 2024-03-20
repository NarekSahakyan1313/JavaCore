package classwork.lesson2;

import java.util.Scanner;

public class AddCard {

    public static void main(String[] args) {
        Grancum();
        //Ays codi ognutyamb menq karoxanum enq ashxatel scsnner-ov (Scanner sc = new Scanner(System.in);)

        Scanner sc = new Scanner(System.in);
        //Ays kodi ognutyamb menq karoxanum enq hastatel mer gnum@
        System.out.println("Hastatum eq?");
        System.out.println("Ayo-1,Voch-2");
        int patasxan = sc.nextInt();
        if (patasxan == 1) {
            System.out.println("Duq grancvel eq");
        }
        if (patasxan == 2) {
            System.out.println("Pordzeq noric");
            Grancum();
            System.out.println("Duq grancvel eq ");
        }

    }


    static void Grancum() {

        Scanner sc = new Scanner(System.in);
        //Ays kod@ mez tuyl e talis nermucelu mer qarti 4 tver@
        System.out.println("Avelacreq dzer qarti arajin 4 tver@");
        System.out.println("Greq dzer qarti arajin 4 tver@");
        String tiv1 = sc.nextLine();
        if ((tiv1.length() != 4)) {
            System.out.println("Sxal e");

        }
        //Ays kod ishnorhiv menq avelacnum enq mer banki qarti 4 tver@
        System.out.println("Greq dzer banki qarti erku 4 tver@");
        String tiv2 = sc.nextLine();
        if ((tiv2.length() != 4)) {
            System.out.println("Sxal e");

        }
        //Ays kod ishnorhiv menq avelacnum enq mer banki qarti 4 tver@
        System.out.println("Greq dzer banki qarti 4 tver@");
        String tiv3 = sc.nextLine();
        if ((tiv3.length() != 4)) {
            System.out.println("Sxal e ");

        }
        //Ays kod ishnorhiv menq avelacnum enq mer banki qarti 4 tver@
        System.out.println("Greq dzer banki qarti 4 tver@");
        String tiv4 = sc.nextLine();
        if ((tiv4.length() != 4)) {
            System.out.println("Sxal e ");

        }

    }
}

