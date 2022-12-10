/**
 * Como eh a estrutura de controle para se usar/capturar excecoes em Java? Explique
 * como funciona o bloco try catch e finally
 * RESPOSTA: Dentro do bloco de codigo pertencente ao try eh colocado um codigo de risco, algo que possa gerar
 * uma excecao, no catch pode-se tratar essa excecao, se o bloco try executar seus comandos perfeitamente
 * o bloco catch nao eh chamado, so eh chamado quando ocorre uma excecao dentro do bloco try, e o bloco finally,
 * ocorre independente se o bloco try gera alguma excecao ou nao, vem logo apos o bloco catch
 */
public class Desafio02 {

    public static void main(String[] args) {

        try {
            // executa o codigo de risco que pode gerar uma exception
        } catch (Exception ex) {
            // tratamento da exception
        } finally {
            // executado independentemente se o bloco try gera uma exception. sempre sera executado
        }
    }
}
