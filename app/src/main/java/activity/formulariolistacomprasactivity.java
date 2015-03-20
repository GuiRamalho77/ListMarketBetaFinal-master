package activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.listmarketbeta.R;

import classes.classes.DAO.DAO;
import classes.classes.DAO.listascompras;

/**
 * Created by bruno on 11/03/15.
 */
public class formulariolistacomprasactivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario_listascompras);
        if(Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                    .permitAll().build();
            StrictMode.setThreadPolicy(policy);

        }


        final EditText edtNomeLista = (EditText) findViewById(R.id.editText8);
        Button salvarlista = (Button) findViewById(R.id.salvarlistascompras);

        salvarlista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DAO dao = new DAO();
               // dao.inserirListas(new listascompras(0,edtNomeLista.getText().toString()));




            }
        });





    }
}
