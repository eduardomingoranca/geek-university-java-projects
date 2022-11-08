package sobrecarga;

public class Pessoa {
    private Integer codigo;
    private String nome;
    private Integer idade;

    public Pessoa() {
    }

    public Pessoa(Integer codigo, String nome, Integer idade) {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String exibe() {
        return "Pessoa{" +
                "codigo=" + getCodigo() +
                ", nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                '}';
    }

    public String exibe(int numero) {
        if (numero == 1) {
            return "Pessoa{" +
                    "codigo=" + getCodigo() +
                    ", nome='" + getNome() + '\'' +
                    ", idade=" + getIdade() +
                    '}';
        }

        return "Pessoa{" +
                "codigo=" + getCodigo() +
                ", nome='" + getNome() + '\'' + '}';
    }

}
