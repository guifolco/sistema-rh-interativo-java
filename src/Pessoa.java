public class Pessoa {

    private String nome;
    private int codigo;

    public Pessoa(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }
    

    @Override
    public String toString() {  
            return "Pessoa{" +
                    "código=" + codigo +
                    ", nome='" + nome + '\'' +
                    '}';
        }
    }
