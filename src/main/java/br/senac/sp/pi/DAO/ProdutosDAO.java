/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.sp.pi.daoProdutos;
    
import br.senac.sp.pi.modelProdutos.Produtos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author loren
 */
public class ProdutosDAO {
    
    public static boolean salvar(Produtos obj){
        
        boolean retorno = false;
        Connection conexao = null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/iclothes";
            
            
            conexao = DriverManager.getConnection(url, "root", "dede@2102");
            
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO cadastroproduto " + 
                    "(idProduto, peca, cor, tamanho, preco, qtd) VALUES(?,?,?,?,?,?)");
            
            comandoSQL.setInt(1, obj.getIdProduto());
            comandoSQL.setString(2, obj.getPeca());
            comandoSQL.setString(3, obj.getCor());
            comandoSQL.setString(4, obj.getTamanho());
            comandoSQL.setDouble(5, obj.getPreco());
            comandoSQL.setInt(6, obj.getQtd());
            
            
            int linhasAfetadas = comandoSQL.executeUpdate();
            
            if(linhasAfetadas>0){
                retorno = true;
            }
                    
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao abrir a conexão");
        }
        
        
        
        
        return retorno;
        
    }
    
    public static ArrayList<Produtos> listar(){
        ArrayList<Produtos> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3306/iclothes";
            conexao = DriverManager.getConnection(url, "root","dede@2102");
            
            PreparedStatement comandoSQL =
            conexao.prepareStatement("SELECT * FROM cadastroproduto");
            
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){
                while(rs.next()){
                    Produtos obj = new Produtos();
                    obj.setIdProduto(rs.getInt("idProduto"));
                    obj.setPeca(rs.getString("peca"));
                    obj.setCor(rs.getString("cor"));
                    obj.setTamanho(rs.getString("tamanho"));
                    obj.setPreco(rs.getDouble("preco"));
                    obj.setQtd(rs.getInt("qtd"));
                    
                    listaRetorno.add(obj);
                }
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao abrir conexão");
        }
        
        return listaRetorno;
    } public static boolean excluir(int IdProduto){
        
        boolean retorno = false;
        Connection conexao = null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/iclothes";
            
            
            conexao = DriverManager.getConnection(url, "root", "dede@2102");
            
            PreparedStatement comandoSQL = 
                    conexao.prepareStatement("DELETE FROM cadastroproduto WHERE idProduto =?");
            
            comandoSQL.setInt(1, IdProduto);

            int linhasAfetadas = comandoSQL.executeUpdate();
            
            if(linhasAfetadas>0){
                retorno = true;
            }
                    
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao abrir a conexão");
        }
 
        
        return retorno;
}       
    public static boolean alterar(Produtos obj){
         
        boolean retorno = false;
        Connection conexao = null;
        
        try {
            //Receita de bolo JDBC
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Passo 2 - Abrir conexão
            //"jdbc:mysql//localhost:3306/basenotafiscal", "root", "")
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/iclothes", "root", "dede@2102");
            
            //Passo 3 - Criar comando SQL
            PreparedStatement comando = conexao.
                    prepareStatement("UPDATE cadastroproduto SET peca=?, cor=?, tamanho=?, preco=?, qtd=? WHERE idProduto=?");
            
            //Passo 4 - Executar comando SQL
            comando.setString(1, obj.getPeca());
            comando.setString(2, obj.getCor());
            comando.setString(3, obj.getTamanho());
            comando.setDouble(4, obj.getPreco());
            comando.setInt(5, obj.getQtd());
            comando.setInt(6, obj.getIdProduto());
            
            int linhasAfetadas = comando.executeUpdate();
            
            if(linhasAfetadas>0){
                retorno = true;
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar com o banco");
        }
        
        
        return retorno;
         
     }
    
    
}
