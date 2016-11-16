package yourfun.repositorio;

import android.content.Context;

import java.util.List;

import yourfun.modelo.Evento;

/**
 * Created by Adolfo Andrade on 21/08/2016.
 */
public class EventoRepositorio implements Repositorio<Evento> {
    private Context _ctx;

    public  EventoRepositorio(Context ctx) {
        _ctx = ctx;
    }

    @Override
    public void Adicionar(Evento item) {
        //_ctx.getContentResolver().insert();
    }

    @Override
    public void Atualizar(Evento item) {

    }

    @Override
    public void Remover(Evento item) {

    }

    @Override
    public List<Evento> Consultar() {
        return null;
    }

    @Override
    public Evento Consultar(int id) {
        return null;
    }
}
