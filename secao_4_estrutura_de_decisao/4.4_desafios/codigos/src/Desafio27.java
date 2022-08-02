import java.util.Scanner;

/**
 * Escreva um programa que, dada a idade de um nadador, classifique-o em uma das
 * seguintes categorias:
 *                       | Categoria  |        Idade       |
 *                       | Infantil A |        5 a 7       |
 *                       | Infantil B |        8 a 10      |
 *                       | Juvenil A  |       11 a 13      |
 *                       | Juvenil B  |       14 a 17      |
 *                       | Senior     | maiores de 18 anos |
 *
 *
 */
public class Desafio27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a idade do nadador: ");
        int idade = scanner.nextInt();

        if (idade >= 5 && idade <= 7)
            System.out.println("Infantil A");
        else if (idade >= 8 && idade <= 10)
            System.out.println("Infantil B");
        else if (idade >= 11 && idade <= 13)
            System.out.println("Juvenil A");
        else if (idade >= 14 && idade <= 17)
            System.out.println("Juvenil B");
        else if (idade >= 18)
            System.out.println("maiores de 18 anos");
        else System.out.println("idade invalida!");

        scanner.close();
    }
}
