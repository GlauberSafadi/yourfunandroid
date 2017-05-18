package br.com.yourfun.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Criado por Adolfo Andrade em 18/05/2017.
 */

public class Artista implements Serializable {
    private UUID id;
    private String nome;
    private String tipo;
    private String foto;
    private String descricao;
    private String paginaOficial;
    private Date criado;
    private Date modificado;
    private boolean ativo;
    public List<GeneroArtista> generosArtistas;
    public List<ProgramacaoEvento> programacoes;

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPaginaOficial() {
        return paginaOficial;
    }

    public void setPaginaOficial(String paginaOficial) {
        this.paginaOficial = paginaOficial;
    }

    public Date getCriado() {
        return criado;
    }

    public void setCriado(Date criado) {
        this.criado = criado;
    }

    public Date getModificado() {
        return modificado;
    }

    public void setModificado(Date modificado) {
        this.modificado = modificado;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public List<GeneroArtista> getGenerosArtistas() {
        return generosArtistas;
    }

    public void setGenerosArtistas(List<GeneroArtista> generosArtistas) {
        this.generosArtistas = generosArtistas;
    }

    public List<ProgramacaoEvento> getProgramacoes() {
        return programacoes;
    }

    public void setProgramacoes(List<ProgramacaoEvento> programacoes) {
        this.programacoes = programacoes;
    }
}
