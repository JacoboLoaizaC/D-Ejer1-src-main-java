import java.util.Scanner;

public class Ejer5 {
    public static void main (String [] args) {

        int a, b, c, Mayor, Medio, Menor;

        Scanner lector = new Scanner(System.in);
        System.out.println("Dado tres numeros devolver los tres en orden ascendente");
        System.out.println("Ingrese el primer numero");
        a = lector.nextInt();
        System.out.println("Ingrese el segundo numero");
        b = lector.nextInt();
        System.out.println("Ingrese el tercer numero");
        c = lector.nextInt();
        
        if (a > b && a > c) {
            Mayor = a;
        } else if (b > a && b > c) {
            Mayor = b;
        } else {
            Mayor = c;
        }

        if (a < b && a < c) {
            Menor = a;
        } else if (b < a && b < c) {
            Menor = b;
        } else {
            Menor = c;
        }
        Medio = (a + b + c) - (Mayor + Menor);
        System.out.println("");
        System.out.println("El orden ascendente de los numeros es: ");
        System.out.println(Menor + " " + Medio + " " + Mayor);
    }
}
