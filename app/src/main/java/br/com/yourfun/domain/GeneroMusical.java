package br.com.yourfun.domain;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

/**
 * Criado por Adolfo Andrade em 18/05/2017.
 */

public class GeneroMusical implements Serializable {
    public UUID id;
    public String nome;
    public List<GeneroArtista> generosArtistas;

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

    public List<GeneroArtista> getGenerosArtistas() {
        return generosArtistas;
    }

    public void setGenerosArtistas(List<GeneroArtista> generosArtistas) {
        this.generosArtistas = generosArtistas;
    }
}
