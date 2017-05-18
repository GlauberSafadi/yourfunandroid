package br.com.yourfun.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Criado por Adolfo Andrade em 18/05/2017.
 */

public class Ingresso implements Serializable {
    public String nome;
    public String tipo;
    public String genero;
    public int quantidade;
    public double valor;
    public UUID programacaoEventoId;
    public Date criado;
    public Date modificado;
    public boolean ativo;
    public ProgramacaoEvento programacaoEvento;
    public List<LocalParaComprarIngresso> locaisParaComprarIngressos;

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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public UUID getProgramacaoEventoId() {
        return programacaoEventoId;
    }

    public void setProgramacaoEventoId(UUID programacaoEventoId) {
        this.programacaoEventoId = programacaoEventoId;
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

    public ProgramacaoEvento getProgramacaoEvento() {
        return programacaoEvento;
    }

    public void setProgramacaoEvento(ProgramacaoEvento programacaoEvento) {
        this.programacaoEvento = programacaoEvento;
    }

    public List<LocalParaComprarIngresso> getLocaisParaComprarIngressos() {
        return locaisParaComprarIngressos;
    }

    public void setLocaisParaComprarIngressos(List<LocalParaComprarIngresso> locaisParaComprarIngressos) {
        this.locaisParaComprarIngressos = locaisParaComprarIngressos;
    }
}
