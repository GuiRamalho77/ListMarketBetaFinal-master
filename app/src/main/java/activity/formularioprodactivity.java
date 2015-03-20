package activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.listmarketbeta.R;

import classes.classes.DAO.DAO;
import classes.classes.DAO.listascompras;
import classes.classes.DAO.produtos;

/**
 * Created by bruno on 11/03/15.
 */
public class formularioprodactivity  extends Activity{


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario_produtos);
        if (Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                    .permitAll().build();
            StrictMode.setThreadPolicy(policy);

        }


        final EditText edtnome = (EditText) findViewById(R.id.produto);
        final EditText edtpreco = (EditText) findViewById(R.id.preco);
        final  EditText edtquantidade = (EditText) findViewById(R.id.quantidade);
        final EditText edtlista = (EditText) findViewById(R.id.editText9);

        Button salvarproduto = (Button) findViewById(R.id.salvarproduto);

        salvarproduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DAO dao = new DAO();



            }
        });






    }
}
