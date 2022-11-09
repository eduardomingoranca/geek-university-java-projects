/**
 * Uma interface pode conter:
 * - Constantes;
 * - Metodos abstratos;
 * <p>
 * Interface para servir de contrato para produtos eletronicos. Todo
 * produto eletronico que implementar esta interface OBRIGATORIAMENTE
 * deverao implementar os metodos abstratos.
 */
public interface IEletronico {
    String MARCA = "Geek";
    void ligar();
    void desligar();
}
