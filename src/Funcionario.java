public class Funcionario extends Pessoa {

    private static final double SALARIO_BASE = 2000.0;

    public Funcionario(String nome, int codigo) {
        super(nome, codigo);
    }
    
    public double getSalario() {   
        return SALARIO_BASE;
    }

    public String imprimirFolhaPagamento() {
        return "--- Folha de Pagamento ---\n" +
            "Nome: " + this.getNome() + "\n" +
            "Código: " + this.getCodigo() + "\n" +
            "Salário Final: R$ " + String.format("%.2f", this.getSalario());
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "salarioBase=" + SALARIO_BASE +
                "} " + super.toString();
    }
}
