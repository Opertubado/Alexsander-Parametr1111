package com.example.logonrm.alexsander;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;


public class ItemActivity extends AppCompatActivity {

    public ArrayAdapter<String> classe;

    private TextView tvUsuario1;
    private EditText etUsuario;
    private Button btnSalvar;
    private ListView lvClasse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        btnSalvar = (Button) findViewById(R.id.btnSalvar);
        tvUsuario1 = (TextView) findViewById(R.id.tvUsuario1);
        etUsuario = (EditText) findViewById(R.id.etUsuario);
        lvClasse = (ListView) findViewById(R.id.lvClasse);

        Bundle bundle = getIntent().getExtras();

        if(bundle.containsKey("Usuario")){
            String usuario = bundle.getString("Usuario");
            tvUsuario1.setText(usuario);
        }

        classe = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);

        lvClasse.setAdapter(classe);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String item = etUsuario.getText().toString();
                classe.add(item);

            }
        });

    }

}
