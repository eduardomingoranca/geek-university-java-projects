import java.util.Scanner;

/**
 * Ler uma sequencia de numeros inteiros e determinar se eles sao pares ou nao. Devera
 * ser informado o numero de dados lidos e numero de valores pares. O processo termina
 * quando for digitado o numero .
 */
public class Desafio20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int par = 0;
        int quantidade = 0;

        do {
            System.out.print("Informe um numero inteiro [numero 1000 para sair]: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0 && numero != 1000) par++;
            if (numero != 1000) quantidade++;

            if (numero == 1000) System.out.println("NUMEROS LIDOS: " + quantidade +
                    " NUMEROS PARES: " + par);
        } while (numero != 1000);

        scanner.close();
    }
}
