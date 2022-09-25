// Ainda sobre funcoes
public class Programa02 {

    public static void main(String[] args) {
        int valor1 = 6, valor2 = 4; //, res;

//        int res = soma(valor1, valor2);

//        System.out.println("O resultado eh " + res);
        System.out.println("O resultado eh " + soma(valor1, valor2, "Ola"));

        System.out.println(mensagem());
    }

    static int soma(int valor1, int valor2, String msg) {
        System.out.println(msg);
        return valor1 + valor2;
    }

    static String mensagem() {
        return "Ola usuario";
    }

}
