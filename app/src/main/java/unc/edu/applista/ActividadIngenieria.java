package unc.edu.applista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ActividadIngenieria extends AppCompatActivity {
    ImageView imgFoto;
    Button btnCambiar;
    boolean b = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ly_ingenieria);
        imgFoto = findViewById(R.id.imgFigura);
        btnCambiar = findViewById(R.id.btnCambiar);
        btnCambiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if(b=true){
                        imgFoto.setImageResource(R.drawable.logoingsis);
                        b = false;                     

                    }if (b=false){
                        imgFoto.setImageResource(R.drawable.logoing);
                        b = true;
                    }
            }
        });
    }
}