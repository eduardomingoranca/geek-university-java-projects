import static java.lang.Math.random;
import static java.lang.Math.round;

// Vetores parte 2
public class Programa02 {

    public static void main(String[] args) {
        // declaracao e definicao de tamanho do vetor
        int numeros[] = new int[10];

        System.out.println("Tamanho do vetor: " + numeros.length);

        for (int i = 0; i < numeros.length; i++) {
            // numeros[0] = i + 3;
            numeros[i] = i + 3;
            // numeros[9] = i + 3;
        }

        System.out.println(numeros[0]); // primeiro elemento
        System.out.println(numeros[9]); // ultimo elemento

        //0..9
        // numeros[10] = 42;
        // System.out.println(numeros[10]);
        /*
            Os vetores/arrays possuem tamanho fixo e nao
            podem ser aumentados/diminuidos
         */

        numeros[0] = 7;
        System.out.println(numeros[0]); // primeiro elemento

        //numeros[0] = 23.4f;
        /*
            Os vetores/arrays possuem tipos de dados fixos
            e nao aceitam tipos variados.
         */
        for (int i = 0; i < numeros.length; i++)
            numeros[i] = (int) round(random() * 10);

        System.out.println(numeros[0]); // primeiro elemento
        System.out.println(numeros[9]); // ultimo elemento

        // 0...1 double
        System.out.println(random());

        System.out.println(random() * 10);

        System.out.println(round(random() * 10));

        for (int i: numeros) System.out.println(i);

    }
}
