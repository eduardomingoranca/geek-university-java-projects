/**
 * Existe hierarquia de excecoes? OU seja ao se escrever uma sequencia de excecoes
 * no bloco catch eh necessario se observar uma certa sequencia hierarquia nos tipos
 * de excecao ou se pode declara-las em qualquer ordem?
 * Sim, todas as exceptions sao hierarquicamente filhas de Throwable
 */
public class Desafio03 {

    public static void main(String[] args) {
        try {
            // executa o codigo de risco que pode gerar uma exception
        } catch (Throwable ex) {
            // tratamento da exception
        }
    }
}
