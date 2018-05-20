package pl.edu.ur.oopl10;

public class Zad3Test {
    public void test(){
        Zad3 arithmeticThrow = new Zad3();

        try{
            arithmeticThrow.test();
            System.err.println("Klasa poprzedzająca przechwycila i obsłużyła wyjątek!(ArithmeticException)");
        }
        catch(ArithmeticException e){
            System.err.println("Poprzednia klasa nie przechwyciła wyjątku!(ArithmeticException)");
        }
    }
}
