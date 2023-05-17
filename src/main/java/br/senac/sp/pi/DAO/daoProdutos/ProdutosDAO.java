/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.sp.pi.daoProdutos;

import br.senac.sp.pi.modelProdutos.Produtos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
               
               PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO cadastroproduto" + 
                       "(peca, cor, tamanho, preco, qtd) VALUES(?,?,?,?,?)");
               
               
               comandoSQL.setString(1, obj.getPeca());
               comandoSQL.setString(2, obj.getCor());
               comandoSQL.setInt(3, obj.getTamanho());
               comandoSQL.setDouble(4, obj.getPreco());
               comandoSQL.setInt(5, obj.getQtd());
               
               int linhasAfetadas = comandoSQL.executeUpdate();
               
               if(linhasAfetadas>0){
                retorno = true;
            }
        
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao abrir a conexao");
        }
        return retorno;
        
        
    }
    
}
