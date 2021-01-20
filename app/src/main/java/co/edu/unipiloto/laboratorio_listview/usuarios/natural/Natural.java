package co.edu.unipiloto.laboratorio_listview.usuarios.natural;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import co.edu.unipiloto.laboratorio_listview.R;

public class Natural extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listActividadesNatural;
    private Intent actividades [];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_natural);

        //Inicialización de Atributos
        this.listActividadesNatural = (ListView) findViewById(R.id.actividades_natural);
        this.actividades = new Intent[]{
                new Intent(Natural.this, ServicioUbicacion.class),
                new Intent(Natural.this, ReporteSintomas.class),
                new Intent(Natural.this, ConsultaDesplazamiento.class),
                new Intent(Natural.this, ConsultaRiesgo.class),
                new Intent(Natural.this, ConsultaEstadoPerfil.class)
        };

        //Acción ListView Item
        this.listActividadesNatural.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(parent.getId() == this.listActividadesNatural.getId()) {
            startActivity(this.actividades[position]);
        }
    }
}