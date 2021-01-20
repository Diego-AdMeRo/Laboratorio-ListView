package co.edu.unipiloto.laboratorio_listview.usuarios.distrito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import co.edu.unipiloto.laboratorio_listview.R;

public class Distrito extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listActividadesDistrito;
    private Intent actividades[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distrito);

        //Incialización Atributos
        this.listActividadesDistrito = (ListView) findViewById(R.id.actividades_distrito);
        this.actividades = new Intent[]{
                new Intent(Distrito.this, ReporteResultados.class),
                new Intent(Distrito.this, ReporteZona.class)
        };

        //Acciones ListView Items
        this.listActividadesDistrito.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(parent.getId() == this.listActividadesDistrito.getId()){
            startActivity(this.actividades[position]);
        }
    }
}