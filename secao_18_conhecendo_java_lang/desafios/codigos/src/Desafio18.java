import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Faca um programa que leia um arquivo contendo o nome e o preco de diversos produtos
 * (separados por linha), e calcule o total da compra.
 */
public class Desafio18 {

    public static void main(String[] args) {
        try {
            Scanner read = new Scanner(new FileInputStream("market.txt"));

            BigDecimal sum = new BigDecimal("0");

            while (read.hasNextLine()) {
                BigDecimal precos = new BigDecimal(read.nextLine().substring(15, 19));
                sum = precos.add(sum);
            }

            System.out.println("PRECO TOTAL R$ " + sum);

            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        }
    }
}
