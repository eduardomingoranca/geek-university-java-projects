/**
 * Metodos
 * Podemos entender os metodos como a acao que eh realizada por um objeto da classe;
 * Podemos entender tambem que os metodos sao comportamentos dos objetos da classe;
 * <p>
 * Mesmos requisitos para funcoes:
 *      Uma funcao deve ter o seguinte:
 *      a) Tipo de retorno (Tipo de dado que a funcao vai retornar);
 *      b) Nome - Corresponde a acao que a funcao realiza;
 *      c) Parametros/Argumentos de entrada (Opcional);
 *      d) Retorno (Opcional - depende do tipo de retorno);
 */
public class Produto {
    String nome;
    float preco;
    float desconto;

    // Metodo para aumentar o preco do projeto
    void aumentarPreco(float valor) {
        this.preco += valor;
    }
}
