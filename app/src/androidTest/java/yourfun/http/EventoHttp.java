package yourfun.http;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.net.HttpURLConnection;
import java.util.List;

import yourfun.modelo.Evento;

/**
 * Created by Adolfo Andrade on 21/08/2016.
 */
public class EventoHttp extends Http {

    public static boolean temConexao(Context ctx) {
        ConnectivityManager cm = (ConnectivityManager) ctx.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = cm.getActiveNetworkInfo();
        return (info != null && info.isConnected());
    }

    public static List<Evento> carregarEventosJSON() {
        try {
            HttpURLConnection conexao = conectar(EVENTOS_URL_JSON);

            int resposta = conexao.getResponseCode();
            if(resposta == HttpURLConnection.HTTP_OK) {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}
