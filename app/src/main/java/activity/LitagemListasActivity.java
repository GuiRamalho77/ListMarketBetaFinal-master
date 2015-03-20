package activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.listmarketbeta.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

import classes.classes.DAO.DAO;
import classes.classes.DAO.listascompras;

/**
 * Created by Bruno - PC on 17/03/2015.
 */
public class LitagemListasActivity extends Activity{


    @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            // setting default screen to login.xml
            setContentView(R.layout.listagemlistascompras);


        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                .permitAll().build();
        StrictMode.setThreadPolicy(policy);

            Intent intent = getIntent();

            if(intent != null){
                Bundle params = intent.getExtras();

                if(params != null){
                    String edtemailL = params.getString("edtemailL");

                    TextView emailView = (TextView) findViewById(R.id.emailtext);

                    emailView.setText(edtemailL);


                   DAO dao = new DAO();
                   ListView listView = (ListView) findViewById(R.id.listViewlistagemlistas);

                   ArrayList<listascompras> lista = dao.buscarListasUsuario(emailView.getText().toString());
                   ArrayAdapter<listascompras> adpterLista = new ArrayAdapter<listascompras>(this, android.R.layout.simple_list_item_1, lista);
                   listView.setAdapter(adpterLista);

                    Log.d("Teste", lista.toString());


                }
            }




        }



}
