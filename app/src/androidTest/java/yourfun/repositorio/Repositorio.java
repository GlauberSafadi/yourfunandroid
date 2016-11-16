package yourfun.repositorio;

import java.util.List;

/**
 * Created by Adolfo Andrade on 21/08/2016.
 */
public interface Repositorio<T> {
    void Adicionar(T item);

    void Atualizar(T item);

    void Remover(T item);

    List<T> Consultar();

    T Consultar(int id);
}
