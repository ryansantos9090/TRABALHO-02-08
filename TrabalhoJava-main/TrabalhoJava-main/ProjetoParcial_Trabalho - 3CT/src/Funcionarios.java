import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Funcionarios {

    public void createTable() {
        try (Statement statement = BancoDeDados.connection.createStatement()) {
                statement.execute("CREATE TABLE IF NOT EXISTS Clientes (ID INTEGER PRIMARY KEY, Nome VARCHAR, Idade INTEGER)");
                BancoDeDados.connection.commit();
                System.out.println("Tabela criada ou já existe.");
            } catch (SQLException e) {
                System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

    public void inserirFuncionario(List<String[]> lista) {
            try (PreparedStatement insertStatement = BancoDeDados.connection.prepareStatement("INSERT INTO clientes(Nome, Idade) VALUES(?, ?)")) {
                for (String[] s : lista) {
                    insertStatement.setString(1, s[0]);
                    insertStatement.setInt(2, Integer.parseInt(s[1]));
                    insertStatement.executeUpdate();
                }
                BancoDeDados.connection.commit();
                System.out.println("Clientes inseridos.");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir Funcionario: " + e.getMessage());
        }
    }

    public void lerFuncionario(String nomeQuery) {
            try (PreparedStatement selectStatement = BancoDeDados.connection.prepareStatement("SELECT * FROM Clientes WHERE Idade >= 18 ")) {
                ResultSet resultSet = selectStatement.executeQuery();
                System.out.println("Funcionario:");
                while (resultSet.next()) {
                    int idade = resultSet.getInt("Idade");
                    String nome = resultSet.getString("Nome");
                    System.out.println("Nome: " + nome + ", Idade: "+ idade);
                }
            } catch (SQLException e) {
                System.out.println("Erro ao consultar clientes: " + e.getMessage());
        }
    }

    public void deleteFuncionario(String nome) {
            try (PreparedStatement deleteStatement = BancoDeDados.connection.prepareStatement("DELETE FROM Clientes WHERE Idade < 18")) {
                deleteStatement.executeUpdate();
                BancoDeDados.connection.commit();
                System.out.println("Cliente deletado.");
            } catch (SQLException e) {
                System.out.println("Erro ao deletar cliente: " + e.getMessage());
        }
    }
}
