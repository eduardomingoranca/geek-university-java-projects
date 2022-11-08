package heranca;

import java.util.Scanner;

public class TestaEquipamento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a marca do equipamento: ");
        String marca = scanner.nextLine();

        System.out.print("Informe o fabricante do equipamento: ");
        String fabricante = scanner.nextLine();

        Equipamento equipamento = new Equipamento();
        equipamento.setMarca(marca);
        equipamento.setFabricante(fabricante);
        System.out.println(equipamento);

        System.out.print("Informe a marca do computador: ");
        String marcaComputador = scanner.nextLine();

        System.out.print("Informe o fabricante do computador: ");
        String fabricanteComputador = scanner.nextLine();

        System.out.print("Informe a capacidade de memoria: ");
        int memoria = Integer.parseInt(scanner.nextLine());

        System.out.print("Informe a capacidade de cpu: ");
        int cpu = Integer.parseInt(scanner.nextLine());

        Computador computador = new Computador();
        computador.setCapacidadeMemoria(memoria);
        computador.setCapacidadeCPU(cpu);
        computador.setFabricante(fabricanteComputador);
        computador.setMarca(marcaComputador);
        System.out.println(computador);

        scanner.close();
    }
}
