/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.sp.pi.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.senac.sp.pi.model.Clientes;

/**
 *
 * @author denis
 */
public class TelaCadastroClienteDAO {
    

public static boolean salvar(Clientes obj) {
        boolean retorno = false;
        Connection conexao;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/lojaInformatica";

            conexao = DriverManager.getConnection(url, "root", "");
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO computador "
                    + "(hdComputador, processador, marca) VALUES(?,?, ?)");
            //comandoSQL.setString(1, obj.getHD());
            //comandoSQL.setString(2, obj.getProcessador());
            // comandoSQL.setString(3, obj.getMarca());

            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException x) {
            System.out.println("Erro ao carregar o Drive");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return retorno;

    }
}


