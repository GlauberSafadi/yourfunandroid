package br.com.yourfun.domain;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by Glauber on 19/05/2017.
 */

public class Usuario implements Serializable {

    //Attributes
    private UUID id;
    private String nome;
    private String sobrenome;
    private String login;
    private String senha;

    //Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
