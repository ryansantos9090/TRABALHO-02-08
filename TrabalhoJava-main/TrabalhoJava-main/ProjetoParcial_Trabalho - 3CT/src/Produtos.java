import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Produtos {

    public void createTable() {
        try (Statement statement = BancoDeDados.connection.createStatement()) {
            statement.execute("CREATE TABLE IF NOT EXISTS Produto ... //Insira seu código aqui");

            //Insira seu código aqui

        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

    public void inserirProdutos(List<String[]> lista) {
        try (PreparedStatement insertStatement = BancoDeDados.connection.prepareStatement("INSERT INTO Produto... //Insira seu código aqui")) {

            //Insira seu código aqui

        } catch (SQLException e) {
            System.out.println("Erro ao inserir produto: " + e.getMessage());
        }
    }

    public void lerProduto(String nomeQuery) {
        try (PreparedStatement selectStatement = BancoDeDados.connection.prepareStatement("SELECT * FROM Produto... //Insira seu código aqui")) {

            //Insira seu código aqui

        } catch (SQLException e) {
            System.out.println("Erro ao consultar produto: " + e.getMessage());
        }
    }

    public void deleteProduto(String nome) {
        try (PreparedStatement deleteStatement = BancoDeDados.connection.prepareStatement("DELETE FROM Produto... //Insira seu código aqui")) {

            //Insira seu código aqui

        } catch (SQLException e) {
            System.out.println("Erro ao deletar produtos: " + e.getMessage());
        }
    }
}
