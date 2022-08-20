// Operacoes Matematicas
public class Programa05 {

    public static void main(String[] args) {
        int num1 = 5, num2 = 9, res;
        float res2;

        // soma
        res = num1 + num2;
        System.out.println("A soma de " + num1 + " + " + num2 + " eh " + res);

        // subtracao
        res = num1 - num2;
        System.out.println("A subtracao de " + num1 + " - " + num2 + " eh " + res);

        // multiplicacao
        res = num1 * num2;
        System.out.println("A multiplicacao de " + num1 + " / " + num2 + " eh " + res);

        // divisao (inteira)
        res = num2 / num1;
        System.out.println("A divisao inteira de " + num2 + " / " + num1 + " eh " + res);

        // divisao (real)
        res2 = (float) num2 / (float) num1;
        System.out.println("A divisao real de " + num2 + " / " + num1 + " eh " + res2);

        // Modulo
        /**
         * Se o resto do modulo da variavel por 2 for 0, a variavel
         * eh par. Se o resto 1, a variavel eh impar.
         * */
        res = num1 % 2;
        System.out.println("O resto da divisao de " + num1 + "por 2 eh " + res);

        res = num2 % 3;
        System.out.println(num2 + " eh divisivel por 3? " + res);

    }
}
