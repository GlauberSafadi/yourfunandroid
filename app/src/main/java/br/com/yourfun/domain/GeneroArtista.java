package br.com.yourfun.domain;

import java.io.Serializable;
import java.util.UUID;

/**
 * Criado por Adolfo Andrade em 18/05/2017.
 */

public class GeneroArtista implements Serializable {
    public UUID artistaId;
    public Artista artista;
    public UUID generoMusicalId;
    public GeneroMusical generoMusical;

    public UUID getArtistaId() {
        return artistaId;
    }

    public void setArtistaId(UUID artistaId) {
        this.artistaId = artistaId;
    }
}
