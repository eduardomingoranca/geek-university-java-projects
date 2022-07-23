// Operador ternario
public class Principal {

    public static void main(String[] args) {
        int valor = 3, numero;

//        if (valor > 0) {
//            numero = valor;
//        } else {
//            numero = 7;
//        }

        // Operador ternario
        numero = (valor > 0) ? valor : 7;

        System.out.println(numero);
    }
}
