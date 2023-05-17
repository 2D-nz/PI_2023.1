/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.sp.pi.model;

/**
 *
 * @author denis
 */
public class Clientes {
    private String genero;
    private String nome;
    private String endereco;
    private String dataNascimento;
    private String bairro;
    private String estado;
    private String estadoCivil;
    private String cep;
    private String email;
    private String telefone;

    public String getGenero() {
        return genero;
    }

    public Clientes(String genero, String nome, String endereco, String dataNascimento, String bairro, String estado, String estadoCivil, String cep, String email, String telefone) {
        this.genero = genero;
        this.nome = nome;   
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.bairro = bairro;
        this.estado = estado;
        this.estadoCivil = estadoCivil;
        this.cep = cep;
        this.email = email;
        this.telefone = telefone;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
 
    
    
}
