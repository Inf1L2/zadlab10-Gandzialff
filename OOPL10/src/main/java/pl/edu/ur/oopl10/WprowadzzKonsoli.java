package pl.edu.ur.oopl10;

import java.nio.charset.CharacterCodingException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WprowadzzKonsoli
{

    public static void wprowadzint()
    {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.println("Wprowadz liczbe całkowitą: ");
        try {
            a = s.nextInt();
            System.out.println(a);
        }catch (Exception c){
            System.err.println("Nieprawidłowy format");
        }
    }
    public static void wrowadzchar()
    {
        char zn;
        Scanner s = new Scanner(System.in);
        System.out.println("Wprowadz znak: ");
        try {
            zn = s.next().charAt(0);
            System.out.println(zn);
        }catch (Exception c){
            System.err.println("Nieprawidłowy format!");
        }
    }
    public static void wprowadzshort(){
        short sh;
        Scanner s = new Scanner(System.in);
        System.out.println("Wprowadz liczbe");
        try {
            sh = s.nextShort();
            System.out.println(sh);
        }catch (Exception c)
        {
            System.err.println("Nieprawidłowy format");
        }
    }
    public static void wprowadzdouble(){
        double ad;
        Scanner s = new Scanner(System.in);
        System.out.println("Wprowadz liczbe");
        try {
            ad = s.nextDouble();
            System.out.println(ad);
        }catch (Exception c)
        {
            System.err.println("Nieprawidłowy format");
        }
}

}

