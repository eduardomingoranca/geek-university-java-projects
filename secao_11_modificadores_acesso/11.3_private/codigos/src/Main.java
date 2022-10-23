/**
 * Private
 * - Privado a propria classe.
 * ou seja, so temos acesso ao atributo ou metodo privado
 * dentro da propria classe onde ele foi declarado.
 */
public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Hyacinth Middlethorpe", "Hauser Street, 93");

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Endereco: " + cliente.getEndereco());
    }
}
