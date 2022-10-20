public class Ejer10 {
    public static void main (String [] args) {

        char[] simbolo = new char[10];

        simbolo[0] = 'h';
        simbolo[1] = 'z';
        simbolo[5] = '@';
        simbolo[7] = ' ';
        simbolo[8] = '+';
        simbolo[9] = 'j';

        for (int i = 0; i < 10; i++) {
            System.out.print(simbolo[i] + " ");
        }

    }
}
