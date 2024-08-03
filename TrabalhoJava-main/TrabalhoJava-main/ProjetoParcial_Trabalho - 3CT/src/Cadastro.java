import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    Scanner scanner = new Scanner(System.in);
    BancoDeDados bancoDeDados = new BancoDeDados();
    String nome;
    String nomeProduto;
    String lerProduto;
    String produtoDelete;
    String adicionarFuncionario;
    String dataDeNascimento;
    String cpf;
    String telefone;
    String deleteFuncionario;

    void adicionarProduto(){
        bancoDeDados.connect();
        System.out.println("Digite o nome do produto a ser adicionado: ");
        this.nomeProduto = scanner.nextLine();
        System.out.println("Funcionario "+ nomeProduto +" registrado com sucesso!" );
    }

    void lerProduto(){
        bancoDeDados.connect();
        System.out.println("Digite o nome do produto a pesquisar:");
        this.lerProduto = scanner.nextLine();
        bancoDeDados.close();
    }
    void deletarProduto(){
        System.out.println("Digite o nome do produto a ser removido: ");
        this.produtoDelete = scanner.nextLine();
        if(produtoDelete.equals(nomeProduto)){
            this.nomeProduto = "";
            System.out.println("Produto "+ produtoDelete +" deletado com sucesso!" );
        } else {
            System.out.println("Produto "+ produtoDelete +" não encontrado!" );
        }
    }

    void adicionarFuncionario(){
        bancoDeDados.connect();
        System.out.println("Digite o nome do funcionario");
        this.adicionarFuncionario = scanner.nextLine();
        System.out.println("Digite a data de nascimento do funcionario");
        this.dataDeNascimento = scanner.nextLine();
        System.out.println("Digite CPF do funcionario");
        this.cpf = scanner.nextLine();
        System.out.println("Digite o telefone do funcionario");
        this.telefone = scanner.nextLine();
        bancoDeDados.close();
    }

    void lerFuncionario(){
        bancoDeDados.connect();
        System.out.println("Digite o nome do funcionario a pesquisar:");
        this.nome = scanner.nextLine();
        bancoDeDados.close();
    }
    void deletarFuncionario() {
        System.out.println("Digite o nome do funcionario a ser removido: ");
        this.deleteFuncionario = scanner.nextLine();
        if (deleteFuncionario.equals(nomeProduto)) {
            this.deleteFuncionario = "";
            System.out.println("Produto " + deleteFuncionario + " deletado com sucesso!");
        } else {
            System.out.println("Produto " + deleteFuncionario + " não encontrado!");
        }
    }
    void imprimirMenu(){
        System.out.println("Escolha uma opção:");
        System.out.println("1- Inserir produto");
        System.out.println("2- Deletar produto");
        System.out.println("3- Consultar produto");
        System.out.println("4- Inserir funcionário");
        System.out.println("5- Consultar funcionário");
        System.out.println("6- Deletar funcionário");
        System.out.println("7- Sair");
    }
        }