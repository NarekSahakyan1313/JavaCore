package classwork.lesson1;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
forma();
Scanner scanner = new Scanner(System.in);
        System.out.println("Ete duq hamozvac eq vor chisht eq grel apa greq 1,isk ete voch kam sxal eq grel greq 2");

        int patasxan=scanner.nextInt();
        if (patasxan==1){
            System.out.println("Dzer patver@ hastatvel e");
            System.out.println("Shnorhakalutyun vor ogtvel eq mer online Shop-ic");

        }
        if(patasxan==2){
            System.out.println("Pordzeq noric");
            forma();
            System.out.println("Dzer patver@ hastatvel e");
            System.out.println("Shnorhakalutyun vor ogtvel eq mer online Shop-ic");

        }
    }
    static void forma(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Greq dzer tan hastcen");
        String adress = scanner.nextLine();
        System.out.println("Greq dzer shenqi ev tan hamarner@");
        int shamar = scanner.nextInt();

    }
}
