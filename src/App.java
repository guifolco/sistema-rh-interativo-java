import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>(); 

        while (true) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            if (opcao == 1) {
                cadastrarFuncionario(scanner, funcionarios);
            } else if (opcao == 2) {
                listarFuncionarios(funcionarios);
            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }


    private static void exibirMenu() {
        System.out.println("\n--- SISTEMA DE FOLHA DE PAGAMENTO ---");
        System.out.println("1 - Cadastrar Funcionário");
        System.out.println("2 - Listar Funcionários");
        System.out.println("3 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarFuncionario(Scanner scanner, List<Funcionario> funcionarios) {
        System.out.println("--- Cadastro de Novo Funcionário ---");
        System.out.println("Qual o cargo do funcionário? (1 - Vendedor, 2 - Gerente, 3 - Telefonista)");
        int cargo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o código do funcionário: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        Funcionario funcionarioNovo;
        switch (cargo) {
            case 1:
                funcionarioNovo = new Vendedor(nome, codigo);
                break;
            case 2:
                funcionarioNovo = new Gerente(nome, codigo);
                break;
            case 3:
                funcionarioNovo = new Telefonista(nome, codigo);
                break;
            default:
                System.out.println("Cargo inválido. Funcionário não cadastrado.");
                return;
        }
        funcionarios.add(funcionarioNovo);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    private static void listarFuncionarios(List<Funcionario> funcionarios) {
        System.out.println("\n--- Lista de Funcionários ---");
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado ainda.");
            return;
        }
        for (Funcionario func : funcionarios) {
            System.out.println(func.imprimirFolhaPagamento());
            System.out.println("--------------------------");
        }
    }
}