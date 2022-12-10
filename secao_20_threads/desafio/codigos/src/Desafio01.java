import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Qual a diferenca entre uma excecao verificada e  nao verificada.
 * De exemplo de ambas.
 * RESPOSTA: A principal diferenca entre uma excecao verificada e outra
 * nao verificada eh que a primeira obriga o desenvolvedor a trata-la,
 * isto eh, usar umas das duas formas basicas de tratamento de excecao no
 * Java: captura ou tratamento; enquanto a segunda excecao nao o faz.
 */
public class Desafio01 {

    public static void main(String[] args) {
        // excecao verificada
        readFile("myFile.txt");

        // excecao nao verificada
        printLength(null);
    }

    private static void readFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao existe!");
        }
    }

    private static void printLength(String myString) {
        try {
            System.out.println(myString.length());
        } catch (NullPointerException e) {
            System.out.println("String nao pode ser nula!");
        }
    }

}
