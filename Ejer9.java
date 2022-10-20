import java.util.Scanner;

public class Ejer9 {

    public static void main (String [] args) {

        int pisos;
        Scanner recibe = new Scanner(System.in);
        System.out.println("Ingrese el numero de pisos: ");
        pisos = recibe.nextInt();

        for (int i=1; i<=pisos; i++) {
            System.out.println("");
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }
        }
        System.out.println("");

    }
}
