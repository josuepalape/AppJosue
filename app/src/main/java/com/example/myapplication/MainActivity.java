package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    EditText Nombre, Apellido, numero_de_targeta, MM, YY, COD, Ciudad, Estado, Codigo_Postal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nombre = (EditText) findViewById(R.id.Nombre);
        Apellido = (EditText) findViewById(R.id.apellido);
        numero_de_targeta = (EditText) findViewById(R.id.numero_targeta);
        MM = (EditText) findViewById(R.id.mes);
        YY = (EditText) findViewById(R.id.Year);
        COD = (EditText) findViewById(R.id.cod);
        Ciudad = (EditText) findViewById(R.id.ciudad);
        Estado = (EditText) findViewById(R.id.estado);
        Codigo_Postal = (EditText) findViewById(R.id.codpos);
    }

    public void Save(View v) {
        if ((validar()) == true) {
            Intent guardar = new Intent(this, MainActivity2.class);
            startActivity(guardar);
        }
    }
    public boolean validar(){
        boolean retorno = true;
        String nombre = Nombre.getText().toString();
        String apellido = Apellido.getText().toString();
        String targeta= numero_de_targeta.getText().toString();
        String mes = MM.getText().toString();
        String year = YY.getText().toString();
        String code = COD.getText().toString();
        String ciudad = Ciudad.getText().toString();
        String estado = Estado.getText().toString();
        String codpost = Codigo_Postal.getText().toString();

        char[] Target = nombre.toCharArray();
        if (nombre.isEmpty()){
            Nombre.setError("este campo no puede quedar vacio");
            retorno = false;}

        if (apellido.isEmpty()){
            Apellido.setError("este campo no puede quedar vacio");
            retorno = false;
        }
        if (targeta.isEmpty()){
            numero_de_targeta.setError("este campo no puede quedar vacio");
            retorno = false;
        }
        if (mes.isEmpty()){
            MM.setError("este campo no puede quedar vacio");
            retorno = false;
        }
        if (year.isEmpty()){
            YY.setError("este campo no puede quedar vacio");
            retorno = false;
        }
        if (code.isEmpty()){
            Codigo_Postal.setError("este campo no puede quedar vacio");
            retorno = false;
        }
        if (ciudad.isEmpty()){
            Ciudad.setError("este campo no puede quedar vacio");
            retorno = false;
        }
        if (estado.isEmpty()){
            Estado.setError("este campo no puede quedar vacio");
            retorno = false;
        }
        if (codpost.isEmpty()){
            Codigo_Postal.setError("este campo no puede quedar vacio");
            retorno = false;
        }
        return retorno;

    }
}