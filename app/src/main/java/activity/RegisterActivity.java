package activity;

/**
 * Created by Bruno - PC on 14/03/2015.
 */

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.listmarketbeta.R;

import java.util.ArrayList;
import java.util.List;

import classes.classes.DAO.DAO;
import classes.classes.DAO.cidades;


public class RegisterActivity extends Activity implements AdapterView.OnItemSelectedListener {

    private String[] sipnercidades = new String[]{"Teste"};


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set View to register.xml
        setContentView(R.layout.register);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                .permitAll().build();
        StrictMode.setThreadPolicy(policy);

        //Registrar
        TextView loginScreen = (TextView) findViewById(R.id.link_to_login);

        // Listening to Login Screen link
        loginScreen.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // Closing registration screen
                // Switching to Login Screen/closing register screen
                finish();
            }
        });




        //------Spinner-------///



        DAO dao = new DAO();

        List<cidades> sipnercidades = dao.listarcidades();


        ArrayAdapter<cidades> adaptercidades = new ArrayAdapter<cidades>(this, R.layout.support_simple_spinner_dropdown_item, sipnercidades);


        adaptercidades.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        Spinner spinner = (Spinner) findViewById(R.id.spinercidade);

        spinner.setAdapter(adaptercidades);


      }

    public void onItemSelected(AdapterView<?> parent, View view, int position,
                               long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }


 }








