package br.com.yourfun;

import android.support.v4.view.GravityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

import br.com.yourfun.yourfun.R;

public class MainActivity extends AppCompatActivity {

    //Adapter simples temporário.
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Pegando a referencia do componente Listview
        ListView listView_eventos = (ListView) findViewById(R.id.lista_eventos_id);

        //Lista de eventos, sendo populado por itens dentro do arquivo "values > strings"
        ArrayList<String> arrayEventos = new ArrayList<>();
        arrayEventos.addAll(Arrays.asList(getResources().getStringArray(R.array.array_eventos_exemplos)));

        //Adaptando a lista de exemplo dos eventos
        adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, arrayEventos);
        listView_eventos.setAdapter(adapter);

        //Setando a toolbar
        setToolbar();
    }

    //configuração da toolbar
    public void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Yourfun!");
        getSupportActionBar().setSubtitle("- Main Menu -");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        //Inflando os menus da toolbar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        //Pegando referencia do item da pesquisa (a lupa)
        MenuItem item = menu.findItem(R.id.tb_pesquisa_id);

        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //Pegando o id do item do menu selecionado
        int itemId = item.getItemId();

        switch (itemId) {
            case R.id.ItemExemplo01_id:
                Toast.makeText(this, "Item 1 Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.ItemExemplo02_id:
                Toast.makeText(this, "Item 2 Clicked", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
