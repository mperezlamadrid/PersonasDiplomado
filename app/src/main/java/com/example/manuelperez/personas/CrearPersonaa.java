package com.example.manuelperez.personas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class CrearPersonaa extends AppCompatActivity {
    private String [] sexo;
    private Spinner cajaSexo;
    private EditText cajaCedula, cajaNombre, cajaApellido;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_personaa);

        cajaSexo = (Spinner) findViewById(R.id.cmbSexo);
        cajaCedula = (EditText)findViewById(R.id.txtCedula);
        cajaNombre = (EditText)findViewById(R.id.txtNombre);
        cajaApellido = (EditText)findViewById(R.id.txtApellido);
        res = this.getResources();

        sexo = res.getStringArray(R.array.arr_genero);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,sexo);
        cajaSexo.setAdapter(adapter);
    }

    public void crear(View v){
        String cedula, nombre, apellido;
        int sex;

        cedula = cajaCedula.getText().toString();
        nombre = cajaNombre.getText().toString();
        apellido = cajaApellido.getText().toString();
        sex = cajaSexo.getSelectedItemPosition();

        Persona p = new Persona(cedula, nombre, apellido, sex);
        p.guardar();

        Toast.makeText(this, res.getString(R.string.mensaje_guardado), Toast.LENGTH_SHORT).show();
        limpiar();
    }

    public void limpiar(View v){
        limpiar();
    }

    private void limpiar(){
        cajaCedula.setText("");
        cajaNombre.setText("");
        cajaApellido.setText("");
        cajaSexo.setSelection(0);

        cajaCedula.requestFocus();
    }
}
