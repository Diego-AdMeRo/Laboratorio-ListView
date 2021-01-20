package co.edu.unipiloto.laboratorio_listview.usuarios.diagnostico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import co.edu.unipiloto.laboratorio_listview.R;

public class Diagnostico extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listActividadesDiagnostico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnostico);

        //Inicialización de Atributos
        this.listActividadesDiagnostico = (ListView) findViewById(R.id.actividades_diagnostico);

        //Acción ListView Items
        this.listActividadesDiagnostico.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (parent.getId() == this.listActividadesDiagnostico.getId()){
            startActivity(new Intent(Diagnostico.this, NotificarCita.class));
        }
    }
}