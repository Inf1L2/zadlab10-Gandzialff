package pl.edu.ur.oopl10;

import java.util.Random;
import java.util.Scanner;

public class Zad2 {
    public static void zad2()
    {
        int n;
        int[] rand;
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        rand = new int[100];
        try{
            System.out.println("Podaj ile liczb chcesz wylosować(0-100), poza tym zakresem program wyświetli błąd!");
            n = s.nextInt();
            for(int i=0;i<n;i++)
            {
                rand[i] = r.nextInt(100);
            }
            System.out.print('(');
            for (int i=0;i<n-1;i++)
            {
                System.out.print(rand[i]+",");
            }
            System.out.print(rand[n]+")");

        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.err.println("Error! Wykroczono poza zakres tablicy!(ArrayIndexOutOfBoundsException)");
        }
    }
}
