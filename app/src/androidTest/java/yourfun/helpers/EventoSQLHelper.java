package yourfun.helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Adolfo Andrade on 21/08/2016.
 */
public class EventoSQLHelper extends SQLiteOpenHelper {
    private static final String NOME_BANCO = "Yourfun";
    private static final int VERSAO_BANCO = 1;

    private static final String TABELA_EVENTO = "eventos";
    private static final String COLUNA_EVENTO_ID = "_id";
    private static final String COLUNA_EVENTO_TITULO = "titulo";
    private static final String COLUNA_EVENTO_BANNER = "banner";
    private static final String COLUNA_EVENTO_LOCALID = "localId";
    private static final String COLUNA_EVENTO_DESCRICAO = "descricao";
    private static final String COLUNA_EVENTO_DATA = "data";
    private static final String COLUNA_EVENTO_HORA = "hora";
    private static final String COLUNA_EVENTO_URL = "url";
    private static final String COLUNA_EVENTO_CLASSIFICACAO = "classificacao";
    private static final String COLUNA_EVENTO_PRODUTOID = "produtoId";
    private static final String COLUNA_EVENTO_CADASTRADO = "cadastrado";
    private static final String COLUNA_EVENTO_ATUALIZADO = "atualizado";
    private static final String COLUNA_EVENTO_ESTAATIVO = "estaAtivo";

    public EventoSQLHelper(Context context) {
        super(context, NOME_BANCO, null, VERSAO_BANCO);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(
                "CREATE TABLE " + TABELA_EVENTO + " (" +
                        COLUNA_EVENTO_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                        COLUNA_EVENTO_TITULO    + " TEXT NOT NULL )"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
