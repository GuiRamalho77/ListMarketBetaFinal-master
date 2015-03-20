package activity;

/**
 * Created by Bruno - PC on 14/03/2015.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import classes.classes.DAO.DAO;
import classes.classes.DAO.listascompras;
import classes.classes.DAO.usuarios;

import com.listmarketbeta.R;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.ArrayList;

public class LoginActivity extends  Activity {

    public EditText edtemailL, edtsenhaL;
    public static DAO user;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setting default screen to login.xml
        setContentView(R.layout.login);

        user = new DAO();

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                .permitAll().build();
        StrictMode.setThreadPolicy(policy);

        TextView registerScreen = (TextView) findViewById(R.id.link_to_register);

        // Listening to register new account link
        registerScreen.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // Switching to Register screen
                Intent i = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(i);
            }
        });


        //-------Login----------//



        Button btnlogin = (Button) findViewById(R.id.btnLogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                edtemailL = (EditText) findViewById(R.id.edtemail);
                edtsenhaL = (EditText) findViewById(R.id.edtsenha);
                ListView listView = (ListView) findViewById(R.id.listViewlistagemlistas);


                if(user.validarUsuario(edtemailL.getText().toString(), edtsenhaL.getText().toString()) == equals(null)){

                    Toast.makeText(LoginActivity.this, "Erro", Toast.LENGTH_LONG).show();

                    //PASSAR O EMAIL COMO CHAVE PRIMARIA E PARAMETRO PARA MANTER A SESSÃO





                }else{
                    enviaParametro();
                   // Intent intent = new Intent(LoginActivity.this, LitagemListasActivity.class);
                 //   startActivity(intent);


                   // ArrayList<listascompras> lista = user.buscarListasUsuario(edtemailL.getText().toString());


                   // ArrayAdapter<listascompras> adpterLista = new ArrayAdapter<listascompras>(LoginActivity.this, R.layout.abc_screen_simple,lista);
                   // listView.setAdapter(adpterLista);

                    Toast.makeText(LoginActivity.this, "Logado", Toast.LENGTH_LONG).show();

                }





            }
        });








    }

    //INTENT PARA PASSAGEM DE PARAMETROS

    public void enviaParametro(){



        Intent intent = new Intent(this, LitagemListasActivity.class);

        Bundle params = new Bundle();
        params.putString("edtemailL", edtemailL.getText().toString());

        intent.putExtras(params);

        startActivity(intent);


    }
}
