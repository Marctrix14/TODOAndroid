package org.udg.pds.todoandroid.activity;

import androidx.appcompat.app.AppCompatActivity;
import org.udg.pds.todoandroid.R;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        final EditText et = (EditText)findViewById(R.id.editText);
        Button btn = (Button)findViewById(R.id.button2);
        /* Retornar resultat (PART 1)
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TestActivity.this, et.getText().toString(),
                    Toast.LENGTH_LONG).show();
            }
        }); */
        // Retornar resultat (PART 2) - Enviar el resultat a l'activitat NavDrawerActivity
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.putExtra("result", et.getText().toString());
                setResult(Activity.RESULT_OK, i);
                finish(); // tornem a l'activitat anterior, es treu de la pila l'activitat actual
            }
        });


    }
}
