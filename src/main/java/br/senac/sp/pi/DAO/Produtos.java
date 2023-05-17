/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.sp.pi.modelProdutos;

/**
 *
 * @author loren
 */
public class Produtos {
    private String peca;
    private String cor;
    private int tamanho;
    private double preco;
    private int qtd;

    public Produtos() {
    }

    public Produtos(String peca, String cor, int tamanho, double preco, int qtd) {
        this.peca = peca;
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;
        this.qtd = qtd;
    }

    public String getPeca() {
        return peca;
    }

    public void setPeca(String peca) {
        this.peca = peca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    

        
   
}
