public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Hyacinth Middlethorpe", "Hauser Street, 93");

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Endereco: " + cliente.getEndereco());
        cliente.oi();

    }
}
