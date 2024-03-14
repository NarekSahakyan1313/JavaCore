package classwork.lesson2;

import java.util.Scanner;

public class AddCard {

    public static void main(String[] args) {
        (forma);


    }

    //Ays codi ognutyamb menq karoxanum enq ashxatel scsnner-ov (Scanner sc = new Scanner(System.in);)
    Scanner sc = new Scanner(System.in);
    //Ays kodi ognutyamb menq karoxanum enq hastatel mer gnum@
            System.out.println("Hastatum eq?");
            System.out.println("Ayo-1,Voch-2");
    int patasxan = sc.nextInt();
            if (patasxann == 1) {
        System.out.println("Duq grancvel eq");
    }
            if(patasxann == 2) {
        System.out.println("Pordzeq noric");
        Grancum();
        System.out.println("Duq grancvel eq ");
    }


}

static void Grancum () {

    Scanner sc = new Scanner(System.in);
    //Այս կոդի օգնությամբ մենք ավելացնում ենք մեր քարտի առաջին 4 թվերը
    System.out.println("Ավելացրեք ձեր քարտը");
    System.out.println("Գրեք ձեր քարտի առաջին 4 թվերը");
    String tiv1 = sc.nextLine();
    if ((tiv1.length() != 4)) {
        System.out.println("Սխալ է");

    }
    //Ays kod ishnorhiv menq avelacnum enq mer banki qarti 4 tver@
    System.out.println("Գրեք ձեր քարտի երկրորդ 4 թվերը");
    String tiv2 = sc.nextLine();
    if ((tiv2.length() != 4)) {
        System.out.println("Սխալ է");

    }
    //Ays kod ishnorhiv menq avelacnum enq mer banki qarti 4 tver@
    System.out.println("Գրեք ձեր քարտի երրորդ 4 թվերը");
    String tiv3 = sc.nextLine();
    if ((tiv3.length() != 4)) {
        System.out.println("Սխալ է");

    }
    //Ays kod ishnorhiv menq avelacnum enq mer banki qarti 4 tver@
    System.out.println("Greq dzer banki qarti 4 tver@");
    String tiv4 = sc.nextLine();
    if ((tiv4.length() != 4)) {
        System.out.println("Sxal e ");
    }



