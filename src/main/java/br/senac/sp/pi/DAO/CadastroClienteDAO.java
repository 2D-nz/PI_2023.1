/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.sp.pi.DAO;

import br.senac.sp.pi.model.Clientes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author denis
 */
public class CadastroClienteDAO {

    /**
     *
     * @author denis
     */
    public static boolean salvar(Clientes obj) {
        boolean retorno = false;
        Connection conexao;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/iClothes";

            conexao = DriverManager.getConnection(url, "root", "");
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO cadastroCliente "
                    + "(nome, cpf, dataNascimento, estadoCivil, telefone, email, endereco, bairro, cidade, estado, cep, genero) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
            comandoSQL.setString(1, obj.getNome());
            comandoSQL.setString(2, obj.getCPF());
            comandoSQL.setString(3, obj.getDataNascimento());
            comandoSQL.setString(4, obj.getEstadoCivil());
            comandoSQL.setString(5, obj.getTelefone());
            comandoSQL.setString(6, obj.getEmail());
            comandoSQL.setString(7, obj.getEndereco());
            comandoSQL.setString(8, obj.getBairro());
            comandoSQL.setString(9, obj.getCidade());
            comandoSQL.setString(10, obj.getEstado());
            comandoSQL.setString(11, obj.getCep());
            comandoSQL.setString(12, obj.getGenero());

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

    public static ArrayList<Clientes> listar(String cpf) {
        ArrayList<Clientes> listaRetorno = new ArrayList();
        Connection conexao = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/iclothes";
            conexao = DriverManager.getConnection(url, "root", "");

            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * from cadastroCliente where cpf = " + cpf);
            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Clientes cliente = new Clientes();
                    cliente.setCPF(cpf);
                    cliente.setDataNascimento(rs.getString("dataNascimento"));
                    cliente.setNome(rs.getString("nome"));
                    cliente.setEmail(rs.getString("email"));
                    cliente.setTelefone(rs.getString("telefone"));
                    cliente.setCep(rs.getString("cep"));
                    cliente.setGenero(rs.getString("genero"));
                    cliente.setEndereco(rs.getString("endereco"));
                    cliente.setCidade(rs.getString("cidade"));
                    cliente.setBairro(rs.getString("bairro"));
                    cliente.setEstado(rs.getString("estado"));
                    cliente.setEstadoCivil(rs.getString("estadoCivil"));

                    listaRetorno.add(cliente);
                }
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao abrir a conexão");
        }
        return listaRetorno;
    }

    public static boolean excluir(String CPF) {
        boolean retorno = false;
        Connection conexao = null;

        try {
            //Receita de bolo JDBC
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir conexão
            //"jdbc:mysql//localhost:3306/basenotafiscal", "root", "")
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/iclothes", "root", "");

            //Passo 3 - Criar comando SQL
            PreparedStatement comando = conexao.
                    prepareStatement("DELETE FROM cadastroCliente WHERE cpf = ?");

            comando.setString(1, CPF);


                retorno = true;

        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar com o banco");
            System.out.println(ex);
        }

        return retorno;
    }

    public static boolean alterar(String CPF, String coluna, String valor) {
        boolean retorno = false;
        Connection conexao = null;

        try {
            //Receita de bolo JDBC
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir conexão
            //"jdbc:mysql//localhost:3306/basenotafiscal", "root", "")
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/iclothes", "root", "");
            
            //Passo 3 - Criar comando SQL
            PreparedStatement comando = conexao.
                    prepareStatement("UPDATE cadastroCliente SET " + coluna +" = ? where cpf = ?");
            comando.setString(1, valor);
            comando.setString(2, CPF);

            int linhasAfetadas = comando.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar com o banco");
            System.out.println(ex);
        }

        return retorno;
    }
    
    public static ArrayList<Clientes> listarTodos() {
        ArrayList<Clientes> listaRetorno = new ArrayList();
        Connection conexao = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/iclothes";
            conexao = DriverManager.getConnection(url, "root", "");

            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * from cadastroCliente");
            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Clientes cliente = new Clientes();
                    cliente.setCPF(rs.getString("cpf"));
                    cliente.setDataNascimento(rs.getString("dataNascimento"));
                    cliente.setNome(rs.getString("nome"));
                    cliente.setEmail(rs.getString("email"));
                    cliente.setTelefone(rs.getString("telefone"));
                    cliente.setCep(rs.getString("cep"));
                    cliente.setGenero(rs.getString("genero"));
                    cliente.setEndereco(rs.getString("endereco"));
                    cliente.setCidade(rs.getString("cidade"));
                    cliente.setBairro(rs.getString("bairro"));
                    cliente.setEstado(rs.getString("estado"));
                    cliente.setEstadoCivil(rs.getString("estadoCivil"));

                    listaRetorno.add(cliente);
                }
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao abrir a conexão");
        }
        return listaRetorno;
    }

}
