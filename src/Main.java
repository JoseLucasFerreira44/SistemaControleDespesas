import java.util.*;
import model.Alimentacao;
import model.Transporte;
import model.DespesaEventual;
import model.Despesa;
import servicos.ServicosDespesa;
import servicos.ServicosUsuario;

public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println(" MENU PRINCIPAL \n");
            System.out.println("1. Adicionar Despesa");
            System.out.println("2. Anotar Pagamento");
            System.out.println("3. Listar Despesas");
            System.out.println("4. Gerenciar Usuários");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
        switch (opcao) {
            case 1:
            System.out.println("Descrição: ");
            String desc = sc.nextLine();
            System.out.println("Valor: ");
            double valor = sc.nextDouble();
            System.out.println("Data do vencimento: ");
            String data = sc.nextLine();
            System.out.println("Escolha a categoria:");
            System.out.println("1 - Alimentação");
            System.out.println("2 - Transporte");
            System.out.println("3 - Eventual");
            System.out.print("Opção: ");
            int cat = sc.nextInt();
            sc.nextLine();     
            
            Despesa d = null;
            switch (cat) {
                case 1:
                d = new Alimentacao(desc, valor, data);
                break;
                case 2:
                d = new Transporte(desc, valor, data);
                break;
                case 3:
                d = new DespesaEventual(desc, valor, data);
                break;
            default:
        System.out.println("Categoria inválida! Usando 'Geral'.");
        d = new DespesaEventual(desc, valor, data);
        break;
}

ServicosDespesa.salvar(d);
System.out.println("Despesa adicionada com sucesso!");

            case 2:
            System.out.println("Pagamento registrado manualmente");
            break;

            case 3:
            System.out.println("Despesas");
            ServicosDespesa.listar().forEach(System.out::println);
            break;

            case 4:
            int opcUser;
    do {
        System.out.println("\n=== GERENCIAR USUÁRIOS ===");
        System.out.println("1. Cadastrar novo usuário");
        System.out.println("2. Listar usuários");
        System.out.println("0. Voltar ao menu principal");
        System.out.print("Opção: ");
        opcUser = sc.nextInt();
        sc.nextLine();

        switch (opcUser) {
            case 1:
                System.out.print("Login: ");
                String login = sc.nextLine();
                System.out.print("Senha: ");
                String senha = sc.nextLine();
                ServicosUsuario.cadastrar(login, senha);
                break;

            case 2:
                System.out.println("=== LISTA DE USUÁRIOS ===");
                ServicosUsuario.listarUsuarios();
                break;

            case 0:
                System.out.println("Voltando ao menu principal...");
                break;

            default:
                System.out.println("Opção inválida!");
        }
    } while (opcUser != 0);
    break;

        case 0:
        System.out.println("Encerrando o sistema");
        break;

        default:
        System.out.println("Opção inválida");
        }
    }while(opcao != 0);
    sc.close();
}
}