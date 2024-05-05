package view;
import controller.CadastroFuncionario;
import model.Desenvolvedor;
import model.Estagiario;
import model.Gerente;
import model.Funcionario;

public class Sistema {
    
    public static void mostrarMenu(){

        System.out.println("\n--- SISTEMA DE GERENCIAMENTO DE FUNCIONÁRIOS ---");
        System.out.println("\nMENU - GERENCIAMENTO DE FUNCIONARIOS");
        System.out.println("1) - Cadastrar Gerente");
        System.out.println("2) - Cadastrar Desenvolvedor");
        System.out.println("3) - Cadastrar Estagiário");
        System.out.println("4) - Remover Funcionario");
        System.out.println("5) - Buscar Funcionario");
        System.out.println("6) - Listar Funcionarios");
        System.out.println("0) - Sair do programa");
        System.out.print("Insira a opção: ");
    }

    public static void selectOption(int op){

        String nome;
        int matricula;
        float hrsTrab;
        float valorHr;

        switch (op) {
            case 1:
                System.out.println("\nOpção escolhida -- Cadastrar Gerente");
                System.out.print("Digite o nome do Gerente: ");
                nome = Console.lerString();

                System.out.print("Digite a matricula do Gerente: ");
                matricula = Console.lerInt();

                System.out.print("Nome da equipe que gerencia: ");
                String equipeComand = Console.lerString();

                System.out.print("Digite o valor da hora: R$ ");
                valorHr = Console.lerFloat();

                System.out.print("Digite as horas trabalhadas: ");
                hrsTrab = Console.lerFloat();

                System.out.print("Informe o bonus anual: R$ ");
                float bonusAnual = Console.lerFloat();

                Gerente gerente = new Gerente(nome, matricula, hrsTrab, valorHr, bonusAnual, equipeComand);

                CadastroFuncionario.cadastrarFuncionario(gerente);

                System.out.println("\nGerente cadastrado com sucesso!");

                break;

            case 2:
                System.out.println("\nOpção escolhida -- Cadastrar Desenvolvedor");
                System.out.print("Digite o nome do desenvolvedor: ");
                nome = Console.lerString();

                System.out.print("Digite a matricula do desenvolvedor: ");
                matricula = Console.lerInt();

                System.out.print("Tecnologia que domina: ");
                String tecnologias = Console.lerString();

                System.out.print("Digite o valor da hora: R$ ");
                valorHr = Console.lerFloat();

                System.out.print("Digite as horas trabalhadas: ");
                hrsTrab = Console.lerFloat();

                Desenvolvedor desenvolvedor = new Desenvolvedor(nome, matricula, hrsTrab, valorHr, tecnologias);

                CadastroFuncionario.cadastrarFuncionario(desenvolvedor);

                System.out.println("\nDesenvolvedor cadastrado com sucesso!");

                break;

            case 3:
                System.out.println("\nOpção escolhida -- Cadastrar Estagiário");
                System.out.print("Digite o nome do estagiário: ");
                nome = Console.lerString();

                System.out.print("Digite a matricula do estagiário: ");
                matricula = Console.lerInt();

                System.out.print("Supervisor: ");
                String supervisor = Console.lerString();

                System.out.print("Digite o valor da hora: R$ ");
                valorHr = Console.lerFloat();

                System.out.print("Digite as horas trabalhadas: ");
                hrsTrab = Console.lerFloat();

                Estagiario estagiario = new Estagiario(nome, matricula, hrsTrab, valorHr, supervisor);

                CadastroFuncionario.cadastrarFuncionario(estagiario);

                System.out.println("\nEstagiário cadastrado com sucesso!");

                break;

            case 4:
                System.out.println("\nOpção escolhida -- Remover Funcionário");

                System.out.print("Digite a matricula do funcionario que deseja remover: ");
                matricula = Console.lerInt();

                if(CadastroFuncionario.removerFuncionario(matricula)){
                System.out.println("\nFuncionario " + matricula + " removido com sucesso!");
                }
                else{
                    System.out.println("\nFuncionario não encontrado ou já removido!");
                }

                break;

            case 5:
                System.out.println("\nOpção escolhida -- Buscar Funcionario");

                System.out.print("Digite a matricula ou nome do funcionário que deseja buscar: ");
                String termoBusca = Console.lerString();

                matricula = -1;
                if (termoBusca.matches("\\d+")) {
                    matricula = Integer.parseInt(termoBusca);
                }

                Funcionario funcEncontrado = CadastroFuncionario.buscarFuncionario(matricula, termoBusca);

                if (funcEncontrado != null) {
                    System.out.println("\nFuncionario encontrado com sucesso!");
                } else {
                    System.out.println("\nFuncionario não encontrado!");
                }
                break;
              

            case 6:
                System.out.println("\nOpção escolhida -- Listar Funcionários");

                if (CadastroFuncionario.listaFuncionario()) {
                }
                else{
                    System.out.println("\nNenhum funcionario cadastrado!");
                }
                break;

            case 0:
                System.out.println("\nSaindo do programa......");
                break;
        
            default:
            System.out.println("\nNúmero inválido. Digite novamente: ");
                break;
        }
    }

    public static void executar() {

        int op;

        do {

            mostrarMenu();
            op = Console.lerInt();
            selectOption(op);

        } while (op != 0);

    }
}
