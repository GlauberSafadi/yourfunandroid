package br.com.yourfun.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Criado por Adolfo Andrade em 18/05/2017.
 */

public class Evento implements Serializable {
    private UUID id;
    private String titulo;
    private String banner;
    private String mapa;
    private String descricao; private String url;
    private Date criado;
    private Date modificado;
    private boolean ativo;
    private List<ProgramacaoEvento> programacoes;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getMapa() {
        return mapa;
    }

    public void setMapa(String mapa) {
        this.mapa = mapa;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public List<ProgramacaoEvento> getProgramacoes() {
        return programacoes;
    }

    public void setProgramacoes(List<ProgramacaoEvento> programacoes) {
        this.programacoes = programacoes;
    }
}
