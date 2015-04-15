package upv.periodico;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    TextView N1, N2, N3, N4;
    Button btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSalir = (Button)findViewById(R.id.btnSalir);


        N1 = (TextView) findViewById(R.id.N1);
        N2 = (TextView) findViewById(R.id.N2);
        N3 = (TextView) findViewById(R.id.N3);
        N4 = (TextView) findViewById(R.id.N4);

        N1.setText("Obama pide al Congreso de EEUU retirar a Cuba del listado de países patrocinadores del terrorismo");
        N2.setText("Asteroide del tamaño de la Estatua de la Libertad podría golpear la Tierra en 2017");
        N3.setText("Mariah Carey se pasa con el photoshop");
        N4.setText("Pumas, con calidad para jugar liguilla, advierte Cabrera");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.N1:
                ContenidoCargar.NOTA_ACTIVA = 1;
                startActivity(new Intent(MainActivity.this, Nota.class));
                break;
            case R.id.N2:
                ContenidoCargar.NOTA_ACTIVA = 2;
                startActivity(new Intent(MainActivity.this, Nota.class));
                break;
            case R.id.N3:
                ContenidoCargar.NOTA_ACTIVA = 3;
                startActivity(new Intent(MainActivity.this, Nota.class));
                break;
            case R.id.N4:
                ContenidoCargar.NOTA_ACTIVA = 4;
                startActivity(new Intent(MainActivity.this, Nota.class));
                break;
        }
    }


}
