// if, else, else if
public class Principal {

    public static void main(String[] args) {
        // declarando e inicializando a variavel
        int numero = 2;

        if (numero > 5) {
            System.out.println("Sim, o numero " + numero + " eh maior que 5.");
        } else if (numero == 5) {
            System.out.println("O numero " + numero + " eh igual a 5.");
        } else if (numero % 2 == 0) {
            System.out.println("O numero " + numero + " eh par.");
        } else {
            System.out.println("Nao, o numero " + numero + " nao eh maior que 5.");
        }

    }
}
