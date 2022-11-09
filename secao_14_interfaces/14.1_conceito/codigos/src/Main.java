/**
 * Interfaces - O que eh e quando utilizar
 * <p>
 * Interfaces sao conhecidas como "contratos"
 * <p>
 * Uma empresa criou um contrato "com regras" para definir
 * a criacao de um produto/servico.
 * <p>
 * Quem implementar este contrato eh OBRIGADO a seguir as regras.
 * <p>
 * O John decidiu implementar um produto/servico baseado neste contrato.
 * A Mary, tambem decidiu implementar um produto/servico baseado no mesmo contrato.
 * <p>
 * Contrato para a confeccao de um bolo:
 *      - O bolo precisa ser de chocolate;
 *      - O bolo deve ter cobertura;
 *      - O bolo deve ser recheado;
 */
public class Main {

    public static void main(String[] args) {
        Ventilador ventilador = new Ventilador();

        System.out.println("A marca do ventilador eh: " + ventilador.MARCA);

        ventilador.desligar(); // Nao deve imprimir a mensagem
        ventilador.ligar(); // Deve imprimir a mensagem
        ventilador.desligar(); // Deve imprimir a mensagem
    }
}
