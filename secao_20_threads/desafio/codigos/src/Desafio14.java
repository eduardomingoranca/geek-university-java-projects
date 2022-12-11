/**
 * Qual a diferenca entre o metodo sleep() e o metodo join() da classe Thread?
 * RESPOSTA: O metodo sleep() faz com que o thread em execucao no momento entre em
 * suspensao pelo numero especificado de milissegundos, sujeito a precisao e exatidao
 * dos cronometros e agendadores do sistema. Ja o metodo join()  é usado para juntar o
 * inicio da execucao de uma thread ao final da execucao de outra thread, de forma que
 * uma thread nao comece a ser executada ate que outra thread termine.
 */
public class Desafio14 {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new SleepDemo());
        // call run() function
        t.start();

        Thread t2 = new Thread(new SleepDemo());
        // call run() function
        t2.start();

        Thread t3 = new Thread(new JoinDemo());
        t3.start();

        // Waits for 1000ms this thread to die.
        t3.join(1000);

        System.out.println("\nJoining after 1000 milliseconds: \n");
        System.out.println("Current thread: " + t3.getName());

        // Checks if this thread is alive
        System.out.println("Is alive? " + t3.isAlive());
    }

}
