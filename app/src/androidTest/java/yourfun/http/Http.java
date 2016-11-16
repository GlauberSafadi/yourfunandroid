package yourfun.http;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Adolfo Andrade on 21/08/2016.
 */
public class Http {
    public static final String EVENTOS_URL_JSON = "http://bills/api/Event";

    protected static HttpURLConnection conectar(String urlServidor) throws IOException {
        final int SEGUNDOS = 1000;
        URL url = new URL(urlServidor);
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        conexao.setReadTimeout(10 * SEGUNDOS);
        conexao.setConnectTimeout(15 * SEGUNDOS);
        conexao.setRequestMethod("GET");
        conexao.setDoInput(true);
        conexao.setDoOutput(false);
        conexao.connect();
        return conexao;
    }
}
