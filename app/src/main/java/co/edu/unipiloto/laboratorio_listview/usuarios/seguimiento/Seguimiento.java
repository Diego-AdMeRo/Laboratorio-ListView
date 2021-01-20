package co.edu.unipiloto.laboratorio_listview.usuarios.seguimiento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import co.edu.unipiloto.laboratorio_listview.R;

public class Seguimiento extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listActividades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seguimiento);

        //Inicialización de Atributos
        this.listActividades = (ListView) findViewById(R.id.actividades_seguimiento);

        //Acción ListView Item
        this.listActividades.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(parent.getId() == this.listActividades.getId()){
            if(position == 0){
                startActivity(new Intent(Seguimiento.this, MonitoreoMovimiento.class));
            }
        }
    }
}