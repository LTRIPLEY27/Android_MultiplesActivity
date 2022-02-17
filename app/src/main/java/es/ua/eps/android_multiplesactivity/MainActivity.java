package es.ua.eps.android_multiplesactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //ATRIBUTOS GLOBALES
    Button inicia = (Button) findViewById(R.id.botonEnter);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicia.setOnClickListener(this);
    }
//MÉTODO LISTENER QUE CONTIENE LA ACCIÓN
    @Override
    public void onClick(View act) {
        //setContentView(R.layout.activity_segundactivity);
    }
}