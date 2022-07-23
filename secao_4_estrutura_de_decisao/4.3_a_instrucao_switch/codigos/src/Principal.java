// Instrucao Switch
public class Principal {

    public static void main(String[] args) {
        int numero = 3;

        switch (numero) {
            case 1:
                System.out.println("O numero eh 1");
                break;
            case 3:
                System.out.println("O numero eh 3");
                break;
            case 5:
                System.out.println("O numero eh 5");
                break;
            default:
                System.out.println("[Default] O numero eh " + numero);
                break;

        }
    }
}
