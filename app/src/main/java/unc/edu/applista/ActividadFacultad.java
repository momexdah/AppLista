package unc.edu.applista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import unc.edu.applista.modelo.Facultades;

public class ActividadFacultad extends AppCompatActivity {
    TextView lbTituloFacultad, lbDescripcion;
    ImageView imgLogoFacultad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ly_facultad);
        //Recibir los parámetros
        Bundle identificador = getIntent().getExtras();
        //String titulo = identificador.getString("titulo");
        //int indice = identificador.getInt("indice");
        Facultades objFacultad = (Facultades) identificador.getSerializable("objFacultad");
        lbTituloFacultad = findViewById(R.id.lbTituloFacultad);
        imgLogoFacultad = findViewById(R.id.imgLogoFacultad);
        lbDescripcion = findViewById(R.id.lbDescripcion);
        lbTituloFacultad.setText(objFacultad.getTitulo());
        switch(objFacultad.getIndice()){
            case 0:
                imgLogoFacultad.setImageResource(R.drawable.logoing);
                break;
            case 1:
                imgLogoFacultad.setImageResource(R.drawable.logoagronomia);
            break;
        }
        lbDescripcion.setText(objFacultad.getDescripcion());
    }
}