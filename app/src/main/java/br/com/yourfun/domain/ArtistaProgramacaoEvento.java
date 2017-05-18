package br.com.yourfun.domain;

import java.io.Serializable;
import java.util.UUID;

/**
 * Criado por Adolfo Andrade em 18/05/2017.
 */

public class ArtistaProgramacaoEvento implements Serializable {
    private Artista artista;
    private UUID artistaId;
    private ProgramacaoEvento programacao;
    private UUID EventsProgramingId;

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public UUID getArtistaId() {
        return artistaId;
    }

    public void setArtistaId(UUID artistaId) {
        this.artistaId = artistaId;
    }

    public ProgramacaoEvento getProgramacao() {
        return programacao;
    }

    public void setProgramacao(ProgramacaoEvento programacao) {
        this.programacao = programacao;
    }

    public UUID getEventsProgramingId() {
        return EventsProgramingId;
    }

    public void setEventsProgramingId(UUID eventsProgramingId) {
        EventsProgramingId = eventsProgramingId;
    }
}
