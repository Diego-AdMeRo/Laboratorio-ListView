package co.edu.unipiloto.laboratorio_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import co.edu.unipiloto.laboratorio_listview.usuarios.diagnostico.Diagnostico;
import co.edu.unipiloto.laboratorio_listview.usuarios.distrito.Distrito;
import co.edu.unipiloto.laboratorio_listview.usuarios.natural.Natural;
import co.edu.unipiloto.laboratorio_listview.usuarios.seguimiento.Seguimiento;

public class Ingreso extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listUsuarios, listActividadesComunes;
    private Intent usuarios[], actividadesComun[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso);

        //Inicialización de Atributos
        listUsuarios = (ListView) findViewById(R.id.usuarios);
        listActividadesComunes = (ListView) findViewById(R.id.actividades_comunes);

        this.usuarios = new Intent[]{
                new Intent(Ingreso.this, Natural.class),
                new Intent(Ingreso.this, Diagnostico.class),
                new Intent(Ingreso.this, Seguimiento.class),
                new Intent(Ingreso.this, Distrito.class)
        };

        this.actividadesComun = new Intent[]{
                new Intent(Ingreso.this, CambioContrasena.class),
                new Intent(Ingreso.this, Registro.class)
        };

        listUsuarios.setOnItemClickListener(this);
        listActividadesComunes.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent nuevaActividad = null;
        if(parent.getId() == listUsuarios.getId()){
            startActivity(this.usuarios[position]);
        }else if(parent.getId() == listActividadesComunes.getId()){
            startActivity(this.actividadesComun[position]);
        }
    }
}