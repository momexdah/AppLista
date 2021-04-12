package unc.edu.applista;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import unc.edu.applista.modelo.Facultades;

public class MainActivity extends ListActivity {
    String [] facultades = {"Facultad de Ingeniería","Facultad de Medicina","Facultad de CECA","Facultad de Ciencias sociales"
            ,"Facultad de Ciencias de la Salud","Facultad de Ciencias Veterinarias","Facultad de Ciencias Agrarias"};
    String [] facultadeDesc = {"La mejor facultas que forma profesionales de las ciencias","Forma profesionales en el rubro del agro","forman profesionales que administran las empresas",
    ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        Log.d("Estado","Creación");
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,facultades));

    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Estado","Ejecución");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("Estado","Pausado");

    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Estado","Detenido");
        //if(isFinishing())
          //  Log.d("Estado","Finalización");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("Estado","Reinicio");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Estado","Inicio");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Estado","Finalización");
    }


    @Override
    protected void onListItemClick(ListView l, View v, int i, long id){
        super.onListItemClick(l,v,i,id);
        Toast.makeText(this,"Elemento: " + facultades[i],Toast.LENGTH_SHORT).show();
       /* try {
            Class<?> oClaseDestino = Class.forName("unc.edu.applista.Actividad"+facultades[i]);
            Intent oIntento = new Intent(this,oClaseDestino);*/
            Intent oIntento = new Intent(this, ActividadFacultad.class);
            String tituloFacultad = facultades[i];
           /*oIntento.putExtra("titulo",tituloFacultad);
            oIntento.putExtra("indice",i);
            oIntento.putExtra("descripcion","Facultad de Ingeniería...");*/
            //Enviar parametros de tipo objetos
            Facultades oFacultad = new Facultades(tituloFacultad,i,facultadeDesc[i]);
            oIntento.putExtra("objFacultad", oFacultad);
            startActivity(oIntento);
       /* } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

    }

}