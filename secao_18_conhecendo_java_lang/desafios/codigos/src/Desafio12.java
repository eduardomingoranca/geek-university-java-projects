import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Abra um arquivo texto, calcule e escreva o numero de caracteres, o numero de linhas e
 * o numero de palavras neste arquivo. Escreva tambem quantas vezes cada letra ocorre
 * no arquivo (ignorando letras com acento). Obs.: palavras sao separadas por um ou mais
 * caracteres espaco, tabulacao ou nova linha.
 */
public class Desafio12 {

    public static final String REGEX = "(?!^)";

    public static void main(String[] args) {
        try {
            Scanner read = new Scanner(new FileInputStream("total.txt"));

            int quantidadeA = 0, quantidadeB = 0, quantidadeC = 0, quantidadeD = 0, quantidadeE = 0;
            int quantidadeF = 0, quantidadeG = 0,quantidadeH = 0, quantidadeI = 0, quantidadeJ = 0;
            int quantidadeK = 0, quantidadeL = 0, quantidadeM = 0, quantidadeN = 0, quantidadeO = 0;
            int quantidadeP = 0, quantidadeQ = 0, quantidadeR = 0, quantidadeS = 0, quantidadeT = 0;
            int quantidadeU = 0, quantidadeV = 0, quantidadeW = 0, quantidadeX = 0, quantidadeY = 0;
            int quantidadeZ = 0;

            int numeroCaracteres = 0;
            int numeroLinhas = 0;
            int numeroPalavras = 0;

            while (read.hasNextLine()) {
                String texto = read.nextLine();

                for (int i = 0; i < texto.length(); i++) {
                    numeroCaracteres++;
                }
                numeroLinhas++;
                numeroPalavras++;

                String[] split = texto.split(REGEX);

                for (String s : split) {
                    if (s.equalsIgnoreCase("A"))
                        quantidadeA++;

                    if (s.equalsIgnoreCase("B"))
                        quantidadeB++;

                    if (s.equalsIgnoreCase("C"))
                        quantidadeC++;

                    if (s.equalsIgnoreCase("D"))
                        quantidadeD++;

                    if (s.equalsIgnoreCase("E"))
                        quantidadeE++;

                    if (s.equalsIgnoreCase("F"))
                        quantidadeF++;

                    if (s.equalsIgnoreCase("G"))
                        quantidadeG++;

                    if (s.equalsIgnoreCase("H"))
                        quantidadeH++;

                    if (s.equalsIgnoreCase("I"))
                        quantidadeI++;

                    if (s.equalsIgnoreCase("J"))
                        quantidadeJ++;

                    if (s.equalsIgnoreCase("K"))
                        quantidadeK++;

                    if (s.equalsIgnoreCase("L"))
                        quantidadeL++;

                    if (s.equalsIgnoreCase("M"))
                        quantidadeM++;

                    if (s.equalsIgnoreCase("N"))
                        quantidadeN++;

                    if (s.equalsIgnoreCase("O"))
                        quantidadeO++;

                    if (s.equalsIgnoreCase("P"))
                        quantidadeP++;

                    if (s.equalsIgnoreCase("Q"))
                        quantidadeQ++;

                    if (s.equalsIgnoreCase("R"))
                        quantidadeR++;

                    if (s.equalsIgnoreCase("S"))
                        quantidadeS++;

                    if (s.equalsIgnoreCase("T"))
                        quantidadeT++;

                    if (s.equalsIgnoreCase("U"))
                        quantidadeU++;

                    if (s.equalsIgnoreCase("V"))
                        quantidadeV++;

                    if (s.equalsIgnoreCase("W"))
                        quantidadeW++;

                    if (s.equalsIgnoreCase("X"))
                        quantidadeX++;

                    if (s.equalsIgnoreCase("Y"))
                        quantidadeY++;

                    if (s.equalsIgnoreCase("Z"))
                        quantidadeZ++;

                }

            }


            System.out.println("=============== TOTAIS =================");
            System.out.println("A= " + quantidadeA + " B= " + quantidadeB);
            System.out.println("C= " + quantidadeC + " D= " + quantidadeD);
            System.out.println("E= " + quantidadeE + " F= " + quantidadeF);
            System.out.println("G= " + quantidadeG + " H= " + quantidadeH);
            System.out.println("I= " + quantidadeI + " J= " + quantidadeJ);
            System.out.println("K= " + quantidadeK + " L= " + quantidadeL);
            System.out.println("M= " + quantidadeM + " N= " + quantidadeN);
            System.out.println("O= " + quantidadeO + " P= " + quantidadeP);
            System.out.println("Q= " + quantidadeQ + " R= " + quantidadeR);
            System.out.println("S= " + quantidadeS + " T= " + quantidadeT);
            System.out.println("U= " + quantidadeU + " V= " + quantidadeV);
            System.out.println("W= " + quantidadeW + " X= " + quantidadeX);
            System.out.println("Y= " + quantidadeY + " Z= " + quantidadeZ);
            System.out.println("TOTAL DE CARACTERES: " + numeroCaracteres +
                    "\nTOTAL DE LINHAS: " + numeroLinhas +
                    "\nTOTAL DE PALAVRAS: " + numeroPalavras);

            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        }

    }
}
