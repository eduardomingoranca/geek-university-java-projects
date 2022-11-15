import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

/**
  Faca um programa que receba do usuario um arquivo texto e mostre na tela quantas
  vezes cada letra do alfabeto aparece dentro do arquivo.
 */
public class Desafio06 {

    public static void main(String[] args) {
        try {
            Scanner read = new Scanner(new FileInputStream("alphabet.txt"));

            int quantidadeA = 0, quantidadeB = 0, quantidadeC = 0, quantidadeD = 0, quantidadeE = 0;
            int quantidadeF = 0, quantidadeG = 0,quantidadeH = 0, quantidadeI = 0, quantidadeJ = 0;
            int quantidadeK = 0, quantidadeL = 0, quantidadeM = 0, quantidadeN = 0, quantidadeO = 0;
            int quantidadeP = 0, quantidadeQ = 0, quantidadeR = 0, quantidadeS = 0, quantidadeT = 0;
            int quantidadeU = 0, quantidadeV = 0, quantidadeW = 0, quantidadeX = 0, quantidadeY = 0;
            int quantidadeZ = 0;

            while (read.hasNextLine()) {
                String letter = read.nextLine();
                if (letter.equalsIgnoreCase("A"))
                    quantidadeA ++;

                if (letter.equalsIgnoreCase("B"))
                    quantidadeB ++;

                if (letter.equalsIgnoreCase("C"))
                    quantidadeC ++;

                if (letter.equalsIgnoreCase("D"))
                    quantidadeD ++;

                if (letter.equalsIgnoreCase("E"))
                    quantidadeE ++;

                if (letter.equalsIgnoreCase("F"))
                    quantidadeF ++;

                if (letter.equalsIgnoreCase("G"))
                    quantidadeG ++;

                if (letter.equalsIgnoreCase("H"))
                    quantidadeH ++;

                if (letter.equalsIgnoreCase("I"))
                    quantidadeI ++;

                if (letter.equalsIgnoreCase("J"))
                    quantidadeJ ++;

                if (letter.equalsIgnoreCase("K"))
                    quantidadeK ++;

                if (letter.equalsIgnoreCase("L"))
                    quantidadeL ++;

                if (letter.equalsIgnoreCase("M"))
                    quantidadeM ++;

                if (letter.equalsIgnoreCase("N"))
                    quantidadeN ++;

                if (letter.equalsIgnoreCase("O"))
                    quantidadeO ++;

                if (letter.equalsIgnoreCase("P"))
                    quantidadeP ++;

                if (letter.equalsIgnoreCase("Q"))
                    quantidadeQ ++;

                if (letter.equalsIgnoreCase("R"))
                    quantidadeR ++;

                if (letter.equalsIgnoreCase("S"))
                    quantidadeS ++;

                if (letter.equalsIgnoreCase("T"))
                    quantidadeT ++;

                if (letter.equalsIgnoreCase("U"))
                    quantidadeU ++;

                if (letter.equalsIgnoreCase("V"))
                    quantidadeV ++;

                if (letter.equalsIgnoreCase("W"))
                    quantidadeW ++;

                if (letter.equalsIgnoreCase("X"))
                    quantidadeX ++;

                if (letter.equalsIgnoreCase("Y"))
                    quantidadeY ++;

                if (letter.equalsIgnoreCase("Z"))
                    quantidadeZ ++;
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

            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        }
    }
}
