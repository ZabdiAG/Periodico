package upv.periodico;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by zabdi on 14/04/15.
 */
public class Nota extends ActionBarActivity {
    TextView  titulo, contenido;
    Button regresar;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nota);
        titulo = (TextView) findViewById(R.id.titulo);
        contenido = (TextView) findViewById(R.id.contenido);
        this.cargarContenido();
        regresar = (Button) findViewById(R.id.btnRegresar);

    }
    public void cargarContenido(){
        switch (ContenidoCargar.NOTA_ACTIVA){
            case 1:
                titulo.setText(ContenidoCargar.titulo1);
                contenido.setText(ContenidoCargar.content1);
                break;
            case 2:
                titulo.setText(ContenidoCargar.titulo2);
                contenido.setText(ContenidoCargar.content2);
                break;
            case 3:
                titulo.setText(ContenidoCargar.titulo3);
                contenido.setText(ContenidoCargar.content3);
                break;
            case 4:
                titulo.setText(ContenidoCargar.titulo4);
                contenido.setText(ContenidoCargar.content4);
                break;
        }


    }

    public void regresar(View view){
        switch (view.getId()){
            case R.id.btnRegresar:
                startActivity(new Intent(Nota.this,MainActivity.class));
                break;
        }
    }



}
