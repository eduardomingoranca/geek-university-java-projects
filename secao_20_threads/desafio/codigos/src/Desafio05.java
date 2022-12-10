/**
  Pense numa classe Pilha. Implemente a classe e suas duas principais operacoes
  (push e pop). Push eh um metodo que DEVE lancar uma excecao do tipo (PilhaCheia)
  sempre que nao couber elementos na pilha. Pop deve lancar uma excecao do tipo
  PilhaVazia? caso a pilha nao tenha mais elementos para serem retirados. Ambos
  excecoes sao herdeiras da excecao PilhaExcecao. Implemente TODAS as 3 classes
  de excecao e os metodos que as lancam? push e pop. Implemente tambem uma classe
  TESTE que mostra como criar a pilha e invocar os metodos push e pop com os
  respectivos tratamentos de excecoes.
 */
public class Desafio05 {

    public static void main(String[] args) {
        Pilha pilha = new Pilha(0);

        pilha.removeNome();

    }
}
