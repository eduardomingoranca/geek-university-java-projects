import java.util.Scanner;

/**
 * Escreva um codigo em Java que apresente a classe Retangulo, com atributos
 * comprimento, largura, area e perimetro e, os metodos calcularArea, calcularPerimetro
 * e imprimir. Os metodos calcularArea e calcularPerimetro devem efetuar seus
 * respectivos calculos e colocar os valores nos atributos area e perimetro.
 * O metodo imprimir deve mostrar na tela os valores de todos os atributos.
 * Salienta-se que a area de um retangulo eh obtida pela formula (comprimento * largura)
 * e o perimetro por (2 * comprimento) + (2 + largura).
 */
public class Desafio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o comprimento do retangulo: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Informe a largura do retangulo: ");
        double largura = scanner.nextDouble();

        Retangulo retangulo = new Retangulo();
        retangulo.setComprimento(comprimento);
        retangulo.setLargura(largura);

        System.out.println(retangulo);

        scanner.close();
    }
}
