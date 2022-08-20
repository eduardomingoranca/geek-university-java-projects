import java.util.List;
import java.util.Scanner;

/**
 Se os numeros de 1 a 5 sao escritos em palavras: um, dois, tres, quatro, cinco, entao ha
 2 + 4 + 4 + 6 + 5 = 21 letras usadas no total. Faca um programa que conte quantas letras
 seriam utilizadas se todos os numeros de 1 a 1000 (mil) fossem escritos em palavras
 OBS: Nao conte espacos ou hifens.
 */
public class Desafio62 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numero = "um dois tres quadro cinco";

        List<String> numeros = List.of(numero.split(" "));

        int soma = 0;
        for (String n: numeros) soma += n.length();

        System.out.println("SOMA: " + soma);

        scanner.close();
    }

}
