import java.util.Scanner;
public class Ejer8 {
    public static Scanner keyboard = new Scanner(System.in);
    public static void main (String [] args) {

        double num1 = 0;
        double num2 = 0;
        double suma = 0;

        System.out.println("Este programa calcula la media de los numeros positivos");
        System.out.println("Para detener el programa introduzca un numero negativo");
        System.out.println("Introduzca los numeros");

        while (num2 >= 0) {
            num2= keyboard.nextInt ();
            num1 ++;
            suma+=num2;
        }
        System.out.println("La media de numeros positivos");
        System.out.println( (suma-num2) / (num1-1) );


    }
}
