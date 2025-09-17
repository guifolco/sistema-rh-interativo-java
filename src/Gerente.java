public class Gerente extends Funcionario {

    public Gerente(String nome, int codigo) {
        super(nome, codigo);
    }

    @Override
    public double getSalario() {
        return super.getSalario() + (super.getSalario() * 0.45);
    }
}
