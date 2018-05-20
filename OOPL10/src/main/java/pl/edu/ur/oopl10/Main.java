package pl.edu.ur.oopl10;

import java.util.Scanner;

/**
 *
 * @author mchla
 */
public class Main {

    public static void main(String[] args) {
       int w;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Wybierz zadanie 1-5: ");
            w = s.nextInt();
            switch (w) {
                case 1:
                    WprowadzzKonsoli.zad1menu();
                    break;
                case 2:
                    Zad2.zad2();
                    break;
                case 3:
                    Zad3Test z3 = new Zad3Test();
                    z3.test();
                    break;
                case 4:
                    Zad4.zad4();
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Program zakończy działanie!");
                    break;
                default:
                    System.err.println("Nieprawidłowa opcja!");
                    break;

            }
        }while (w!=6);
    }
    
}
